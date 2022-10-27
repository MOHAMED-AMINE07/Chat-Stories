package com.example.chatstores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnLogin = findViewById(R.id.login);


    }

    public void openLogin(View view) {
        Intent openLogin = new Intent(this,singLogin.class);
        startActivity(openLogin);
    }
}