package com.example.projectapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

              Intent intent=new Intent(MainActivity.this,Main2Activity.class);
              startActivity(intent);
            finish();

            }
        }, SPLASH_TIME);




    }


}