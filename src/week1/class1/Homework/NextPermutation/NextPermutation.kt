package week1.class1.Homework.NextPermutation
/*
* A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
* More formally, if all the permutations of the array are sorted in one container according to their lexicographical order,
*  then the next permutation of that array is the permutation that follows it in the sorted container.
* If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.



Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
*
*
* */

fun main() {
    val inputArray = intArrayOf(1, 2, 3)
    val inputArray2 = intArrayOf(3, 2, 1)
    val inputArray3 = intArrayOf(1, 1, 5)
    val inputArray4 = intArrayOf(5, 4, 7, 5, 3, 2)
    val inputArray5 = intArrayOf(4, 2, 0, 2, 3, 2, 0)
    val inputArray6 = intArrayOf(1, 3, 2)
//    Solution().nextPermutation(inputArray)
//    Solution().nextPermutation(inputArray2)
//    Solution().nextPermutation(inputArray3)
//    Solution().nextPermutation(inputArray4)
//    Solution().nextPermutation(inputArray5)
    Solution().nextPermutation(inputArray6)

}

class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        /*
        * Approach for next permutation.
        * Largest index in array where nums[k] < nums[k+1], store K
        * Largest index in array where nums[l] > nums[k], store l
        * swap indexes of both l and k
        * Reverse all elements from K+1 to end.
        * */
        println("===============================")
        println("Before Swap :: ${nums.toList()}")

        var k = 0
        var l = 0
        for (index in nums.indices) {
            if (index != nums.size - 1 && nums[index] < nums[index + 1]) {
                k = index
            }
        }
        println("K :: $k VAL :: ${nums[k]}")

        for (index in nums.indices) {
            if (nums[k] < nums[index]) {
                l = index
            }
        }
        println("L :: $l VAL :: ${nums[l]}")

        if (k == l) {
            nums.sort()
        } else {
            swapTwoNumbers(nums, k, l)
            println("After Swap :: ${nums.toList()} size ${nums.size}")
            //reverse
            var left = k + 1
            var right = nums.size - 1

            while (left < right) {
                swapTwoNumbers(nums, left, right)
                println("In each Swap   :: ${nums.toList()}")
                left++
                right--
            }
        }
        println("Result :: ${nums.toList()}")

    }

    private fun swapTwoNumbers(nums: IntArray, left: Int, right: Int) {
        val temp: Int = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
    }
}