package com.example.pasing_data_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button btnorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText) findViewById(R.id.alamat);
        final EditText pesanan = (EditText) findViewById(R.id.pesanan);
        btnorder = (Button) findViewById(R.id.btnorder);
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                i.putExtra("nama",nama.getText().toString());
                i.putExtra("alamat",alamat.getText().toString());
                i.putExtra("pesanan",pesanan.getText().toString());
                startActivity(i);
            }
        });

    }
}
