package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFun(View view)
    {
        EditText val=(EditText)findViewById(R.id.INRText);
        double dollar=Double.parseDouble(val.getText().toString())*0.014;

        Log.i("INFO", "INR is converted to dollar!");

        Toast.makeText(this, Double.toString(dollar)+" Dollars", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
