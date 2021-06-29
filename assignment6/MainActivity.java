package com.example.lab05;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = findViewById(R.id.img);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.in);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                anim.setFillAfter(true);
                imageView.startAnimation(anim);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        imageView.startAnimation(anim);
    }
}
