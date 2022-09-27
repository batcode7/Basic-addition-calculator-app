package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText1 = findViewById(R.id.editTextDecimal1);
        editText2 = findViewById(R.id.editTextDecimal2);
    }

    public void calculate (View view){
        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();

        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        double summation = number1 + number2 ;
        Toast.makeText(this, "Thanks for testing you may share your feedback", Toast.LENGTH_SHORT).show();
        textView.setText("The summation of " + number1 + " and " + number2 + " = " + summation);

    }

}