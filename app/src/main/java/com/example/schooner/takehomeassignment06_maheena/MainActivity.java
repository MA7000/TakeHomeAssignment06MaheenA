package com.example.schooner.takehomeassignment06_maheena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        double grandTotal;
        double myAmount;
        double myTax;
        double myTip;
        double totalTax;
        double totalTip;
    }

    public void onSubmit (View view) {
       EditText amountInput = (EditText)findViewById(R.id.amount);
        String amount = amountInput.getText().toString();
        double myAmount = Integer.parseInt(amount);

        EditText taxInput = (EditText)findViewById(R.id.tax);
        String tax = amountInput.getText().toString();
        double myTax = Integer.parseInt(tax);

        EditText tipInput = (EditText)findViewById(R.id.tip);
        String tip = amountInput.getText().toString();
        double myTip = Integer.parseInt(tip);

        double totalTax = myAmount * myTax;
        double totalTip = myAmount * myTip;
        double grandTotal = myAmount + totalTax + totalTip;

        String receiptMessage = "Total: " + myAmount + "\n " +
                "Sales Tax: $" + totalTax + "\n " +
                "Tip: $" + totalTip + "\n " +
                "Grand Total: $" + grandTotal;

        Intent intent = new Intent (this, Main2Activity.class);
        intent.putExtra(Key.STRING,receiptMessage);
        startActivity(intent);



    }
}
