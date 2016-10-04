package com.example.xander.sudoku_app;


import android.view.View;
import android.widget.TextView;

public class Cel {
    private int celNumber;
    private TextView celTextView;
    private boolean fixed;

    public Cel(TextView text){
        celTextView = text;
        celNumber = 0;

    }

    public void clear(){
        celTextView.setText("0");
    }





    public void Write(int x){
        celTextView.setText(Integer.toString(x));
        celNumber = x;


    }








}
