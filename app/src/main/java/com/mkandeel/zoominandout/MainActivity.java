package com.mkandeel.zoominandout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ortiz.touchview.TouchImageView;

public class MainActivity extends AppCompatActivity {

    private TouchImageView imageView;
    private String url = "https://img.freepik.com/free-photo/liquid-marbling-paint-texture-background-fluid-painting-abstract-texture-intensive-color-mix-wallpaper_1258-99549.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }


}