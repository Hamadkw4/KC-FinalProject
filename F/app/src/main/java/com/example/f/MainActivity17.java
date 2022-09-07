package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        ImageView N1=findViewById(R.id.H15);
        ImageView N2=findViewById(R.id.H16);









        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c1=new Intent(MainActivity17.this,MainActivity20.class);
                startActivity(c1);
            }
        });



        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c2=new Intent(MainActivity17.this,MainActivity19.class);
                startActivity(c2);

            }
        });
























    }
}