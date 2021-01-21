package com.example.ashik.iubworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    EditText LgEtEmail;
    Button LgBtSubmit;
    LogerInfo logerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        LgEtEmail = findViewById(R.id.LgEtEmail);
        LgBtSubmit = findViewById(R.id.LgBtSubmit);
        logerInfo= new LogerInfo(getApplicationContext());

        LgBtSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                logerInfo.setLiEmail(LgEtEmail.getText().toString());

                Intent intent = new Intent(LoginPage.this,HomePage.class);
                startActivity(intent);

            }
        });
    }
}
