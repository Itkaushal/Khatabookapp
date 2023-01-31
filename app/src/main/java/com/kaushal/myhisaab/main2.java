package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class main2 extends AppCompatActivity {
TextView tv_1;
TextView tv_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_1=(TextView) findViewById(R.id.tv_1);
        tv_2=(TextView) findViewById(R.id.tv_2);
        getSupportActionBar().hide();
        }
    public void Login(View view) {
        startActivity(new Intent(main2.this,LoginActivity.class));
    }

    public void signIn(View view) {
        startActivity(new Intent(main2.this,signUp.class));
    }
}