package com.exabarermple.latif.musicalstructureapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_playlist );
        // creating ArrayList such as String ArrayList, int ArrayList .....
        // below we are creating a String arrayList
        ArrayList<String> playList = new ArrayList<String>( );
        // adding values to the ArrayList
        playList.add ( "AlbumList 1" );
        playList.add ( "AlbumList 2" );
        playList.add ( "AlbumList 3" );
        playList.add ( "AlbumList 4" );
        playList.add ( "AlbumList 5" );
        // displaying ArrayList values in the  Logcat info
        Log.v ( "ArrayList values","ArrayList values index 0 is " + playList.get ( 0 ));
        Log.v ( "ArrayList values","ArrayList values index 1 is " + playList.get ( 1 ));
        Log.v ( "ArrayList values","ArrayList values index 2 is " + playList.get ( 2 ));
        Log.v ( "ArrayList values","ArrayList values index 3 is " + playList.get ( 3 ));
        Log.v ( "ArrayList values","ArrayList values index 4 is " + playList.get ( 4 ));


         }

}
