package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clear, del, nine, eight, seven, division, six, five, four, multiply, three, two, one, substract, zero, point, equal, plus;

    TextView result;

    boolean first_input = false;
    boolean first_action = false;
    boolean point_dot = false;


    boolean val_1 = false;


    double value1 = 0.0;
    double value2 = 0.0;

    String sign = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeReference();

        result.setText("0");

        first_input = true;
        first_action = true;


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("1");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "1"));
                }
                first_action = true;

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("2");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "2"));
                }
                first_action = true;

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("3");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "3"));
                }
                first_action = true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("4");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "4"));
                }
                first_action = true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){

                    result.setText("5");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "5"));
                }
                first_action = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("6");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "6"));
                }
                first_action = true;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("7");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "7"));
                }
                first_action = true;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("8");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "8"));
                }
                first_action = true;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("9");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "9"));
                }
                first_action = true;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){
                    result.setText("0");
                    first_input = false;
                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "0"));
                }
                first_action = true;
            }
        });


        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_input){

                        result.setText(".");
                        first_input = false;


                }
                else{
                    result.setText(String.format("%s%s",result.getText().toString(), "."));
                    //point_dot = true;
                }


                first_action = true;
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                first_input = true;
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "+";

                if (first_action){
                    if(!val_1){
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    }
                    else{
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("+");
                first_input = true;

            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "-";

                if (first_action){
                    if(!val_1){
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    }
                    else{
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("-");
                first_input = true;

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "X";

                if (first_action){
                    if(!val_1){
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    }
                    else{
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("X");
                first_input = true;

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "/";

                if (first_action){
                    if(!val_1){
                        Log.d("DEBUG_APP","if ki dhuktese ");
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    }
                    else{
                        Log.d("DEBUG_APP","else ki dhuktese ");
                        value2 = Double.valueOf(result.getText().toString());
                        Log.d("DEBUG_APP","val2 by div "+value2);

                    }
                    first_action = false;
                }
                result.setText("/");
                first_input = true;

            }
        });




                equal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Log.d("DEBUG_APP","val1 "+ String.valueOf(value1));




                        if (first_action) {
                            if (!val_1) {
                                value1 = Double.valueOf(result.getText().toString());
                                val_1 = false;
                            } else {
                                value2 = Double.valueOf(result.getText().toString());
                                Log.d("DEBUG_APP","val2 "+ String.valueOf(value2));
                            }
                            if (sign.equals("+")) {
                                double sum = value1 + value2;
                                result.setText(String.valueOf(sum));
                            }
                            if (sign.equals("-")) {
                                double subs = value1 - value2;
                                result.setText(String.valueOf(subs));
                            }
                            if (sign.equals("X")) {

                                double mul = value1 * value2;
                                result.setText(String.valueOf(mul));
                            }
                            if (sign.equals("/")) {
                                Log.d("DEBUG_APP","result e val2 "+ String.valueOf(value2));
                                double div = value1 / value2;
                                result.setText(String.valueOf(div));
                            }
                            else {
                                result.setText(result.getText());
                            }
                        } else {
                            result.setText("Error");
                        }
                        value1 = 0;
                        value2 = 0;
                        val_1 = false;
                        first_input = true;
                        first_action = true;
                    }
                });

            }

            private void initializeReference() {

                result = findViewById(R.id.result);

                clear = findViewById(R.id.c);
                nine = findViewById(R.id.nine);
                eight = findViewById(R.id.eight);
                seven = findViewById(R.id.seven);
                division = findViewById(R.id.divide);
                six = findViewById(R.id.six);
                five = findViewById(R.id.five);
                four = findViewById(R.id.four);
                multiply = findViewById(R.id.multiply);
                three = findViewById(R.id.three);
                two = findViewById(R.id.two);
                one = findViewById(R.id.one);
                substract = findViewById(R.id.subs);
                zero = findViewById(R.id.zero);
                point = findViewById(R.id.point);
                equal = findViewById(R.id.equal);
                plus = findViewById(R.id.add);
            }
        }