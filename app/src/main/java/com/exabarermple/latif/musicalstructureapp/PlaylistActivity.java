package com.exabarermple.latif.musicalstructureapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        // displaying the value of the play_list on the layout

        LinearLayout display_list_value = (LinearLayout)findViewById ( R.id.displayListViewValue );

        TextView listValue1 = new TextView ( this );
        listValue1.setText ( play_list[0] );
        listValue1.setTextSize ( 25 );
        listValue1.setTextColor ( Color.WHITE );
        display_list_value.addView ( listValue1 );
        // displaying the second value of the play_list on the layout//
        TextView listValue2 = new TextView ( this );
        listValue2.setText ( play_list[1] );
        listValue2.setTextSize ( 25 );
        listValue2.setTextColor ( Color.WHITE );
        display_list_value.addView ( listValue2 );

    }
}
