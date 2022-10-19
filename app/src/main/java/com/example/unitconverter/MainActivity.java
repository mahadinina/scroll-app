package com.example.unitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview1, textview2;
    private EditText editTextTextPersonName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textview1=findViewById(R.id.textView);
        textview2=findViewById(R.id.textView2);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);

        }
    public void calculate(View view){
        Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();

        String s = editTextTextPersonName2.getText().toString();
        double kg = Integer.parseInt(s);
        double pound= (kg*2.205);
        textview1.setText("Pounds  : " + pound);
    }

}