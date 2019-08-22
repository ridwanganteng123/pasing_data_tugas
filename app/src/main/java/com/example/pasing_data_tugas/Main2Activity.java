package com.example.pasing_data_tugas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton gofood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gofood = (ImageButton) findViewById(R.id.gofood);
        gofood.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent gofood = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(gofood);
    }
}
