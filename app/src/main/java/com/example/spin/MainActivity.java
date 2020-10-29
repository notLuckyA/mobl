package com.example.spin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ImageView weel;
    EditText vvod2;
    EditText vvod;
    Random rd;
    int st = 0, sto = 0;

    private static final float Factor = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vvod = (EditText) findViewById(R.id.vvod);
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
        int e = Integer.parseInt(vvod.getText().toString());
        String text = "";
        if (stt >= (Factor * 1) && stt < (Factor * 3)) {
            if (e == 32) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 3) && stt < (Factor * 5)) {
            if (e == 15) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 5) && stt < (Factor * 7)) {
            if (e == 19) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 7) && stt < (Factor * 9)) {
            if (e == 4) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 9) && stt < (Factor * 11)) {
            if (e == 21) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 11) && stt < (Factor * 13)) {
            if (e == 2) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 13) && stt < (Factor * 15)) {
            if (e == 25) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 15) && stt < (Factor * 17)) {
            if (e == 17) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 17) && stt < (Factor * 19)) {
            if (e == 34) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 19) && stt < (Factor * 21)) {
            if (e == 6) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 21) && stt < (Factor * 23)) {
            if (e == 27) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 23) && stt < (Factor * 25)) {
            if (e == 13) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 25) && stt < (Factor * 27)) {
            if (e == 36) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 27) && stt < (Factor * 29)) {
            if (e == 11) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 29) && stt < (Factor * 31)) {
            if (e == 30) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 31) && stt < (Factor * 33)) {
            if (e == 8) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 33) && stt < (Factor * 35)) {
            if (e == 23) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 35) && stt < (Factor * 37)) {
            if (e == 10) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 37) && stt < (Factor * 39)) {
            if (e == 5) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 39) && stt < (Factor * 41)) {
            if (e == 24) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 41) && stt < (Factor * 43)) {
            if (e == 16) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 43) && stt < (Factor * 45)) {
            if (e == 33) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 45) && stt < (Factor * 47)) {
            if (e == 1) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 47) && stt < (Factor * 49)) {
            if (e == 20) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 49) && stt < (Factor * 51)) {
            if (e == 14) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 51) && stt < (Factor * 53)) {
            if (e == 31) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 53) && stt < (Factor * 55)) {
            if (e == 9) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 55) && stt < (Factor * 57)) {
            if (e == 22) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 57) && stt < (Factor * 59)) {
            if (e == 18) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 59) && stt < (Factor * 61)) {
            if (e == 29) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 61) && stt < (Factor * 63)) {
            if (e == 7) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 63) && stt < (Factor * 65)) {
            if (e == 28) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 65) && stt < (Factor * 67)) {
            if (e == 12) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 67) && stt < (Factor * 69)) {
            if (e == 35) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 69) && stt < (Factor * 71)) {
            if (e == 3) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if (stt >= (Factor * 71) && stt < (Factor * 73)) {
            if (e == 26) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }
        if ((stt >= (Factor * 73) && stt < 360) || (stt >= 0 && stt < (Factor * 1))) {
            if (e == 0) {
                text = "You win";
            } else {
                text = "You lose";
            }
        }

        return text;
    }
}
