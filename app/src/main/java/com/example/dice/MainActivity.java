package com.example.dice;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int firstDice = 0;
    int secondDice = 0;
    ImageView firstImage;
    ImageView secondImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstImage = (ImageView) findViewById(R.id.firstImage);
        secondImage = (ImageView) findViewById(R.id.secondImage);

        if (savedInstanceState != null){
            firstDice = savedInstanceState.getInt("num1");
            secondDice = savedInstanceState.getInt("num2");
            getFirstDice(firstDice);
            getSecondDice(secondDice);
        }
    }

    public int rand() {
        int numb = 1 + (int) (Math.random() * 6);
        return numb;
    }


    public void getFirstDice(int number) {
        if (number == 1) {
            firstImage.setImageResource(R.drawable.one);
        } else if (number == 2) {
            firstImage.setImageResource(R.drawable.two);
        } else if (number == 3) {
            firstImage.setImageResource(R.drawable.three);
        } else if (number == 4) {
            firstImage.setImageResource(R.drawable.four);
        } else if (number == 5) {
            firstImage.setImageResource(R.drawable.five);
        } else if (number == 6) {
            firstImage.setImageResource(R.drawable.six);
        }
    }

    public void getSecondDice(int number) {
        if (number == 1) {
            secondImage.setImageResource(R.drawable.one);
        } else if (number == 2) {
            secondImage.setImageResource(R.drawable.two);
        } else if (number == 3) {
            secondImage.setImageResource(R.drawable.three);
        } else if (number == 4) {
            secondImage.setImageResource(R.drawable.four);
        } else if (number == 5) {
            secondImage.setImageResource(R.drawable.five);
        } else if (number == 6) {
            secondImage.setImageResource(R.drawable.six);
        }
    }


    public void roll(View view) {
        firstDice = rand();
        secondDice = rand();
        getFirstDice(firstDice);
        getSecondDice(secondDice);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("num1",firstDice);
        outState.putInt("num2",secondDice);

    }
}