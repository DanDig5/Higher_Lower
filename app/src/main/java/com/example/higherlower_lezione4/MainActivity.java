package com.example.higherlower_lezione4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (int) (Math.random() * 100);
    }


    public void testNumberHandler(View view) {
        String numeroInserito = ((EditText) findViewById(R.id.inputNumber)).getText().toString();
        int inputDato;
        try {
            inputDato = Integer.parseInt(numeroInserito);
        }catch(NumberFormatException e){
            Toast.makeText(MainActivity.this, "per favore, inserisci un numero", Toast.LENGTH_LONG).show();
            return;
        }

        if(inputDato > number){
            Toast.makeText(MainActivity.this, R.string.too_high, Toast.LENGTH_SHORT).show();
        }
        if(inputDato < number){
            Toast.makeText(MainActivity.this, R.string.too_low, Toast.LENGTH_SHORT).show();
        }
        if (inputDato == number){
            Toast.makeText(MainActivity.this, R.string.guessed, Toast.LENGTH_SHORT).show();
        }
    }

    public void replay(View view){
        number = (int) (Math.random() * 100);
        Toast.makeText(MainActivity.this, R.string.new_number, Toast.LENGTH_SHORT).show();
    }
}
