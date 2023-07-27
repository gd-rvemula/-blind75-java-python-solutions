package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class maxProductTest {

    @org.junit.jupiter.api.Test
    void maxProduct() {
        int[] nums = new int[]{2, 3, -2, 4};
        int result = maxProduct.maxProduct(nums);
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void maxProduct2() {
        int[] nums = new int[]{-2, 0, -1};
        int result = maxProduct.maxProduct(nums);
        assertEquals(0, result);
    }

}