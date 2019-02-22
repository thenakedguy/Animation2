package com.hngdngcorp.hngdng.animation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bai3 extends AppCompatActivity {
    private ImageView mImageView;
    private ImageView mImageView2;
    private ImageView mImageView3;
    private ImageView mImageView4;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);



        mImageView = findViewById(R.id.imageView);
        mImageView2 = findViewById(R.id.imageView2);
        mImageView3 = findViewById(R.id.imageView3);
        mImageView4 = findViewById(R.id.imageView4);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mImageView2,"rotation",360);
                objectAnimator.setDuration(21600000);
                objectAnimator.start();
                ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(mImageView3,"rotation",360);
                objectAnimator1.setDuration(360000);
                objectAnimator1.start();
                ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(mImageView4,"rotation",360);
                objectAnimator2.setDuration(6000);
                objectAnimator2.start();
            }
        });

    }
}
