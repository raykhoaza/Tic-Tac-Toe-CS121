package com.dealfaro.luca.class2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables
    //Counter to keep track of moves
    public int counter = 0;
    //Check who's move
    public boolean cross = true;
    public boolean circle = false;
    //Check which box is occupied by cross or circle
    public boolean cross1 = false;
    public boolean cross2 = false;
    public boolean cross3 = false;
    public boolean cross4 = false;
    public boolean cross5 = false;
    public boolean cross6 = false;
    public boolean cross7 = false;
    public boolean cross8 = false;
    public boolean cross9 = false;

    public boolean circle1 = false;
    public boolean circle2 = false;
    public boolean circle3 = false;
    public boolean circle4 = false;
    public boolean circle5 = false;
    public boolean circle6 = false;
    public boolean circle7 = false;
    public boolean circle8 = false;
    public boolean circle9 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //function for after declaring winner
    //turn on win message
    public void winner(String tmp){
        if(tmp == "crosswins"){
            TextView c = (TextView) findViewById(R.id.CrossWonView);
            c.setVisibility(View.VISIBLE);
        } else if (tmp == "circlewins"){
            TextView c = (TextView) findViewById(R.id.CircleWonView);
            c.setVisibility(View.VISIBLE);
        }
        //Disable buttons
        ImageButton b = (ImageButton) findViewById(R.id.imageButton1);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton2);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton3);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton4);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton5);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton6);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton7);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton8);
        b.setClickable(false);
        b.setEnabled(false);
        b = (ImageButton) findViewById(R.id.imageButton9);
        b.setClickable(false);
        b.setEnabled(false);
        //turns on button to reset game
        counter = 0;
        gamereset();
    }
    //function to check for winner
    public void check4winner(){
        String winner = "";
        //checking different combinations
        if((circle1 && circle2 && circle3) ||
                (circle4 && circle5 && circle6) ||
                (circle7 && circle8 && circle9) ||
                (circle1 && circle4 && circle7) ||
                (circle2 && circle5 && circle8) ||
                (circle3 && circle6 && circle9) ||
                (circle1 && circle5 && circle9) ||
                (circle3 && circle5 && circle7)){
            //highlighting the winning combination
            if((circle1 && circle2 && circle3)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton2);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle4 && circle5 && circle6)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton4);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton6);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle7 && circle8 && circle9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton8);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle1 && circle4 && circle7)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton4);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle2 && circle5 && circle8)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton2);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton8);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle3 && circle6 && circle9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton6);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle1 && circle5 && circle9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((circle3 && circle5 && circle7)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
            }

            winner = "circlewins";
            winner(winner);
        } else if((cross1 && cross2 && cross3) ||
                (cross4 && cross5 && cross6) ||
                (cross7 && cross8 && cross9) ||
                (cross1 && cross4 && cross7) ||
                (cross2 && cross5 && cross8) ||
                (cross3 && cross6 && cross9) ||
                (cross1 && cross5 && cross9) ||
                (cross3 && cross5 && cross7)){

            if((cross1 && cross2 && cross3)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton2);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross4 && cross5 && cross6)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton4);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton6);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross7 && cross8 && cross9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton8);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross1 && cross4 && cross7)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton4);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross2 && cross5 && cross8)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton2);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton8);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross3 && cross6 && cross9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton6);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross1 && cross5 && cross9)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton9);
                vv.setImageResource(R.drawable.redbox);
            }
            if ((cross3 && cross5 && cross7)){
                ImageButton vv = (ImageButton) findViewById(R.id.imageButton3);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton5);
                vv.setImageResource(R.drawable.redbox);
                vv = (ImageButton) findViewById(R.id.imageButton7);
                vv.setImageResource(R.drawable.redbox);
            }

            winner = "crosswins";
            winner(winner);
        } else {
            return;
        }
    }
    //turns on button for resetting game
    public void gamereset() {
        Button tmp = (Button) findViewById(R.id.resetbutton);
        tmp.setVisibility(View.VISIBLE);
    }
    //resetting game by setting all variables to default
    public void reset(View V) {
        counter = 0;
        cross = true;
        circle = false;

        cross1 = false;
        cross2 = false;
        cross3 = false;
        cross4 = false;
        cross5 = false;
        cross6 = false;
        cross7 = false;
        cross8 = false;
        cross9 = false;

        circle1 = false;
        circle2 = false;
        circle3 = false;
        circle4 = false;
        circle5 = false;
        circle6 = false;
        circle7 = false;
        circle8 = false;
        circle9 = false;
        //resetting imagebuttons to grey and clickable
        ImageButton b = (ImageButton) findViewById(R.id.imageButton1);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton2);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton3);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton4);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton5);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton6);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton7);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton8);
        b.setClickable(true);
        b.setEnabled(true);
        b = (ImageButton) findViewById(R.id.imageButton9);
        b.setClickable(true);
        b.setEnabled(true);
        //turns test box invisible
        TextView c = (TextView) findViewById(R.id.CrossWonView);
        c.setVisibility(View.INVISIBLE);

        c = (TextView) findViewById(R.id.CircleWonView);
        c.setVisibility(View.INVISIBLE);

        c = (TextView) findViewById(R.id.TieWonView);
        c.setVisibility(View.INVISIBLE);

        ImageButton vv = (ImageButton) findViewById(R.id.imageButton1);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton2);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton3);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton4);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton5);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton6);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton7);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton8);
        vv.setImageResource(R.drawable.greybox);
        vv = (ImageButton) findViewById(R.id.imageButton9);
        vv.setImageResource(R.drawable.greybox);
        //turn reset button invisible
        Button tmp = (Button) findViewById(R.id.resetbutton);
        tmp.setVisibility(View.INVISIBLE);
    }

    public void clickBoard(View v) {
        // Get id of button
        int i = v.getId();
        // More useful, let's get the tag.
        String t = (String) v.getTag();
        // If you want to put a cross on it.
        ImageButton vv = (ImageButton) v;
        if(cross) {
            //change image of button upon click and disable
            vv.setImageResource(R.drawable.cross);
            vv.setClickable(false);
            vv.setEnabled(false);
            //set which icon was set to which button
            switch((String)(vv.getTag())){
                case "1": cross1 = true;
                    break;
                case "2": cross2 = true;
                    break;
                case "3": cross3 = true;
                    break;
                case "4": cross4 = true;
                    break;
                case "5": cross5 = true;
                    break;
                case "6": cross6 = true;
                    break;
                case "7": cross7 = true;
                    break;
                case "8": cross8 = true;
                    break;
                case "9": cross9 = true;
                    break;
            }
            cross = false;
            circle = true;
            counter++;
        } else {
            vv.setImageResource(R.drawable.circle);
            vv.setClickable(false);
            vv.setEnabled(false);
            switch((String)(vv.getTag())){
                case "1": circle1 = true;
                    break;
                case "2": circle2 = true;
                    break;
                case "3": circle3 = true;
                    break;
                case "4": circle4 = true;
                    break;
                case "5": circle5 = true;
                    break;
                case "6": circle6 = true;
                    break;
                case "7": circle7 = true;
                    break;
                case "8": circle8 = true;
                    break;
                case "9": circle9 = true;
                    break;
            }
            circle = false;
            cross = true;
            counter++;
        }
        check4winner();
        //check if game is tied
        if(counter == 9) {
            TextView c = (TextView) findViewById(R.id.TieWonView);
            c.setVisibility(View.VISIBLE);
            gamereset();
        }
    }
}
