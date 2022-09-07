package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageView k3=findViewById(R.id.bbb1);
        ImageView k4=findViewById(R.id.bbb2);








        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g0=new Intent(MainActivity5.this,MainActivity12.class);
                startActivity(g0);
            }
        });



        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g00=new Intent(MainActivity5.this,MainActivity13.class);
                startActivity(g00);
            }
        });


























    }
}