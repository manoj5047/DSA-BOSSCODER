package week1.class2.assignment

import kotlin.math.abs

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
/*
* Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.



Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100


Follow up: Could you find an O(n + m) solution?
*
* */
fun main() {
    val mainArray = arrayOf(
        intArrayOf(4, 3, 2, -1),
        intArrayOf(3, 2, 1, -1),
        intArrayOf(1, 1, -1, -2),
        intArrayOf(-1, -1, -2, -3),
    )
    val mainArray2 = arrayOf(
        intArrayOf(3, 2),
        intArrayOf(1, 0),
//        intArrayOf(1, 1, -1, -2),
//        intArrayOf(-1, -1, -2, -3),
    )
    val mainArray3 = arrayOf(
        intArrayOf(-1),

        )
    val mainArray4 = arrayOf(
        intArrayOf(5, 1, 0),
        intArrayOf(-5, -5, -5),

        )
    println(CountNegativeNumbersInsortedMatrix().countNegatives(mainArray))
    println(CountNegativeNumbersInsortedMatrix().countNegatives(mainArray2))
    println(CountNegativeNumbersInsortedMatrix().countNegatives(mainArray3))
    println(CountNegativeNumbersInsortedMatrix().countNegatives(mainArray4))
}

class CountNegativeNumbersInsortedMatrix {
    fun countNegatives(grid: Array<IntArray>): Int {
        var result = 0
        for (r in grid) {
            val mid = abs(r.size / 2)
            if (r[mid] < 0) {
                result += (r.size - mid)
                result = calculateNegativCount(0..<mid, result,r)
            } else {
                result = calculateNegativCount(mid..<r.size, result,r)

            }

        }
        return result
    }

    private fun calculateNegativCount(range: IntRange, result: Int,row:IntArray): Int {
        var result1 = result
        for (i in range) {
            if (row[i]<0){
                result1 += 1
            }
        }
        return result1
    }

    fun calculateNegativCount() {

    }
}