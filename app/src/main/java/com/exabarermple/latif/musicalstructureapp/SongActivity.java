package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_song );
        // creating array for song_list
        String[] song_list = new String[5];
        // adding value to the song_list
        song_list[0] = "Song 1";
        song_list[1] = "Song 2";
        song_list[2] = "Song 3";
        song_list[3] = "Song 4";
        song_list[4] = "Song 5";
        // displaying song_list value as a Logcat info
        Log.v ("song_list value","song_list[0] is " + song_list[0]);
        Log.v ("song_list value","song_list[1] is " + song_list[1]);
        Log.v ("song_list value","song_list[2] is " + song_list[2]);
        Log.v ("song_list value","song_list[3] is " + song_list[3]);
        Log.v ("song_list value","song_list[4] is " + song_list[4]);

    }
}
