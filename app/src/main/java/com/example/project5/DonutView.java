package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class DonutView extends AppCompatActivity {
    ImageView myImgView = (ImageView)findViewById(R.id.DonutImg);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_view);
    }
}