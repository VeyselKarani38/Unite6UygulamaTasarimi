package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uyg3Activity extends AppCompatActivity {

    EditText txtadsoyad,txttelefon;
    Button btndiger;

    public void tanimlamalar() {
        txtadsoyad = findViewById(R.id.txtad);
        txttelefon = findViewById(R.id.txttel);
        btndiger = findViewById(R.id.btndiger);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg3);
        tanimlamalar();
        btndiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adsoyad= txtadsoyad.getText().toString();
                String telefonno=txttelefon.getText().toString();
                Intent i=new Intent(Uyg3Activity.this,bilgiişlemActivity.class);
                i.putExtra("kadi",adsoyad);
                i.putExtra("telefonno",telefonno);
                startActivity(i);
            }
        });
    }

}