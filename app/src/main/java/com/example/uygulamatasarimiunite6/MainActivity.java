package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uyg1(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg1Activity.class);
        startActivity(sa);
    }
    public void uyg2(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg2Activity.class);
        startActivity(sa);
    }
    public void uyg3(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg3Activity.class);
        startActivity(sa);
    }
    public void uyg4(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg4Activity.class);
        startActivity(sa);
    }
    public void uyg5(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg5Activity.class);
        startActivity(sa);
    }
    public void uyg6(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg6Activity.class);
        startActivity(sa);
    }
    public void uyg7(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg7Activity.class);
        startActivity(sa);
    }
    public void uyg8(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg8Activity.class);
        startActivity(sa);
    }
    public void uyg9(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg9Activity.class);
        startActivity(sa);
    }
    public void uyg10(View view) {
        Intent sa = new Intent(MainActivity.this,Uyg10Activity.class);
        startActivity(sa);
    }
    public void ss1(View view) {
        Intent sa = new Intent(MainActivity.this,SiraSizde1.class);
        startActivity(sa);
    }
}