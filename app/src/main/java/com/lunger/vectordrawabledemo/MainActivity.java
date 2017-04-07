package com.lunger.vectordrawabledemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Create by lunger on 2016/5/1
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //机器人
        ImageView robot = (ImageView) findViewById(R.id.iv_robot);
        Drawable drawable = robot.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

        //折线
        ImageView triangle = (ImageView) findViewById(R.id.iv_triangle);
        Drawable drawable2 = triangle.getDrawable();
        if (drawable2 instanceof Animatable) {
            ((Animatable) drawable2).start();
        }
    }
}
