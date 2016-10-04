package com.example.xander.sudoku_app;


import android.view.View;
import android.widget.TextView;

public class Cel {
    private int celNumber;
    private TextView celTextView;

    public Cel(TextView text){
        celTextView = text;
        celNumber = 0;
    }



    public void setVisibility(int x){
        if(x==1){
            celTextView.setVisibility(View.INVISIBLE);
        }

        if(x==0){
            celTextView.setVisibility(View.VISIBLE);
        }
    }

    public void clickedWrite(int x){
        celTextView.setText(Integer.toString(x));
    }








}
