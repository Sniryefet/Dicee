package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //checking android studio commit
        
        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.leftDice);
        final ImageView rightDice = findViewById(R.id.rightDice);

        final Random randomNum= new Random();

        final int [] diceArr = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","the button has been pressed");
                int number;
                number=randomNum.nextInt(6);
                leftDice.setImageResource(diceArr[number]);

                number=randomNum.nextInt(6);
                rightDice.setImageResource(diceArr[number]);

            }
        });

    }
}