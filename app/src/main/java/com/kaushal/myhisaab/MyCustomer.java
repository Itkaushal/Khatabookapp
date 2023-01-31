package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyCustomer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_customer);
        getSupportActionBar().hide();
    }
}