package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ImageView f1=findViewById(R.id.kfc);
        ImageView f2=findViewById(R.id.kfc2);





        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B1=new Intent(MainActivity6.this,MainActivity14.class);
                startActivity(B1);
            }
        });






        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B2=new Intent(MainActivity6.this,MainActivity15.class);
                    startActivity(B2);
            }
        });





























    }
}