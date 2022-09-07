package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);


        Button j1=findViewById(R.id.H2);
        TextView j2=findViewById(R.id.H3);
        EditText ha =findViewById(R.id.h232);




        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num2= Integer.valueOf(ha.getText().toString());


                if(num2<140){
                    j2.setText("طبيعي");

                }






                else if (num2>=200){
                    j2.setText("مرتفع");

                }



                else if(num2>140-199){
                    j2.setText("ما قبل السكري");
                }















            }
        });


















    }
}