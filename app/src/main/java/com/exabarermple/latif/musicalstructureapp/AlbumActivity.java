package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_album );
        // creating array for the album_list
        String[] album_list = new String[5];
        // adding value to the album_list
        album_list[0] = "AlbumList 1";
        album_list[1] = "AlbumList 2";
        album_list[2] = "AlbumList 3";
        album_list[3] = "AlbumList 4";
        album_list[4] = "AlbumList 5";
        // displaying album_list value as a Logcat info
        Log.v ("album_list value", "album_list[0] is " + album_list[0]);
        Log.v ("album_list value", "album_list[1] is " + album_list[1]);
        Log.v ("album_list value", "album_list[2] is " + album_list[2]);
        Log.v ("album_list value", "album_list[3] is " + album_list[3]);
        Log.v ("album_list value", "album_list[4] is " + album_list[4]);
    }
}
