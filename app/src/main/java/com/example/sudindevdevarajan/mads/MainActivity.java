package com.example.sudindevdevarajan.mads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {


    public void Add(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        EditText n1 = (EditText) findViewById(R.id.editText4);
        EditText n2 = (EditText) findViewById(R.id.editText5);
        double no1 = Double.parseDouble(n1.getText().toString());
        double no2 = Double.parseDouble(n2.getText().toString());
        Toast.makeText(getApplicationContext(), "Answer is " + (no1 + no2), Toast.LENGTH_SHORT).show();
        img.setImageResource(R.drawable.smile);
    }

    public void sub(View view)  {
        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.neutral);
        EditText n1=(EditText) findViewById(R.id.editText4);
        EditText n2=(EditText) findViewById(R.id.editText5);
        double no1=Double.parseDouble(n1.getText().toString());
        double no2=Double.parseDouble(n2.getText().toString());
        Toast.makeText(getApplicationContext(),"Answer is "+(no1-no2),Toast.LENGTH_SHORT).show();
        img.setImageResource(R.drawable.smile);
    }
    public void mul(View view)  {
        ImageView img= (ImageView) findViewById(R.id.imageView);
        EditText n1=(EditText) findViewById(R.id.editText4);
        EditText n2=(EditText) findViewById(R.id.editText5);
        double no1=Double.parseDouble(n1.getText().toString());
        double no2=Double.parseDouble(n2.getText().toString());
        Toast.makeText(getApplicationContext(),"Answer is "+(no1*no2),Toast.LENGTH_SHORT).show();
        img.setImageResource(R.drawable.smile);
    }
    public void div(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        EditText n1 = (EditText) findViewById(R.id.editText4);
        EditText n2 = (EditText) findViewById(R.id.editText5);
        double no1 = Double.parseDouble(n1.getText().toString());
        double no2 = Double.parseDouble(n2.getText().toString());
        if (no1 == 0 && no2 == 0) {
            Toast.makeText(getApplicationContext(), "Not Defined", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.sad);
        }
        if (no2 == 0) {
            Toast.makeText(getApplicationContext(), "Not Defined", Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.sad);
        } else {
            Toast.makeText(getApplicationContext(), "Answer is " + (no1 / no2), Toast.LENGTH_SHORT).show();
            img.setImageResource(R.drawable.smile);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
