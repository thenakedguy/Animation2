package com.hngdngcorp.hngdng.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgAll;
    private Button mBtnRotate;
    private Button mBtnMoving;
    private Button mBtnZoom;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         animation = (Animation) AnimationUtils.loadAnimation(this,R.anim.zoom);


        mImgAll = findViewById(R.id.imgAll);
        mBtnRotate = findViewById(R.id.btnRotate);
        mBtnMoving = findViewById(R.id.btnMoving);
        mBtnZoom = findViewById(R.id.btnZoom);

        mBtnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation;
                int dest = 360;
                if (mImgAll.getRotation() == 360) {
                    System.out.print(mImgAll.getAlpha());
                    dest = 0;
                }
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mImgAll,"rotation",dest);
                objectAnimator.setDuration(3000);
                objectAnimator.start();

            }
        });
        mBtnMoving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(mImgAll, "translationX", 100f);
                animation.setDuration(2000);
                animation.setRepeatMode(ValueAnimator.RESTART);
                animation.setRepeatCount(1000);
                animation.start();

            }
        });
        mBtnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImgAll.startAnimation(animation);
            }
        });

    }

    public void bai2(View view) {
        Intent intent = new Intent(this,Bai2.class);
        startActivity(intent);
    }

    public void bai3(View view) {
        Intent intent = new Intent(this,Bai3.class);
        startActivity(intent);
    }
}
