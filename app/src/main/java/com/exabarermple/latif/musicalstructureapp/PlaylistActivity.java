package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_playlist );
        // creating Array to the play_list
       String[] play_list = new String[5];
       // adding value to the play_list
        play_list[0] = "Playlist 1";
        play_list[1] = "Playlist 2";
        play_list[2] = "Playlist 3";
        play_list[3] = "Playlist 4";
        play_list[4] = "Playlist 5";
        //displaying the play_list value as a LogCat info
        Log.v ("For Playlist Activity","play_list[0]: is " + play_list[0]);
        Log.v ("For Playlist Activity","play_list[1]: is " + play_list[1]);
        Log.v ("For Playlist Activity","play_list[2]: is " + play_list[2]);
        Log.v ("For Playlist Activity","play_list[3]: is " + play_list[3]);
        Log.v ("For Playlist Activity","play_list[4]: is " + play_list[4]);


    }
}
