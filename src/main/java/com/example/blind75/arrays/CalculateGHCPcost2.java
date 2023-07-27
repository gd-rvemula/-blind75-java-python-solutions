package com.example.blind75.arrays;

public class CalculateGHCPcost2 {

    //calculate the cost of the GHCP
    public static long convert(long perMonth, int nbrusers, int nbrMonths) {
        int MIN_SUBSCRIPTION_COST = 100;
        int MAX_SUBSCRIPTION_COST = 1000;
        if (nbrusers == 0) {
            return MIN_SUBSCRIPTION_COST;
        } else {
            if (perMonth * nbrusers * nbrMonths > MAX_SUBSCRIPTION_COST) {
                return MAX_SUBSCRIPTION_COST;
            } else
                return perMonth * nbrusers ;
        }

    }
}


