package com.example.blind75.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumberInAnArrayTest {

    @Test
    void findFirstPrimeNumber() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = FindPrimeNumberInAnArray.findFirstPrimeNumber(nums);
        assertEquals(2, result);
    }

    @Test
    void isPrime() {
        int num = 7;
        boolean result = FindPrimeNumberInAnArray.isPrime(num);
        assertTrue(result);
    }
}