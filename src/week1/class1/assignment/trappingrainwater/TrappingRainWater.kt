package week1.class1.assignment.trappingrainwater

import kotlin.math.min

/*
* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9


Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
* */

fun main() {
    val inputArray = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    val inputArray2 = intArrayOf(4, 2, 0, 3, 2, 5)
    println(Solution().trap(inputArray))
    println(Solution().trap(inputArray2))
}

class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        if (n < 0) {
            return 0
        }
        val left = IntArray(n)
        val right = IntArray(n)
        var max = height[0]
        for (i in height.indices) {
            max = maxOf(max, height[i])
            left[i] = max
        }
        max = height[n - 1]
        for (i in n - 1 downTo 0) {
            max = maxOf(max, height[i])
            right[i] = max
        }
        println(left.joinToString { " " })
        println(right.joinToString { " " })
        var tw = 0
        for (i in height.indices) {
            tw += minOf(left[i],right[i]) - height[i]

        }
        return tw
    }

    fun trap_matrix_approach(height: IntArray): Int {
        var rows = 0
        height.iterator().forEach {
            if (rows < it) {
                rows = it
            }
        }
        val columns = height.size
        val heightMatrix = Array(rows) { Array(columns) { 0 } }
        for (index in height.indices) {
            for (i in 0..<height[index]) {
                heightMatrix[i][index] = 1
            }
        }
        var gaps = 0
        for (row in heightMatrix) {
            var isOneOpened = false
            var openIndex = 0
            for (index in row.indices) {
                if (row[index] == 1) {
                    isOneOpened = true
                    openIndex = index
                }
                if (isOneOpened && row[index] == 0) {
                    if (index == row.size - 1) {
                        gaps -= ((row.size - 2) - openIndex)
                    } else {
                        gaps += 1
                    }
                }

            }
        }

        return gaps
    }

    fun print2DArray(array: Array<Array<Int>>) {
        array.forEach { row ->
            println(row.joinToString(" "))
        }
    }
}