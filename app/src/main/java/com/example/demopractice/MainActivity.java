package com.example.demopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText n1,n2,result;
    private Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        sum=findViewById(R.id.add);
        result=findViewById(R.id.res);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a=Double.parseDouble(n1.getText().toString());
                double b=Double.parseDouble(n2.getText().toString());
                double ans=a+b;
                result.setText(Double.toString(ans));
            }
        });
    }
}