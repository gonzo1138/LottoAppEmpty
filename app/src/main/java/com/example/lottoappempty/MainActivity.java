package com.example.lottoappempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final KLotto kl = new KLotto(49, 3);

        final TextView lotto_output = (TextView) findViewById(R.id.lotto_output);

        final Button play_button = (Button) findViewById(R.id.play_button);
        final TextView lottotip = (TextView) findViewById(R.id.lottotip);

        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                KugelList lottotipsplitted = new KugelList();
                //String lottotiptext = lottotip.getText().toString();
                //List<String> ls = Arrays.asList(lottotiptext.split(","));
                lottotipsplitted.addList(Arrays.asList(lottotip.getText().toString().split(",")));

                //Kugellist lottotip = new Kugellist();
                LottoZiehungenList lottoZiehungenList = new LottoZiehungenList();
                //lotto_output.setText(gezogeneKugeln.getAllNummernAsString());
                lottoZiehungenList.add(kl.lottoziehung());

                int count = lottotipsplitted.countOfEqualKugelNummernWith(lottoZiehungenList.getLetzteZeihung());
                //lotto_output.setText(gezogeneKugeln.getAllNummernAsString());
                lotto_output.setText("Lottoziehung: " + kl.getLetzteLottoziehung().getAllNummernAsString() + "\t Tip: " + lottotipsplitted.getAllNummernAsString() + "\t Gemeinsame Nummern: " + count);

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