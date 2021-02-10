package com.example.serviceproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start, stop;
    private ImageView IV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById( R.id.buttonStart);
        stop = (Button) findViewById( R.id.buttonStop);
        IV = (ImageView) findViewById(R.id.imageView);

        start.setOnClickListener( this );
        stop.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if (view==start){
            IV.setVisibility(View.VISIBLE);
            startService( new Intent( this, MyAndroidServices.class));
        }else if (view==stop){
            IV.setVisibility(View.INVISIBLE);
            stopService( new Intent( this, MyAndroidServices.class));
        }

    }
}