package com.example.ashik.iubworkshop;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class SpPage extends AppCompatActivity {

    LogerInfo logerInfo;
    ImageView IvImage;
    TextView TvL;

    WebView WvGoogle;

    @Override
    public void onBackPressed() {

        if (WvGoogle.canGoBack())
        {
            WvGoogle.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_page);

        WvGoogle = findViewById(R.id.WvGoogle);

        WvGoogle.loadUrl("http://google.com/");
        WvGoogle.setWebViewClient(new WebViewClient());

        WebSettings webSettings = WvGoogle.getSettings();
        webSettings.setJavaScriptEnabled(true);


//        IvImage = findViewById(R.id.IvImage);
//        TvL = findViewById(R.id.TvL);
//
//        logerInfo = new LogerInfo(getApplicationContext());
//
//
//        IvImage.animate().scaleX(5)
//                .scaleY(5).setDuration(3000);
//


//
//        new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//
//
//
//
//                        if (!logerInfo.getLiEmail().isEmpty())
//                        {
//                            Intent intent = new Intent(SpPage.this,HomePage.class);
//                            startActivity(intent);
//                        }
//                        else
//                        {
//                            Intent intent1 = new Intent(SpPage.this,LoginPage.class);
//                            startActivity(intent1);
//                        }
//
//                finish();
//            }
//        },5000);


    }
}
