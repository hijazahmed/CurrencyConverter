package com.example.hijaz.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
                String amountInDolars = editText.getText().toString();
                double amountInDolarsDouble = Double.parseDouble(amountInDolars);
                double amountInRupeesDouble = amountInDolarsDouble * 73.14;
                String amountInRupeesString = Double.toString(amountInRupeesDouble);
        Log.i("amount in rupees",amountInRupeesString );
        Toast.makeText(this, "$" +  amountInDolars + "is rupees" +amountInRupeesString, Toast.LENGTH_SHORT).show();
        

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
