package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int firstDice = 0;
    int secondDice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int rand() {
        int numb = 1 + (int) (Math.random() * 6);

        return numb;
    }


    public void getFirstDice(int number) {
        ImageView image = (ImageView) findViewById(R.id.firstImage);
        if (number == 1) {
            image.setImageResource(R.drawable.one);
        } else if (number == 2) {
            image.setImageResource(R.drawable.two);
        } else if (number == 3) {
            image.setImageResource(R.drawable.three);
        } else if (number == 4) {
            image.setImageResource(R.drawable.four);
        } else if (number == 5) {
            image.setImageResource(R.drawable.five);
        } else if (number == 6) {
            image.setImageResource(R.drawable.six);
        }
    }

    public void getSecondDice(int number) {
        ImageView image = (ImageView) findViewById(R.id.secondImage);
        if (number == 1) {
            image.setImageResource(R.drawable.one);
        } else if (number == 2) {
            image.setImageResource(R.drawable.two);
        } else if (number == 3) {
            image.setImageResource(R.drawable.three);
        } else if (number == 4) {
            image.setImageResource(R.drawable.four);
        } else if (number == 5) {
            image.setImageResource(R.drawable.five);
        } else if (number == 6) {
            image.setImageResource(R.drawable.six);
        }
    }


    public void roll(View view) {
        firstDice = rand();
        secondDice = rand();
        getFirstDice(firstDice);
        getSecondDice(secondDice);
    }
}