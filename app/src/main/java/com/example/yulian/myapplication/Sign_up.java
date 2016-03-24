package com.example.yulian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Yulian on 23.03.2016.
 */
public class Sign_up extends Activity implements View.OnClickListener {
    DatabaseHelper helper = new DatabaseHelper(this);
    TextView textView2;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button3) {
            textView2 = (TextView) findViewById(R.id.textView2);
            textView4 = (TextView) findViewById(R.id.textView4);
            textView5 = (TextView) findViewById(R.id.textView5);
            textView6 = (TextView) findViewById(R.id.textView6);
            textView7 = (TextView) findViewById(R.id.textView7);
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            EditText editText4 = (EditText) findViewById(R.id.editText4);
            EditText editText5 = (EditText) findViewById(R.id.editText5);
            EditText editText6 = (EditText) findViewById(R.id.editText6);
            EditText editText7 = (EditText) findViewById(R.id.editText7);
            String namestr = editText2.getText().toString();
            String emailstr = editText4.getText().toString();
            String unamestr = editText7.getText().toString();
            String pass1str = editText5.getText().toString();
            String pass2str = editText6.getText().toString();
            if (!pass1str.equals(pass2str)) {
                Toast pass = Toast.makeText(Sign_up.this, "Password dont mutch", Toast.LENGTH_SHORT);
                pass.show();
            } else {
                Contact c = new Contact();
                c.setName(namestr);
                c.setUname(unamestr);
                c.setEmail(emailstr);
                c.setPass(pass1str);
                helper.insertContact(c);

            }
        }
    }
}
