package com.example.pasing_data_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView n = (TextView) findViewById(R.id.texthasil);
        TextView a = (TextView) findViewById(R.id.texthasil2);
        TextView p = (TextView) findViewById(R.id.texthasil3);
        Bundle bundle=getIntent().getExtras();
        String m =bundle.getString("nama");
        n.setText(m);
        String l =bundle.getString("alamat");
        a.setText(l);
        String e =bundle.getString("pesanan");
        p.setText(e);
        cancel =(Button) findViewById(R.id.btncancel);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent cancel = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(cancel);
    }
}
