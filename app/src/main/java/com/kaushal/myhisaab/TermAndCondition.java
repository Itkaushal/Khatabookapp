package com.kaushal.myhisaab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TermAndCondition extends AppCompatActivity {
    private String terms_url = "https://docs.google.com/gview?embedded=true&url=https://myhisab.seeksolution.in/terms-and-conditions/terms.pdf";

    private WebView wv_terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_term_and_condition);
        wv_terms = (WebView)  findViewById(R.id.wv_terms);

        wv_terms.setWebViewClient(new WebViewClient());
        wv_terms.loadUrl(terms_url);
        //javascript enabled

        wv_terms.getSettings().setJavaScriptEnabled(true);
        wv_terms.getSettings().setSupportZoom(true);
        getSupportActionBar().hide();
    }
}

