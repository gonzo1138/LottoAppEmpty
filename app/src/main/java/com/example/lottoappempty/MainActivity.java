package com.example.lottoappempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.plain_text_input);
        //editText.setHint("your lotto tip");

        final TextView textView = (TextView) findViewById(R.id.textView);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                String s = editText.getText().toString();

                // char c = Character.toChars(i)[0];
                // String s = Integer.toString(i);
                if (s == "") textView.setText("XX");
                else textView.setText(s);
                return false;
            }
        });

       /*/*     @Override
            public void onClick(View v) {

            }

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        */

        }
}