package com.jamesvuong.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        //Get calling intent and set title
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        this.setTitle(name);
    }
}
