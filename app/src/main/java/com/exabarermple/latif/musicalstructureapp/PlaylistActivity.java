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
        ArrayList<ListValues> playList = new ArrayList<ListValues> ();
        // adding values to the ArrayList
       // playList.add ( "PlayList 1" );
        // creating ListValues object out of ListValues class
        ListValues listValues = new ListValues ("Playlist1","Old" );
        // now we add the values to playList array
        playList.add ( listValues );
        // or we can make it easy like below

        playList.add ( new ListValues ("Playlist2","Old" ) );
        playList.add ( new ListValues ("Playlist3","New" ) );
        playList.add ( new ListValues ("Playlist4","Old" ) );
        playList.add ( new ListValues ("Playlist5","New" ));
        // Creating ArrayAdapter so that we can display the array values in android system layout
        //android.R.layout.simple_expandable_list_item_1
//        ArrayAdapter<ListValues> itemsAdapter =
//                new ArrayAdapter<ListValues>(this,R.layout.custom_list ,playList);
        CustomAdapter customAdapter = new CustomAdapter ( this,playList );
        ListView listView = (ListView) findViewById ( R.id.playlistView );
        listView.setAdapter ( customAdapter );
    }
}


