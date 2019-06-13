package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_album );
        // creating ArrayList such as String ArrayList, int ArrayList .....
        // below we are creating a String arrayList
        ArrayList<String> albumList = new ArrayList<> ( );
        // adding values to the albumList
        albumList.add ( "Album 1" );
        albumList.add ( "Album 2" );
        albumList.add ( "Album 3" );
        albumList.add ( "Album 4" );
        albumList.add ( "Album 5" );
        // displaying albumList values in the logcat info
        Log.v ( "AlbumList Values", "AlbumList values index 0 is " + albumList.get ( 0 ) );
        Log.v ( "AlbumList Values", "AlbumList values index 1 is " + albumList.get ( 1 ) );
        Log.v ( "AlbumList Values", "AlbumList values index 2 is " + albumList.get ( 2 ) );
        Log.v ( "AlbumList Values", "AlbumList values index 3 is " + albumList.get ( 3 ) );
        Log.v ( "AlbumList Values", "AlbumList values index 4 is " + albumList.get ( 4 ) );

    }
}
