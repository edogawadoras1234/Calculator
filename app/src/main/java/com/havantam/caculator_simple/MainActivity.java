package com.havantam.caculator_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonEqual, buttonclear;
    EditText crunchifyEditText;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        crunchifyEditText = (EditText) findViewById(R.id.edt1);
        buttonclear = (Button) findViewById(R.id.buttoncls);


        button1.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "1"));

        button2.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "2"));

        button3.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "3"));

        button4.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "4"));

        button5.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "5"));

        button6.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "6"));

        button7.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "7"));

        button8.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "8"));

        button9.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "9"));

        button0.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "0"));

        buttonAdd.setOnClickListener(v -> {

            if (crunchifyEditText == null) {
                assert false;
                crunchifyEditText.setText("");
            } else {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyAddition = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonSub.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
            mSubtract = true;
            crunchifyEditText.setText(null);
        });

        buttonMul.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
            crunchifyMultiplication = true;
            crunchifyEditText.setText(null);
        });

        buttonDivision.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
            crunchifyDivision = true;
            crunchifyEditText.setText(null);
        });

        buttonEqual.setOnClickListener(v -> {
            mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

            if (crunchifyAddition) {
                crunchifyEditText.setText(mValueOne + mValueTwo + "");
                crunchifyAddition = false;
            }

            if (mSubtract) {
                crunchifyEditText.setText(mValueOne - mValueTwo + "");
                mSubtract = false;
            }

            if (crunchifyMultiplication) {
                crunchifyEditText.setText(mValueOne * mValueTwo + "");
                crunchifyMultiplication = false;
            }

            if (crunchifyDivision) {
                crunchifyEditText.setText(mValueOne / mValueTwo + "");
                crunchifyDivision = false;
            }
        });

        button10.setOnClickListener(v -> crunchifyEditText.setText(crunchifyEditText.getText() + "."));

        buttonclear.setOnClickListener(view -> crunchifyEditText.setText(" "));
    }
}