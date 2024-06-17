package week1.class2.assignment

import kotlin.math.sign

/*
* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
*
* */

fun main() {
    val input = intArrayOf(1, 2, 3, 4)
    val result = RunningSumOf1DArray().runningSum(input)
    println(result.toList())
}

class RunningSumOf1DArray {
    fun runningSum(nums: IntArray): IntArray {
        for (index in 1..<nums.size) {
            nums[index] = nums[index - 1] + nums[index]
        }
        return nums;
    }
}