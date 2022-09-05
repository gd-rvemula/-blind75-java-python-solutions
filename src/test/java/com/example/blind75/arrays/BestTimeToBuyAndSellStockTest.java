package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @org.junit.jupiter.api.Test
    void maxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        int result = BestTimeToBuyAndSellStock.maxProfit(prices);
        assertEquals(2, result);
    }
}



