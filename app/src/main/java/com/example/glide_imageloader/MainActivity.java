package com.example.glide_imageloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);

        String[] urls = {
                "https://cdn.pixabay.com/photo/2017/04/16/20/42/brain-2235771__340.png",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.dreamstime.com%2Ffamous-batman-logo-isolated-yellow-background-famous-batman-logo-isolated-yellow-background-to-celebrate-batmans-image222852275&psig=AOvVaw3k7AtozTQbchtv79CQreHT&ust=1654238857487000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCICL0JGWjvgCFQAAAAAdAAAAABAQ"

        };
        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);

    }
}