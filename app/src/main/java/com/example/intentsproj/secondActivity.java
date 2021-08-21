package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    EditText et_n1;
    EditText et_n2;
    TextView tv_answer;

    String number1;
    String number2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);
        tv_answer = findViewById(R.id.tv_answer);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        et_n1.setText(number1);
        et_n2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    //Addition
    public void addNumbers(View view){
        tv_answer.setText(number1 + "+" + number2 + "=" + (n1+n2));
    }

    //Subtraction
    public void subtractNumbers(View view){
        tv_answer.setText(number1 + "-" + number2 + "=" + (n1-n2));
    }

    //Multiplication
    public void multiplyNumbers(View view){
        tv_answer.setText(number1 + "*" + number2 + "=" + (n1*n2));
    }

    //Division
    public void divideNumbers(View view){
        tv_answer.setText(number1 + "/" + number2 + "=" + (n1/n2));
    }

}