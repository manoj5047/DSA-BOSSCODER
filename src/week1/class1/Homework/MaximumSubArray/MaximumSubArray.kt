package week1.class1.Homework.MaximumSubArray

/*
* https://leetcode.com/problems/maximum-subarray/description/
Given an integer array nums, find the
subarray  with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
* [5,4,-1,7,8]
* maxhere = -100
* maxhere = 5 maxsofar = 5
* maxhere = 5+(4)
* maxhere = 9 maxsofar = 9
* maxherer = 9+(-1)= 8
* maxhere = 8 maxsofar = 9
* maxhere = 8+(7) = 15
* maxhere = 15 maxsofar = 15
* maxhere = 15+(8) = 23
* maxhere = 23 maxsofar = 23
*
* */


fun main() {
    val input = intArrayOf(2, 1, -3, 4, -1, 2, 1, -5, 4)
    val input2 = intArrayOf(5, 4, -1, 7, 8)
    val input3 = intArrayOf(1)
    val input4 = intArrayOf(-1)
    val input5 = intArrayOf(-1, 0, -2)
    val result = Solution().maxSubArray(input)
    val result2 = Solution().maxSubArray(input2)
    val result3 = Solution().maxSubArray(input3)
    val result4 = Solution().maxSubArray(input4)
    val result5 = Solution().maxSubArray(input5)
    println("Expected 6 Result $result")
    println("Expected 23 Result $result2")
    println("Expected 1 Result $result3")
    println("Expected -1 Result $result4")
    println("Expected 0 Result $result5")
}

class Solution {

    private fun getArraySum(array: IntArray): Int {
        var result = 0
        array.forEach { element ->
            result += element

        }
        return result
    }

//    fun maxSubArray(nums: IntArray): Int {
//        var largestArraySum = Int.MIN_VALUE
//        for (index in nums.indices) {
//            for (subIndex in index..<nums.size) {
//                val subArray = nums.sliceArray(index..subIndex)
//                val subArraySum = getArraySum(subArray)
//                if (largestArraySum < subArraySum ) {
//                    largestArraySum = subArraySum
//                }
//
//            }
//        }
//        return largestArraySum
//    }

    //       fun maxSubArray(nums: IntArray): Int {
//        var maxHere = 0
//        var maxSoFar =Int.MIN_VALUE
//        var i=0
//        for(i in 0..nums.size-1){
//            maxHere = maxHere + nums[i]
//            if (maxHere < nums[i]){
//  	            maxHere=nums[i]
//            }
//            if (maxSoFar<maxHere){
//  	            maxSoFar = maxHere
//            }
//        }
//        return maxSoFar
//}
    fun maxSubArray(nums: IntArray): Int {
        var largestArraySum = Int.MIN_VALUE
        var currentArraySum = 0
        for (index in nums.indices) {
            currentArraySum = maxOf(nums[index], currentArraySum + nums[index])
            largestArraySum = maxOf(largestArraySum, currentArraySum)

        }
        return largestArraySum
    }
}