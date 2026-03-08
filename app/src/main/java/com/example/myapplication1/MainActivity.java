package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText inputNum1;
    private EditText inputNum2;
    private TextView outputNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputNum1 = findViewById(R.id.inputNumber1);
        inputNum2 = findViewById(R.id.inputNumber2);
        outputNum = findViewById(R.id.outputResult);
    }

    public void add(View view) {
        double num1 = Double.parseDouble(inputNum1.getText().toString());
        double num2 = Double.parseDouble(inputNum2.getText().toString());
        double res = num1 + num2;
        if (res == (int) res) {
            outputNum.setText(String.valueOf((int) res));
        } else {
            outputNum.setText(String.valueOf(res));
        }
        System.out.println(outputNum.getText());
    }

    public void subtract(View view) {
        double num1 = Double.parseDouble(inputNum1.getText().toString());
        double num2 = Double.parseDouble(inputNum2.getText().toString());
        double res = num1 - num2;
        if (res == (int) res) {
            outputNum.setText(String.valueOf((int) res));
        } else {
            outputNum.setText(String.valueOf(res));
        }
        System.out.println(outputNum.getText());
    }

    public void multiply(View view) {
        double num1 = Double.parseDouble(inputNum1.getText().toString());
        double num2 = Double.parseDouble(inputNum2.getText().toString());
        double res = num1 * num2;
        if (res == (int) res) {
            outputNum.setText(String.valueOf((int) res));
        } else {
            outputNum.setText(String.valueOf(res));
        }
        System.out.println(outputNum.getText());
    }

    public void divide(View view) {
        double num1 = Double.parseDouble(inputNum1.getText().toString());
        double num2 = Double.parseDouble(inputNum2.getText().toString());
        double res = num1 / num2;
        if (res == (int) res) {
            outputNum.setText(String.valueOf((int) res));
        } else {
            outputNum.setText(String.valueOf(res));
        }
        System.out.println(outputNum.getText());
    }

}