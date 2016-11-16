package com.example.bolatalaat.itsharks;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent in = new Intent(MainActivity.this, home.class);
                startActivity(in);
                finish();
            }
        },5000);
        im=(ImageView)findViewById(R.id.image);
        im.setImageResource(R.drawable.itsharks);

    }
}
