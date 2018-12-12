package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] imageArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random randomNumberGenerator = new Random();

        final Button ask = findViewById(R.id.buttonAsk);

        final ImageView myImage = findViewById(R.id.rotatingImage);

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number = randomNumberGenerator.nextInt(4);

                myImage.setImageResource(imageArray[number]);



            }
        });

    }
}
