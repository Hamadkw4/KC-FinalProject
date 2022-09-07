package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView p1 =findViewById(R.id.p1);
        ImageView p2 =findViewById(R.id.p2);
        ImageView p3 =findViewById(R.id.p3);
        ImageView p4 =findViewById(R.id.p4);
        ImageView p5 =findViewById(R.id.p5);



        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p1 = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(p1);

            }
        });



        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p2=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(p2);
            }
        });




        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p3= new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(p3);
            }
        });




        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p4 =new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(p4);
            }
        });


        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p5 = new Intent(MainActivity2.this,MainActivity17.class);
                startActivity(p5);
            }
        });


















































    }
}