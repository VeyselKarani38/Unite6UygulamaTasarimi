package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Uyg1Activity extends AppCompatActivity {
    Button ileri, geri;
    TextView bilgi;
    ImageView resim;
    int sayac = 0;
    public void tanimlamalar() {
        ileri = findViewById(R.id.uyg1IleriBtn);
        geri = findViewById(R.id.Uyg1GeriBtn);
        bilgi = findViewById(R.id.Uyg1BilgiLbl);
        resim = findViewById(R.id.Uyg1Resim);
    }
    ArrayList<Uyg1Class> resimList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg1);

        tanimlamalar();

        Uyg1Class resim1 = new Uyg1Class("Sarı Balon",1,R.drawable.resim1);
        Uyg1Class resim2 = new Uyg1Class("Mavi Çiçek",2,R.drawable.resim2);
        Uyg1Class resim3 = new Uyg1Class("Mavi Kelebek",3,R.drawable.resim3);
        Uyg1Class resim4 = new Uyg1Class("Yuvada Kuş",4,R.drawable.resim4);

        resimList.add(resim1);
        resimList.add(resim2);
        resimList.add(resim3);
        resimList.add(resim4);

        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayac < 4 && sayac >= 0) {
                    resim.setImageResource(resimList.get(sayac).resim);
                    bilgi.setText("Bilgi : " + resimList.get(sayac).resimbilgi);
                    sayac++;
                }
                else {
                    Toast.makeText(Uyg1Activity.this, "Sona geldin.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayac <= 4 && sayac > 0) {
                    sayac--;
                    resim.setImageResource(resimList.get(sayac).resim);
                    bilgi.setText("Bilgi : " + resimList.get(sayac).resimbilgi);
                }
                else {
                    Toast.makeText(Uyg1Activity.this, "Sona geldin.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}