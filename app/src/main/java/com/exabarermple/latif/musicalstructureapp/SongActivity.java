package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_song );
        // creating ArrayList such as String ArrayList, int ArrayList .....
        // below we are creating a String arrayList
        ArrayList<String> songList = new ArrayList<> ( );
        // adding values to the songList
        songList.add ( "Song 1" );
        songList.add ( "Song 2" );
        songList.add ( "Song 3" );
        songList.add ( "Song 4" );
        songList.add ( "Song 5" );
        // displaying songList values in the logcat info
        Log.v ( "SongList values","SongList value index 0 is" + songList.get ( 0 ));
        Log.v ( "SongList values","SongList value index 1 is" + songList.get ( 1 ));
        Log.v ( "SongList values","SongList value index 2 is" + songList.get ( 2 ));
        Log.v ( "SongList values","SongList value index 3 is" + songList.get ( 3 ));
        Log.v ( "SongList values","SongList value index 4 is" + songList.get ( 4 ));


    }
}
