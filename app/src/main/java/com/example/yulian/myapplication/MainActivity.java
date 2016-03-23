package com.example.yulian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity  {
    TextView textView3;
    TextView textView;
    Button button;
    Button button4;
    Button button2;
    EditText editText;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView3);
        editText= (EditText) findViewById(R.id.editText);
        editText3= (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button4 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button2);
        button4.setEnabled(true);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.button2) {
                    String str = editText.getText().toString();

                    Intent i = new Intent(MainActivity.this, Log_in.class);
                    i.putExtra("Username", str);
                    startActivity(i);
                }
            }
        });




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.button2)
                {
                    Intent i = new Intent(MainActivity.this , Sign_up.class);
                    startActivity(i);
                }
            }
        });




        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


}
