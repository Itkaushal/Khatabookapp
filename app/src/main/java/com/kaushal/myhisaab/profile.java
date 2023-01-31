package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    private TextView pro_mycustomer, pro_updateProfile, pro_changepassword, pro_contactus, pro_myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        getSupportActionBar().hide();
        }



    public void updateprofile(View view) {
        startActivity(new Intent(profile.this,updateprofile.class));
    }

    public void changepassword(View view) {
        startActivity(new Intent(profile.this,ChangePasword.class));
    }

    public void myprofile(View view) {
    }
}