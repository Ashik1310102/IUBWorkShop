package com.example.ashik.iubworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView HpTvEmail;
    Button HpBtLogOut;
    LogerInfo logerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        HpTvEmail = findViewById(R.id.HpTvEmail);
        HpBtLogOut = findViewById(R.id.HpBtLogOut);

        HpBtLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logerInfo.Remove();
                Intent intent = new  Intent(HomePage.this,LoginPage.class);
                startActivity(intent);
                finish();
            }
        });

        logerInfo = new LogerInfo(getApplicationContext());

        HpTvEmail.setText(logerInfo.getLiEmail());

    }
}
