package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Solution: O(n) time and O(n) space complexity. We can use a hashmap to store the values and their indices.
// We can use a for loop to iterate through the array and check if the target - current value is in the hashmap.
// If it is, we return the indices. If not, we add the current value to the hashmap.
// Time Complexity: O(n) - Linear time complexity.
// Space Complexity: O(n) - Linear space complexity.
// Hashmap: O(n) - Linear time complexity.
// Hashmap: O(n) - Linear space complexity.


class twosumTest {
    @org.junit.jupiter.api.Test
    void twoSum() {
        int[] nums = new int[]{2, 1, 7, 11, 9, 15};
        int target = 9;
        int[] result = new int[2];
        result = twosum.twoSum(nums, target);

        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

}