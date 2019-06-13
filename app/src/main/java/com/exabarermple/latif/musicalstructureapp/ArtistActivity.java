package com.exabarermple.latif.musicalstructureapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        // displaying all the artistList values in the layout by using for loop
        LinearLayout displayLayout = (LinearLayout)findViewById ( R.id.displayArtistListViewValue );
        //creating the for loop
        for(int index = 0;index < artistList.size ();index++){
            // creating textView to display the values
            TextView displayTextView = new TextView ( this );
            // setting the text to be shown in the layout
            displayTextView.setText ( artistList.get( index ) );
            // setting the textSize
            displayTextView.setTextSize ( 25 );
            // setting textColor
            displayTextView.setTextColor ( Color.WHITE );
            // adding the textView in the layout as a child view to make it display
            displayLayout.addView ( displayTextView );
        }

    }
}
