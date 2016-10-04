package com.example.xander.sudoku_app;

import android.annotation.SuppressLint;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class FullscreenActivity extends AppCompatActivity {
    int currentNumberSelected=0;

    private TextView cel_1;
    private TextView cel_2;
    private TextView cel_3;




    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        cel_1 = (TextView) findViewById(R.id.cel_1);
        cel_2 = (TextView) findViewById(R.id.cel_2);
        cel_3 = (TextView) findViewById(R.id.cel_3);


    }

    public void celClicked (View view){
        switch  (view.getId()){
            case (R.id.cel_1):
                cel_1.setText(Integer.toString(currentNumberSelected));
                Toast toast1 = Toast.makeText(getApplicationContext(), "clicked on cel 1", Toast.LENGTH_SHORT);
                toast1.show();
                break;

            case (R.id.cel_2):
                cel_2.setText(Integer.toString(currentNumberSelected));
                Toast toast2 = Toast.makeText(getApplicationContext(), "clicked on cel 2", Toast.LENGTH_SHORT);
                toast2.show();
                break;

            case (R.id.cel_3):
                cel_3.setText(Integer.toString(currentNumberSelected));
                Toast toast3 = Toast.makeText(getApplicationContext(), "clicked on cel 3", Toast.LENGTH_SHORT);
                toast3.show();
                break;
        }
    }

    public void numberButtonClicked (View view) {


        switch (view.getId()) {
            case (R.id.button_1):
                currentNumberSelected = 1;
                Toast toast1 = Toast.makeText(getApplicationContext(), "clicked on button1", Toast.LENGTH_SHORT);
                toast1.show();
                break;

            case (R.id.button_2):
                currentNumberSelected = 2;
                Toast toast2 = Toast.makeText(getApplicationContext(), "clicked on button2", Toast.LENGTH_SHORT);
                toast2.show();
                break;

            case (R.id.button_3):
                currentNumberSelected = 3;
                Toast toast3 = Toast.makeText(getApplicationContext(), "clicked on button3", Toast.LENGTH_SHORT);
                toast3.show();
                break;

            case (R.id.button_4):
                currentNumberSelected = 4;
                Toast toast4 = Toast.makeText(getApplicationContext(), "clicked on button4", Toast.LENGTH_SHORT);
                toast4.show();
                break;

            case (R.id.button_5):
                currentNumberSelected = 5;
                Toast toast5 = Toast.makeText(getApplicationContext(), "clicked on button5", Toast.LENGTH_SHORT);
                toast5.show();
                break;

            case (R.id.button_6):
                currentNumberSelected = 6;
                Toast toast6 = Toast.makeText(getApplicationContext(), "clicked on button6", Toast.LENGTH_SHORT);
                toast6.show();
                break;

            case (R.id.button_7):
                currentNumberSelected = 7;
                Toast toast7 = Toast.makeText(getApplicationContext(), "clicked on button7", Toast.LENGTH_SHORT);
                toast7.show();
                break;

            case (R.id.button_8):
                currentNumberSelected = 8;
                Toast toast8 = Toast.makeText(getApplicationContext(), "clicked on button8", Toast.LENGTH_SHORT);
                toast8.show();
                break;

            case (R.id.button_9):
                currentNumberSelected = 9;
                Toast toast9 = Toast.makeText(getApplicationContext(), "clicked on button9", Toast.LENGTH_SHORT);
                toast9.show();
                break;


        }
    }
}
