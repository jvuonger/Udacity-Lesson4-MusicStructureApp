package com.jamesvuong.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        //Get calling intent and set title
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        this.setTitle(name);

        //Set "Play Song" button to show detailed view
        Button play_song_button = (Button) findViewById(R.id.play_song_button);
        play_song_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenreActivity.this, SongDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
