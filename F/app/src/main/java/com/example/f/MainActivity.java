package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();


        handler.postDelayed(()->{



            Intent g = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(g);
            finish();

        }, 5500);










    }
}