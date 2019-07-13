package com.saiproject.androidapk6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        EditText edtPuzzle = findViewById(R.id.edtPuzzle);
        String oldEdtPuzzleValue;           /* To concatenate texts */


        Puzzle myPuzzle = new Puzzle();     //Default constructor
        myPuzzle.ShuffleCompanyAndDevices();       //Shuffle devices

        for(int i =0 ;i < 60 ; i++){

            oldEdtPuzzleValue = edtPuzzle.getText().toString();
            edtPuzzle.setText(oldEdtPuzzleValue + myPuzzle.giveModels());
        }





    }


}
