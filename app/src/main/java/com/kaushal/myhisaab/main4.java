package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class main4 extends AppCompatActivity{
    ImageView print_invoice;
    ImageView Term_condition;
    ImageView iv_2;
    ImageView iv_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        getSupportActionBar().hide();
    }

    public void print_invoice(View view) {
        startActivity(new Intent(main4.this,TransactionHistory.class));
    }

    public void Term_condition(View view) {
        startActivity(new Intent(main4.this,TermAndCondition.class));
    }

    public void enquiary(View view) {
        startActivity(new Intent(main4.this,CreditDebit.class));
    }

    public void admin(View view) {
        startActivity(new Intent(main4.this,profile.class));
    }

    public void searchcustomer(View view) {
        startActivity(new Intent(main4.this,main6.class));
    }
}

