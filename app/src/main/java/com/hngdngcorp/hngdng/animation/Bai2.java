package com.hngdngcorp.hngdng.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bai2 extends AppCompatActivity {
    private ImageView mImgAll;
    private Button mBtnAll;
    private Button mBtnDoremon;
    private Button mBtnNobita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);


        mImgAll = findViewById(R.id.imgAll);
        mBtnAll = findViewById(R.id.btnAll);
        mBtnDoremon = findViewById(R.id.btnDoremon);
        mBtnNobita = findViewById(R.id.btnNobita);


        mBtnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("all");
            }
        });
        mBtnDoremon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("doraemon");
            }
        });
        mBtnNobita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("nobita");
            }
        });

    }

    private void showImage(String img) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mImgAll,"translationX",0f,500f);
        objectAnimator.setDuration(2000);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(mImgAll,"alpha",1f,0f);
        objectAnimator1.setDuration(2000);

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(mImgAll,"translationX",-500f,0f);
        objectAnimator2.setDuration(2000);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(mImgAll,"alpha",0f,1f);
        objectAnimator3.setDuration(2000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator2).with(objectAnimator3).after(objectAnimator).after(objectAnimator1);
        animatorSet.start();
        final String imgName = img;
        objectAnimator1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (imgName == "nobita"){
                    mImgAll.setImageResource(R.drawable.nobita);
                }
                if (imgName == "doraemon"){
                    mImgAll.setImageResource(R.drawable.doraemon);
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }
}
