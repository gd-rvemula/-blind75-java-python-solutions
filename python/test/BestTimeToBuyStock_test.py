# Best Time to Buy and Sell Stock
# You are given an array prices where prices[i] is the price of a given stock on the ith day.
# You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
# Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
import unittest
from BestTimeToBuyStock import Solution

class FindTime(unittest.TestCase):
    solution = Solution()
    def test_BestTimeToBuyStock(self):
        self.assertEqual(self.solution.maxProfit([7,1,5,3,6,4]), 5)
        self.assertEqual(self.solution.maxProfit([7,6,4,3,1]), 0)
        self.assertEqual(self.solution.maxProfit([2,4,1]), 2)
        self.assertEqual(self.solution.maxProfit([2,1,2,1,0,1,2]), 2)