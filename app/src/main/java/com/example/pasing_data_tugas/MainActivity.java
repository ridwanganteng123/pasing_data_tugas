package com.example.pasing_data_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private int LamaTampilSplash = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent oke_gofood  = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(oke_gofood);

                finish();

            }

        }, LamaTampilSplash);
    }
}