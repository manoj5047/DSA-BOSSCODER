package week1.class1.assignment.absoluteValueExpression

import kotlin.math.abs

/*
*
* Given two arrays of integers with equal lengths, return the maximum value of:

|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

where the maximum is taken over all 0 <= i, j < arr1.length.



Example 1:

Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
Output: 13
Example 2:

Input: arr1 = [1,-2,-5,0,10], arr2 = [0,-2,-1,-7,-4]
Output: 20


Constraints:

2 <= arr1.length == arr2.length <= 40000
-10^6 <= arr1[i], arr2[i] <= 10^6*/

fun main() {
    val inputarray1 = intArrayOf(1, 2, 3, 4)
    val inputarray2 = intArrayOf(-1, 4, 5, 6)
    val solution = Solution().maxAbsValExpr(inputarray1, inputarray2)
}

class Solution {
    fun maxAbsValExpr(arr1: IntArray, arr2: IntArray): Int {
        val result = 0
        for (i in 0..<arr1.size) {
//|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

//            result = abs(arr1[i] - arr2[i]) + abs(arr2[i])
        }
        return 0
    }
}