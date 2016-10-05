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
    int currentNumberSelected=5;
    private Cel sudokuCels[] = new Cel[81];






    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);


        setup();

    }
    public void setup(){

        for(int i=1;i<82;i++){
            int id;
            if(i<10){
                id = getResources().getIdentifier("cel_0" + i, "id", getPackageName());
            }
            else {
                id = getResources().getIdentifier("cel_" + i, "id", getPackageName());
            }

            TextView text = (TextView) findViewById(id);
            sudokuCels[i-1] = new Cel(text);

        }

        String[] puzzle = new String[9];
        puzzle = getResources().getStringArray(R.array.puzzle_1);

        StringBuilder puzzleString = new StringBuilder();
        puzzleString.append(puzzle[0]);
        puzzleString.append(puzzle[1]);
        puzzleString.append(puzzle[2]);
        puzzleString.append(puzzle[3]);
        puzzleString.append(puzzle[4]);
        puzzleString.append(puzzle[5]);
        puzzleString.append(puzzle[6]);
        puzzleString.append(puzzle[7]);
        puzzleString.append(puzzle[8]);




        for(int i=0;i<81;i++){
            int x = Character.getNumericValue(puzzleString.charAt(i));

            sudokuCels[i].Write(x);
            if(x!=0){
                sudokuCels[i].setLocked();
                sudokuCels[i].setColor(0);
            }
            else{
                sudokuCels[i].setColor(1);
            }
        }



    }





    public void celClicked (View view){
        String id = getResources().getResourceName(view.getId());
        String id_number = id.substring(Math.max(id.length() - 2, 0));
        int idInt = Integer.parseInt(id_number)-1;

        Toast toast1 = Toast.makeText(getApplicationContext(), id_number, Toast.LENGTH_SHORT);
        toast1.show();

        sudokuCels[idInt].Write(currentNumberSelected);
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
