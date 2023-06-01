package com.example.balba_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText numberOne = (EditText) findViewById(R.id.numberOne);
        EditText numberTwo = (EditText) findViewById(R.id.numberTwo);
        EditText resultDisplay = (EditText) findViewById(R.id.result);

        int numOne = Integer.parseInt(numberOne.getText().toString());
        int numTwo = Integer.parseInt(numberTwo.getText().toString());
        int result = numOne+numTwo;

        resultDisplay.setText("The Value Is: " + result);
    }

    public void Subtract(View v){
        EditText numberOne = (EditText) findViewById(R.id.numberOne);
        EditText numberTwo = (EditText) findViewById(R.id.numberTwo);
        EditText resultDisplay = (EditText) findViewById(R.id.result);

        int numOne = Integer.parseInt(numberOne.getText().toString());
        int numTwo = Integer.parseInt(numberTwo.getText().toString());
        int result = numOne-numTwo;

        resultDisplay.setText("The Value Is: " + result);
    }

    public void Multiply(View v){
        EditText numberOne = (EditText) findViewById(R.id.numberOne);
        EditText numberTwo = (EditText) findViewById(R.id.numberTwo);
        EditText resultDisplay = (EditText) findViewById(R.id.result);

        int numOne = Integer.parseInt(numberOne.getText().toString());
        int numTwo = Integer.parseInt(numberTwo.getText().toString());
        int result = numOne*numTwo;

        resultDisplay.setText("The Value Is: " + result);
    }

    public void Divide(View v){
        EditText numberOne = (EditText) findViewById(R.id.numberOne);
        EditText numberTwo = (EditText) findViewById(R.id.numberTwo);
        EditText resultDisplay = (EditText) findViewById(R.id.result);

        int numOne = Integer.parseInt(numberOne.getText().toString());
        int numTwo = Integer.parseInt(numberTwo.getText().toString());
        int result = numOne/numTwo;

        resultDisplay.setText("The Value Is: " + result);
    }
}