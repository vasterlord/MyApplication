package com.example.yulian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yulian on 23.03.2016.
 */
public class Log_in extends Activity {
    TextView textView9;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        String username = getIntent().getStringExtra("Username");
        textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(username);

    }
}
