package com.exabarermple.latif.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
/** to implement onClickListener for multiple buttons fist we should implement
 * View.OnClickListener on the public class MainActivity like above
 * this can save time to setting onClickListener for every button one by one*/
    private Button playList;
    private Button artist;
    private Button album;
    private Button songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        // casting the buttons
        playList = (Button)findViewById ( R.id.playListButton );
        artist = (Button)findViewById ( R.id.artistButton );
        album = (Button)findViewById ( R.id.albumButton );
        songs = (Button)findViewById ( R.id.songsButton );
        // setting onClickListener for the MultipleButtons
        playList.setOnClickListener (this);
        artist.setOnClickListener (this);
        album.setOnClickListener (this);
        songs.setOnClickListener (this);

        }
    @Override
    public void onClick(View v) {
        switch(v.getId ()){
            case R.id.playListButton:
                Intent playlistIntent = new Intent ( MainActivity.this,PlaylistActivity.class );
                startActivity (playlistIntent);
                break;
            case R.id.artistButton:
                Intent artistIntent = new Intent ( MainActivity.this,ArtistActivity.class );
                startActivity (artistIntent);
                break;
            case R.id.albumButton:
                Intent albumIntent = new Intent ( MainActivity.this,AlbumActivity.class );
                startActivity (albumIntent);
                break;
            case R.id.songsButton:
                Intent songsIntent = new Intent ( MainActivity.this,SongActivity.class );
                startActivity (songsIntent);
                break;
        }

    }
}





