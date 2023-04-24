package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    String welcomeText = "Rutgers Cafe";
    ImageButton CoffeeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeeButton = (ImageButton) findViewById(R.id.CoffeeButton);
        CoffeeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                System.out.println("wowzers in my trowzers");
            }
        });
    }
}