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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity   {
    DatabaseHelper helper = new DatabaseHelper(this);
    TextView textView3;
    TextView textView;
    Button button;
    Button button2;
    EditText editText;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView3);
        editText = (EditText) findViewById(R.id.editText);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        // button.setOnClickListener(this);
        // button2.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.button) {
                    String str = editText3.getText().toString();
                    String pass = editText.getText().toString();
                    String password = helper.searchPass(str);
                    if (pass.equals(password)) {
                        Intent i = new Intent(MainActivity.this, Log_in.class);
                        i.putExtra("Username", str);
                        startActivity(i);
                    } else {
                        Toast temp = Toast.makeText(MainActivity.this, "Usename and password dont mutch", Toast.LENGTH_SHORT);
                        temp.show();
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
                       @Override
                        public void onClick(View v) {
                           Intent i = new Intent(MainActivity.this, Sign_up.class);
                               startActivity(i);
                                  }
                    });

    }
}
    // @Override

  //  public void onClick(View v) {
      //  switch (v.getId())
      //  {
          //  case R.id.button2:
        //        Intent i = new Intent(MainActivity.this, Sign_up.class);
          //      startActivity(i);
              //  break;
          //  case R.id.button:
          //      String str = editText3.getText().toString();
         //      String pass = editText.getText().toString();
    //    String password = helper.searchPass(str);
    //          if (!pass.equals(password))
            //          {
            //      Intent y = new Intent(MainActivity.this, Log_in.class);
        //      y.putExtra("Username", str);
    //          startActivity(y);
    //          }
    //          else
            //          {
            //      Toast temp = Toast.makeText(MainActivity.this, "Usename and password dont mutch", Toast.LENGTH_SHORT);
    //      temp.show();
    //          }
    //          break;
    //  }
    //  }
//}
