package com.example.root.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)

    {

        EditText amount = (EditText) findViewById(R.id.amount);

        String amountStr = amount.getText().toString();
        double converted = (Double.parseDouble(amountStr) * 1.12);
        double roundOff = Math.round(converted * 100.0) / 100.0;



        Toast.makeText(getApplicationContext(), Double.toString(roundOff) + " EUR", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
