package com.example.jamory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView image_11, image_12, image_13, image_14, image_21, image_22, image_23, image_24, image_31, image_32, image_33, image_34;

    //array for the image
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202,  203, 204, 205, 206};

    //actual image
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints =0;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.mysong);
        mediaPlayer.setLooping (true);
        mediaPlayer.start();


        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        image_11 = (ImageView) findViewById(R.id.image_11);
        image_12 = (ImageView) findViewById(R.id.image_12);
        image_13 = (ImageView) findViewById(R.id.image_13);
        image_14 = (ImageView) findViewById(R.id.image_14);
        image_21 = (ImageView) findViewById(R.id.image_21);
        image_22 = (ImageView) findViewById(R.id.image_22);
        image_23 = (ImageView) findViewById(R.id.image_23);
        image_24 = (ImageView) findViewById(R.id.image_24);
        image_31 = (ImageView) findViewById(R.id.image_31);
        image_32 = (ImageView) findViewById(R.id.image_32);
        image_33 = (ImageView) findViewById(R.id.image_33);
        image_34 = (ImageView) findViewById(R.id.image_34);

        image_11.setTag("0");
        image_12.setTag("1");
        image_13.setTag("2");
        image_14.setTag("3");
        image_21.setTag("4");
        image_22.setTag("5");
        image_23.setTag("6");
        image_24.setTag("7");
        image_31.setTag("8");
        image_32.setTag("9");
        image_33.setTag("10");
        image_34.setTag("11");

        //load the card images
        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        //changing the color of the second player (inactive)
        tv_p2.setTextColor(Color.GRAY);

        image_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt ((String) view.getTag());
                doStuff(image_11, theCard);
            }
        });

        image_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_12, theCard);
            }
        });

        image_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_13, theCard);
            }
        });
        image_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_14, theCard);
            }
        });
        image_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_21, theCard);
            }
        });
        image_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_22, theCard);
            }
        });
        image_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_23, theCard);
            }
        });
        image_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_24, theCard);
            }
        });
        image_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_31, theCard);
            }
        });
        image_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_32, theCard);
            }
        });
        image_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_33, theCard);
            }
        });
        image_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(image_34, theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card){
        //set the correct image to the imageview
        if(cardsArray [card] == 101){
            iv.setImageResource (image101);
        }else if (cardsArray [card] ==102){
            iv.setImageResource(image102);
        }else if (cardsArray [card] ==103){
            iv.setImageResource(image103);
        }else if (cardsArray [card] ==104){
            iv.setImageResource(image104);
        }else if (cardsArray [card] ==105){
            iv.setImageResource(image105);
        }else if (cardsArray [card] ==106){
            iv.setImageResource(image106);
        }else if (cardsArray [card] ==201){
            iv.setImageResource(image201);
        }else if (cardsArray [card] ==202){
            iv.setImageResource(image202);
        }else if (cardsArray [card] ==203){
            iv.setImageResource(image203);
        }else if (cardsArray [card] ==204){
            iv.setImageResource(image204);
        }else if (cardsArray [card] ==205){
            iv.setImageResource(image205);
        }else if (cardsArray [card] ==206){
            iv.setImageResource(image206);
        }

        //check which image is selected and save it to temporary variable
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }
        else if (cardNumber==2){
            secondCard=cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            image_11.setEnabled(false);
            image_12.setEnabled(false);
            image_13.setEnabled(false);
            image_14.setEnabled(false);
            image_21.setEnabled(false);
            image_22.setEnabled(false);
            image_23.setEnabled(false);
            image_24.setEnabled(false);
            image_31.setEnabled(false);
            image_32.setEnabled(false);
            image_33.setEnabled(false);
            image_34.setEnabled(false);

            Handler handler =new Handler ();
            handler.postDelayed(new Runnable(){
                @Override
                public void run () {
                    //check if the selected images are equal
                    calculate();
                }
            },1000);
        }
    }

    private void calculate() {
        //if images are equal remove them and add point
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                image_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                image_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                image_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                image_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                image_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                image_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                image_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                image_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                image_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                image_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                image_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                image_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                image_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                image_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                image_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                image_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                image_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                image_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                image_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                image_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                image_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                image_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                image_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                image_34.setVisibility(View.INVISIBLE);
            }

            //add points to the correct player
            if (turn == 1) {
                playerPoints++;
                tv_p1.setText("P1: " + playerPoints);
            } else if (turn == 2) {
                cpuPoints++;
                tv_p2.setText("P2: " + cpuPoints);
            }
        } else {
            image_11.setImageResource(R.drawable.logo1);
            image_12.setImageResource(R.drawable.logo1);
            image_13.setImageResource(R.drawable.logo1);
            image_14.setImageResource(R.drawable.logo1);
            image_21.setImageResource(R.drawable.logo1);
            image_22.setImageResource(R.drawable.logo1);
            image_23.setImageResource(R.drawable.logo1);
            image_24.setImageResource(R.drawable.logo1);
            image_31.setImageResource(R.drawable.logo1);
            image_32.setImageResource(R.drawable.logo1);
            image_33.setImageResource(R.drawable.logo1);
            image_34.setImageResource(R.drawable.logo1);

            //change the player turn
            if (turn == 1) {
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        image_11.setEnabled(true);
        image_12.setEnabled(true);
        image_13.setEnabled(true);
        image_14.setEnabled(true);
        image_21.setEnabled(true);
        image_22.setEnabled(true);
        image_23.setEnabled(true);
        image_24.setEnabled(true);
        image_31.setEnabled(true);
        image_32.setEnabled(true);
        image_33.setEnabled(true);
        image_34.setEnabled(true);

        //check if the game is over
        checkEnd();

    }

    private void checkEnd(){
        if (image_11.getVisibility() == View.INVISIBLE &&
                image_12.getVisibility() == View.INVISIBLE &&
                image_13.getVisibility() == View.INVISIBLE &&
                image_14.getVisibility() == View.INVISIBLE &&
                image_21.getVisibility() == View.INVISIBLE &&
                image_22.getVisibility() == View.INVISIBLE &&
                image_23.getVisibility() == View.INVISIBLE &&
                image_24.getVisibility() == View.INVISIBLE &&
                image_31.getVisibility() == View.INVISIBLE &&
                image_32.getVisibility() == View.INVISIBLE &&
                image_33.getVisibility() == View.INVISIBLE &&
                image_34.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + playerPoints + "\nP2: "+ cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick( DialogInterface dialogInterface, int i) {

                            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            finish();


                        }
                    });
            AlertDialog alertDialog =alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources(){
        image101= R.drawable.oreo101;
        image102= R.drawable.choc102;
        image103= R.drawable.mint103;
        image104= R.drawable.vanilla104;
        image105= R.drawable.pink105;
        image106= R.drawable.red106;
        image201= R.drawable.oreo201;
        image202= R.drawable.choc202;
        image203= R.drawable.mint203;
        image204= R.drawable.vanilla204;
        image205= R.drawable.pink205;
        image206= R.drawable.blue206;

    }

    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}

