package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview , secondview;
    String secondvalue , operator;
    double num1, num2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstview = findViewById(R.id.firstTextViewId);
        secondview = findViewById(R.id.secondTextViewId);
    }


    public void digitFunction(View view) {
        secondvalue = secondview.getText().toString();

        if (view.getId() == R.id.zeroButtonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("0");
            }
            else secondview.setText(secondvalue +"0");


        }
        else if( view.getId()==R.id.oneButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("1");
            }
            else secondview.setText(secondvalue +"1");
        }

        else if( view.getId()==R.id.twoButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("2");
            }
            else secondview.setText(secondvalue +"2");
        }
        else if( view.getId()==R.id.threeButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("3");
            }
            else secondview.setText(secondvalue +"3");
        }

        else if( view.getId()==R.id.fourButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("4");
            }
            else secondview.setText(secondvalue +"4");
        }
        else if( view.getId()==R.id.fiveButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("5");
            }
            else secondview.setText(secondvalue +"5");
        }
        else if( view.getId()==R.id.sixtButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("6");
            }
            else secondview.setText(secondvalue +"6");
        }
        else if( view.getId()==R.id.sevenButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("7");
            }
            else secondview.setText(secondvalue +"7");
        }
        else if( view.getId()==R.id.eightButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("8");
            }
            else secondview.setText(secondvalue +"8");
        }
        else if( view.getId()==R.id.nineButtonid){
            if(secondvalue.equals("0")){
                secondview.setText("9");
            }
            else secondview.setText(secondvalue +"9");
        }
        else {
            secondview.setText(secondvalue +".");
        }
    }

    public void logicFunction(View view) {
        secondvalue= secondview.getText().toString();
        num1 = Double.parseDouble(secondvalue);

        if (view.getId() == R.id.addButtonid) {
            operator = "+";

        } else if (view.getId() == R.id.subButtonid) {
            operator = "-";

        } else if (view.getId() == R.id.multiButtonid) {
            operator = "*";

        } else {
            operator = "/";

        }
        firstview.setText(secondvalue + operator);
        secondview.setText("0");


    }


    public void resultButton(View view) {
        num2= Double.parseDouble(secondview.getText().toString());
        if (operator.equals("+")){
            result=num1+num2;
        }
        else if( operator.equals("-")){
            result=num1-num2;
        }
        else if( operator.equals("*")){
            result=num1*num2;
        }
        else {
            result=num1/num2;
        }
        firstview.setText(" "+num1+" "+operator+num2+ "=");
        secondview.setText(""+result);
    }



    public void clearFunction(View view) {
        firstview.setText("");
        secondview.setText("0");
        num1=0;
        num2=0;

    }

    public void deleteFunction(View view) {
        secondvalue=secondview.getText().toString();
        if (secondvalue.length()>1){
            secondvalue=secondvalue.substring(0,secondvalue.length()-1);
            secondview.setText(secondvalue);
        }
        else if(secondvalue.length()==1){
            secondview.setText("0");
        }
    }









    public void CEFunction(View view) {
    }

    public void percentFunction(View view) {
    }
}