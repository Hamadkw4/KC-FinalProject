package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        EditText n1=findViewById(R.id.h232);
        Button n2=findViewById(R.id.H2);
        TextView T1=findViewById(R.id.H3);




        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1= Integer.valueOf(n1.getText().toString());

                if (num1<100){
                    T1.setText("طبيعي");




                }
                else if (num1>=126){
                    T1.setText("مرتفع");

                }
                else if(num1>100-125){
                    T1.setText("ما قبل السكري");
                }


            }
        });


























    }
}