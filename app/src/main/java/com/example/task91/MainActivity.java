package com.example.task91   ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {

    private static final String TAG = "MainActivity";


    Button btnPlay;
    EditText mYouTubeURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube_player);
        mYouTubeURL = findViewById(R.id.YouTubeURL);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        Log.d(TAG,"onCreate; Starting.");



        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YouTubePlay.class);
                intent.putExtra("mYouTubeURL", mYouTubeURL.getText().toString());
                startActivity(intent);

            }
        });
    }
}