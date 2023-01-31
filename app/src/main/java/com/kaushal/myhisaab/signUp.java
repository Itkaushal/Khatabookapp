package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class signUp extends AppCompatActivity {
    EditText et_name;
    EditText et_email;
    EditText et_mobile;
    EditText et_password;
    Button btn_sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
      et_name =  findViewById(R.id.et_name);
       et_email = findViewById(R.id.et_email);
       et_mobile = findViewById(R.id.et_mobile);
       et_password = findViewById(R.id.et_password);
       btn_sign = findViewById(R.id.btn_sign);
        getSupportActionBar().hide();
       btn_sign.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(signUp.this,main4.class);
               startActivity(i);
           }
       });

        }

    }