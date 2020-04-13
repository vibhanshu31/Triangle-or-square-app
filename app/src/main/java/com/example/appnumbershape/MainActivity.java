package com.example.appnumbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class Type{
        int checkNumber;
        public boolean square(){
            double squareRoot = Math.sqrt(checkNumber);
                if (squareRoot == Math.floor(squareRoot))
                    return true;
            return false;
        }

        public boolean traingle(){
            int triangularValue = 0;
            for(int i = 1; i <= 50; i++){
                triangularValue = triangularValue + i;
                if(checkNumber == triangularValue)
                    return true;
            }
            return false;
        }
    }

    public void check(View view){

        Log.i("app", "Is working!!");

        Type n = new Type();
        EditText number = (EditText) findViewById(R.id.number);
        if (number.getText().toString().isEmpty())
            Toast.makeText(this, "please enter a number!!", Toast.LENGTH_SHORT).show();
        else {
            n.checkNumber = Integer.parseInt(number.getText().toString());

            if (n.square()) {
                if (n.traingle())
                    Toast.makeText(this, n.checkNumber + " Is a square as well as triangle", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, n.checkNumber + " Is a square number", Toast.LENGTH_SHORT).show();
            } else if (n.traingle())
                Toast.makeText(this, n.checkNumber + " Is a triangular number", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, n.checkNumber + " Is neither square nor triangle", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
