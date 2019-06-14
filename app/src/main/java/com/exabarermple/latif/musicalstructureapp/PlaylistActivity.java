package com.exabarermple.latif.musicalstructureapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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
        ArrayList<String> playList = new ArrayList<String> ();
        // adding values to the ArrayList
        playList.add ( "PlayList 1" );
        playList.add ( "PlayList 2" );
        playList.add ( "PlayList 3" );
        playList.add ( "PlayList 4" );
        playList.add ( "PlayList 5" );
        // Creating ArrayAdapter so that we can display the array values in android system layout
        //android.R.layout.simple_expandable_list_item_1
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String> ( this, android.R.layout.simple_expandable_list_item_1, playList );
        ListView listView = (ListView) findViewById ( R.id.playlistView );
        listView.setAdapter ( itemsAdapter );
    }
}


