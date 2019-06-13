package com.exabarermple.latif.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_artist );
        // creating ArrayList such as String ArrayList, int ArrayList .....
        // below we are creating a String arrayList
        ArrayList<String> artistList = new ArrayList<> ( );
        // adding values to the artistList
        artistList.add ( "Artist 1" );
        artistList.add ( "Artist 2" );
        artistList.add ( "Artist 3" );
        artistList.add ( "Artist 4" );
        artistList.add ( "Artist 5" );
        // displaying artistList in the logcat info
        Log.v ( "ArtistList values","ArtistList values index 0 is " + artistList.get ( 0 ));
        Log.v ( "ArtistList values","ArtistList values index 1 is " + artistList.get ( 1 ));
        Log.v ( "ArtistList values","ArtistList values index 2 is " + artistList.get ( 2 ));
        Log.v ( "ArtistList values","ArtistList values index 3 is " + artistList.get ( 3 ));
        Log.v ( "ArtistList values","ArtistList values index 4 is " + artistList.get ( 4 ));



    }
}
