package com.example.blind75.arrays;

public class BestTimeToBuyAndSellStock {
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Example 1:
//Input: prices = [1, 2, 3, 0, 2]
//Output: 3
//Explanation: Buy on day 1 (price = 1) and sell on day 3 (price = 3), profit = 3-1 = 2.
//             Then buy on day 4 (price = 0) and sell on day 5 (price = 2), profit = 2-0 = 2.
//Example 2:
//Input: prices = [1, 2, 4, 2, 5]
//Output: 4
//Explanation: Buy on day 1 (price = 1) and sell on day 2 (price = 2), profit = 2-1 = 1.
//             Then buy on day 3 (price = 4) and sell on day 4 (price = 5), profit = 5-4 = 1.
//Example 3:
//Input: prices = [7, 6, 4, 3, 1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.
//Constraints:
//1 <= prices.length <= 3 * 10^4
//0 <= prices[i] <= 10^4
//
//Solution: O(n) time and O(1) space complexity.
    //We can use a for loop to iterate through the array and check if the current value is less than the previous value.
//If it is, we set the previous value to the current value.
//If it is not, we calculate the difference between the current value and the previous value and set the previous value to the current value.
//Time Complexity: O(n) - Linear time complexity.
//Space Complexity: O(1) - Constant space complexity.
//Hashmap: O(n) - Linear time complexity.
//Hashmap: O(1) - Constant space complexity.

    public static int maxProfit(int[] prices) {
        int previous = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < previous) {
                previous = prices[i];
            } else {
                result = Math.max(result, prices[i] - previous);
                previous = prices[i];
            }
        }
        return result;
    }

}
