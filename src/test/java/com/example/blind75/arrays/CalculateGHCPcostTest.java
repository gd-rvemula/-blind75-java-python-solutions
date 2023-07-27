package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculateGHCPcostTest {

        @org.junit.jupiter.api.Test
        void calculate() {
            int perMonth = 100;
            int nbrusers = 10;
            int nbrMonths = 12;
            int expected = 12000;
            int actual = CalculateGHCPcost.Calculate(perMonth, nbrusers, nbrMonths);
            assertEquals(expected, actual);
        }

    @org.junit.jupiter.api.Test
    void calculateWhenZeroUser() {
        int perMonth = 100;
        int nbrusers = 0;
        int nbrMonths = 12;
        int expected = 100;
        int actual = CalculateGHCPcost.Calculate(perMonth, nbrusers, nbrMonths);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void calculateMaxSubscriptionCost(){
        int perMonth = 100;
        int nbrusers = 1000;
        int nbrMonths = 12;
        int expected = 1000;   //max subscription cost

        int actual = CalculateGHCPcost.Calculate(perMonth, nbrusers, nbrMonths);
        assertEquals(expected, actual);

    }
}