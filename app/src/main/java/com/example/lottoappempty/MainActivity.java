package com.example.lottoappempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static KugelList lottoTrommel = new KugelList();
    public static KugelList gezogeneKugeln = new KugelList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final KLotto kl = new KLotto(lottoTrommel, gezogeneKugeln);

        final TextView lotto_output = (TextView) findViewById(R.id.lotto_output);

        final Button play_button = (Button) findViewById(R.id.play_button);

        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                //lotto_output.setText(gezogeneKugeln.getAllNummernAsString());
                kl.lottoziehung();
                //lotto_output.setText(gezogeneKugeln.getAllNummernAsString());
                lotto_output.setText(kl.getLetzteLottoziehung().getAllNummernAsString());
            }
        });

        //final EditText editText = (EditText) findViewById(R.id.plain_text_input);
        //editText.setHint("your lotto tip");   --> in xml umgesetzt


        /*
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                String s = editText.getText().toString();
                // char c = Character.toChars(i)[0];
                // String s = Integer.toString(i);
                //textView.setText(s);

                return false;
            }
        });
        */

       /*     @Override
            public void onClick(View v) {

            }

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        */

        }
}