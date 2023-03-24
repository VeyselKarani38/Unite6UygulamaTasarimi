package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bilgiişlemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg3bilgi);
        Intent sa = getIntent();
        String ad = sa.getStringExtra("kadi");
        String tel = sa.getStringExtra("telefonno");
        TextView kadi = findViewById(R.id.kadi);
        TextView tel2 = findViewById(R.id.pass);
        kadi.setText(ad);
        tel2.setText(tel);
    }
}
