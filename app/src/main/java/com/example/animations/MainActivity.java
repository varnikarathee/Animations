package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    boolean variable = true;

    public void fade(View view) {
        //to check if image tapped
        final String TAG=" values";
//        Log.i(TAG, "image tapped ");

        ImageView iv1= (ImageView) findViewById(R.id.imageView2);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView3);
        //to check if one image fades into another
//        iv1.animate().alpha(0).setDuration(200);
//        iv2.animate().alpha(1).setDuration(200);
        // to check if they fade into each other back and forth on click everytime.
//        if(variable){
//            variable=false;
//            iv1.animate().alpha(0).setDuration(200);
//            iv2.animate().alpha(1).setDuration(200);
//
//        }
//        else{
//            variable=true;
//            iv1.animate().alpha(1).setDuration(200);
//            iv2.animate().alpha(0).setDuration(200);
//        }
        //to move up/down translateYBy(200) +200 moves down and -200 moves up

//        iv1.animate().translationYBy(-200).setDuration(200);

        //to move left/right translationXBy(-200) -200 moves left and 200 right.

//        iv1.animate().translationXBy(-200).setDuration(200);
        //to rotate +200 clockwise -200anti
//        iv1.animate().rotation(100).setDuration(200);
        //fade and rotate
//        iv1.animate().rotation(-200).alpha(0).setDuration(200);
        //to shrink
//        iv1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200);
        //to enter an object from left , spiral  initially after setx in oncreate , make this
        iv1.animate().translationXBy(1000).rotation(200).setDuration(200);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to enter an object from left , spiral  initially
        //initially setx for image
        ImageView iv1= (ImageView) findViewById(R.id.imageView2);
        iv1.setX(-1000);


    }


}