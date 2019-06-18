package com.exabarermple.latif.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/** to display the list values on the custom_list
 * we need to make custom adapter as well*/

public class CustomAdapter extends ArrayAdapter<ListValues> {
    // we created a constructor which we use to call the values in the custom_list
    public CustomAdapter(Context context, ArrayList<ListValues> playList) {
        super ( context,0,playList);
    }
    // now we need to create the @override getView method to display values

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**we will not use ==>the return super.getView ( position, convertView, parent );
         * because we use our own custom layout
         * so deleted it
         * now we inflate our own layout*/
        LayoutInflater layoutInflater = LayoutInflater.from (getContext ());
        // now we use the View convertView to inflate our custom layout
        View customView = layoutInflater.inflate ( R.layout.custom_list,parent,false );
        /**now we get reference(cast) the four values and set text and image
         * 1. String and get the position of them
         * 2. text values
         * 3. image */
        ListValues listItems = getItem ( position );
        TextView firstText =(TextView)customView.findViewById ( R.id.textOne );
        firstText.setText ( listItems.getFirstValue ());
        TextView secondText =(TextView)customView.findViewById ( R.id.textTwo);
        secondText.setText ( listItems.getSecondValue () );
        ImageView imageView = (ImageView)customView.findViewById ( R.id.image);
        imageView.setImageResource ( R.drawable.list_icon );
        return customView;

    }
}
