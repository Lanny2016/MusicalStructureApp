package com.exabarermple.latif.musicalstructureapp;

/** we made the ListValues class to display the two values by using custom_list layout
 * which includes 2 list values such as Playlist 1 and Old Song for the PlaylistActivity
 * because system layout only ==>android.R.layout.simple_expandable_list_item_1
 * only shows one value as a list
 * by making our own class we can display the values on the custom_list*/

public class ListValues {
    // fist value object for the ListValue
    private String firstValue;
    // second value object for the ListValue
    private String secondValue;
    // constructor for the value objects so that we call them later
    // constructors no return type
    public ListValues(String firstValue, String secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    /**creating methods so that we can get the values when we need them
     * we should make them public to get it outside of the method
     *the methods should be String methods because we made String object
     * these methods have return type String coz we made as String*/
    public String getFirstValue(){
        return firstValue;
    }
    public String getSecondValue(){
        return secondValue;
    }


}
