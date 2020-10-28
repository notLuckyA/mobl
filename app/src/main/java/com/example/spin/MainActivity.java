package com.example.spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ImageView weel;

    Random rd;
    int st = 0, sto = 0;

    private static final float Factor = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        weel = (ImageView) findViewById(R.id.weel);

        rd = new Random();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sto = st % 360;
                st = rd.nextInt(3600) + 720;
                RotateAnimation rotate = new RotateAnimation(sto, st,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(cn(360 - (st % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                weel.startAnimation(rotate);
            }
        });
    }

    private String cn(int stt) {
        String text = "";
        if (stt >= (Factor * 1) && stt < (Factor * 3)) {
            text = "32 red";
        }
        if (stt >= (Factor * 3) && stt < (Factor * 5)) {
            text = "15 black";
        }
        if (stt >= (Factor * 5) && stt < (Factor * 7)) {
            text = "19 red";
        }
        if (stt >= (Factor * 7) && stt < (Factor * 9)) {
            text = "4 black";
        }
        if (stt >= (Factor * 9) && stt < (Factor * 11)) {
            text = "21 red";
        }
        if (stt >= (Factor * 11) && stt < (Factor * 13)) {
            text = "2 black";
        }
        if (stt >= (Factor * 13) && stt < (Factor * 15)) {
            text = "25 red";
        }
        if (stt >= (Factor * 15) && stt < (Factor * 17)) {
            text = "17 black";
        }
        if (stt >= (Factor * 17) && stt < (Factor * 19)) {
            text = "34 red";
        }
        if (stt >= (Factor * 19) && stt < (Factor * 21)) {
            text = "6 black";
        }
        if (stt >= (Factor * 21) && stt < (Factor * 23)) {
            text = "27 red";
        }
        if (stt >= (Factor * 23) && stt < (Factor * 25)) {
            text = "13 black";
        }
        if (stt >= (Factor * 25) && stt < (Factor * 27)) {
            text = "36 red";
        }
        if (stt >= (Factor * 27) && stt < (Factor * 29)) {
            text = "11 black";
        }
        if (stt >= (Factor * 29) && stt < (Factor * 31)) {
            text = "30 red";
        }
        if (stt >= (Factor * 31) && stt < (Factor * 33)) {
            text = "8 black";
        }
        if (stt >= (Factor * 33) && stt < (Factor * 35)) {
            text = "23 red";
        }
        if (stt >= (Factor * 35) && stt < (Factor * 37)) {
            text = "10 black";
        }
        if (stt >= (Factor * 37) && stt < (Factor * 39)) {
            text = "5 red";
        }
        if (stt >= (Factor * 39) && stt < (Factor * 41)) {
            text = "24 black";
        }
        if (stt >= (Factor * 41) && stt < (Factor * 43)) {
            text = "16 red";
        }
        if (stt >= (Factor * 43) && stt < (Factor * 45)) {
            text = "33 black";
        }
        if (stt >= (Factor * 45) && stt < (Factor * 47)) {
            text = "1 red";
        }
        if (stt >= (Factor * 47) && stt < (Factor * 49)) {
            text = "20 black";
        }
        if (stt >= (Factor * 49) && stt < (Factor * 51)) {
            text = "14 red";
        }
        if (stt >= (Factor * 51) && stt < (Factor * 53)) {
            text = "31 black";
        }
        if (stt >= (Factor * 53) && stt < (Factor * 55)) {
            text = "9 red";
        }
        if (stt >= (Factor * 55) && stt < (Factor * 57)) {
            text = "22 black";
        }
        if (stt >= (Factor * 57) && stt < (Factor * 59)) {
            text = "18 red";
        }
        if (stt >= (Factor * 59) && stt < (Factor * 61)) {
            text = "29 black";
        }
        if (stt >= (Factor * 61) && stt < (Factor * 63)) {
            text = "7 red";
        }
        if (stt >= (Factor * 63) && stt < (Factor * 65)) {
            text = "28 black";
        }
        if (stt >= (Factor * 65) && stt < (Factor * 67)) {
            text = "12 red";
        }
        if (stt >= (Factor * 67) && stt < (Factor * 69)) {
            text = "35 black";
        }
        if (stt >= (Factor * 69) && stt < (Factor * 71)) {
            text = "3 red";
        }
        if (stt >= (Factor * 71) && stt < (Factor * 73)) {
            text = "26 black";
        }
        if ((stt >= (Factor * 73) && stt < 360) || (stt >= 0 && stt < (Factor * 1))) {
            text = "0 green";
        }

        return text;
    }
}
