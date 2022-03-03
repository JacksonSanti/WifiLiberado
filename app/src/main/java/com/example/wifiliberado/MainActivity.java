package com.example.wifiliberado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.window.SplashScreenView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int splashTimer = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                startActivity(intent);
            }
        },splashTimer * 1000);


    }

}