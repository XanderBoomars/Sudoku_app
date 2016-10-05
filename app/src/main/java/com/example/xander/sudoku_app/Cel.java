package com.example.xander.sudoku_app;


import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

public class Cel {
    private int celNumber;
    private TextView celTextView;
    private boolean fixed = false;

    public Cel(TextView text){
        celTextView = text;
        celNumber = 0;

    }



    public void setColor(int i){
        if(i==1){ //set gray
            celTextView.setTextColor(Color.GRAY);
        }
        if(i==0){//set black
            celTextView.setTextColor(Color.BLACK);
        }
    }

    public void setLocked(){
        fixed = true;
    }

    public void setUnlocked(){
        fixed = false;
    }

    public void Write(int x){
        if(fixed==false) {
            if (x == 0) {
                celTextView.setText(" ");
                celNumber = 0;
            }
            else {
                celTextView.setText(Integer.toString(x));
                celNumber = x;
            }
        }
    }








}
