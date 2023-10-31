# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
import unittest


class TwoSumTests(unittest.TestCase):
    # def test_TwoSum(self):
    #     solution = Solution()
    #     self.assertEqual(solution.twoSum([2,7,11,15], 9), [0,1])
    #     self.assertEqual(solution.twoSum([3,2,4], 6), [1,2])
    #     self.assertEqual(solution.twoSum([3,3], 6), [0,1])

    def generateLargeArray(self, size):
        size=1000
        unique_integers = list(range(1, array_size + 1))
        random.shuffle(unique_integers)
        random_integers = [random.randint(1, array_size) for i in range(array_size)]
        print(random_integers)
