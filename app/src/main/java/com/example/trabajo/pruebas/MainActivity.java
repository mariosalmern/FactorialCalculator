package com.example.trabajo.pruebas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    EditText numberN;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeModel();
    }

    private void initializeModel() {
        numberN = (EditText) findViewById(R.id.number_N);
        result = (TextView) findViewById(R.id.result);
    }

    private long calculatedFactorial() {

        long factorial = 1;
        try {
            factorial = Long.parseLong(numberN.getText().toString());
            for (long i = factorial - 1; i > 0; i--) {
                factorial = i * factorial;
            }
        }
        catch (NumberFormatException e) {
            Toast.makeText(this, "Incorrect Data Input", Toast.LENGTH_LONG).show();
        }
        return factorial;

    }


    public void onClick(View v) {

        String numberN = this.numberN.getText().toString();
        long factorial = calculatedFactorial();
        String result = "The Factorial of "+ numberN +"is equal to : " + factorial;

        this.result.setText(result) ;

    }




}
