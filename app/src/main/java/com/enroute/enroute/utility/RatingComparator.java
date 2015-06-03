package com.enroute.enroute.utility;

import com.enroute.enroute.model.Businesses;

import java.util.Comparator;

/**
 * Created by Patrick on 5/9/2015.
 */
public class RatingComparator implements Comparator<Businesses> {
    public int compare(Businesses b1, Businesses b2) {
        if (b1.getStars() < b2.getStars()) {
            return -1;
        } else if (b1.getStars() == b2.getStars()) {
            return 0;
        } else {
            return 1;
        }
    }


}