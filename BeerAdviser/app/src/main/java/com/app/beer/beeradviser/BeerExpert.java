package com.app.beer.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayavardhanravi on 5/17/2016.
 */
public class BeerExpert {
    List<String> findingBeer(String beer_type)
    {
        List<String> btype = new ArrayList<String>();
        if(beer_type.equals("light"))
        {
            btype.add("Sam Adams Light");
            btype.add("Bud Ice");
            btype.add("Bud Light Lime");
            btype.add("Bud Light Platinum");
            btype.add("Corona Light");
        }
        else if(beer_type.equals("brown"))
        {
            btype.add("Founders Sumatra Mountain Brown");
            btype.add("Coffee Okie");
            btype.add("Cacao Bender");
            btype.add("Palo Santo Marron");
            btype.add("Coffee Bender");
        }
        else if(beer_type.equals("amber"))
        {
            btype.add("Tröegs Nugget Nectar");
            btype.add("Zoe");
            btype.add("Tocobaga Red Ale");
            btype.add("Amber Smashed Face");
            btype.add("Lagunitas Lucky 13 Mondo Large Red Ale");
        }
        else if(beer_type.equals("dark"))
        {
            btype.add("Pile O' Dirt Porter");
            btype.add("Smoke Jumper Stout");
            btype.add("11th Hour IPA");
            btype.add("Canyon Cream Ale");
            btype.add("Wilderness Wheat Ale");
        }
        else
        {
            btype.add("We are dumb to find a beer for you!!!");
        }
        return btype;
    }
}
