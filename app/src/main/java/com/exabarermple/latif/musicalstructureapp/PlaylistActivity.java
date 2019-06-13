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
        playList.add ( "PlayList 1" );
        playList.add ( "PlayList 2" );
        playList.add ( "PlayList 3" );
        playList.add ( "PlayList 4" );
        playList.add ( "PlayList 5" );
        // displaying all the ArrayList values on the layout by using while loop
 LinearLayout displayValueLayout = (LinearLayout)findViewById ( R.id.displayPlayListViewValue );

 // creating counter variable
        int index = 0;

       while(index<playList.size()){
           //Creating a new textView to display in the layout
           TextView displayTextView = new TextView ( this );
           // set the textColor
           displayTextView.setTextColor ( Color.WHITE );
           // set the textSize
           displayTextView.setTextSize ( 25 );
           // set the text to be current playList index
           displayTextView.setText ( playList.get ( index ) );
           // add the textView to layout as a child view to be shown in the layout
           displayValueLayout.addView ( displayTextView );
           index++;
        }
    }

}
