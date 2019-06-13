package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_artist );
        // creating Array for the artist_list
        String[] artist_list = new String[5];
        // adding value to artist_list
        artist_list[0] = "Artist 1";
        artist_list[1] = "Artist 2";
        artist_list[2] = "Artist 3";
        artist_list[3] = "Artist 4";
        artist_list[4] = "Artist 5";
        // displaying the value as a Logcat info
        Log.v ("artist_list value","artist_list[0] is " + artist_list[0]);
        Log.v ("artist_list value","artist_list[1] is " + artist_list[1]);
        Log.v ("artist_list value","artist_list[2] is " + artist_list[2]);
        Log.v ("artist_list value","artist_list[4] is " + artist_list[3]);
        Log.v ("artist_list value","artist_list[5] is " + artist_list[4]);


    }
}
