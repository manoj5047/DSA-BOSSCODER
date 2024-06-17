package week1.class1.Homework.SetMatrixZeros

/*
https://leetcode.com/problems/set-matrix-zeroes/description/
* Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.



Example 1:


Input: matrix = [
[1,1,1],
[1,0,1],
[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

* */

fun main() {
    val inputOne = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1),
    )
    val inputTwo = arrayOf(
        intArrayOf(0, 1, 2, 0),
        intArrayOf(3, 4, 5, 2),
        intArrayOf(1, 3, 1, 5)
    )
    val resultOne = Solution().setZeroes(inputOne)
    val resultTwo = Solution().setZeroes(inputTwo)
    println("result_one :: $resultOne")
    println("result_two :: $resultTwo")
}

class Solution {

    fun setZeroes(matrix: Array<IntArray>) {
        var doesFirstColumnHasZeroes = false
        var doesFirstRowsHasZeroes = false
        val rows = matrix.size
        val columns = matrix.first().size
        for (i in 0..<columns) {
            if (matrix[0][i] == 0) {
                doesFirstRowsHasZeroes = true
                break
            }

        }
        for (j in 0..<rows) {
            if (matrix[j][0] == 0) {
                doesFirstColumnHasZeroes = true
                break
            }
        }

        for (i in 1..<rows) {
            for (j in 1..<columns) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                }
            }
        }

        for (i in 1..<rows) {
            for (j in 1..<columns) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0
                }
            }
        }

        if (doesFirstRowsHasZeroes) {
            for (i in 0..<columns) {
                matrix[0][i] = 0
            }
        }
        if (doesFirstColumnHasZeroes) {
            for (j in 0..<rows) {
                matrix[j][0] = 0
            }
        }
    }

    fun setZeroes_v1(matrix: Array<IntArray>): Unit {
        /*
        * IDead
        * First we need to identify the location of the Zero elements
        * Identify and store them in a separate data structure
        * Iterate over the identified zero element positions replace with zero's on row and columns
        * avoid putting zero if it is already a zero
        * */
        println(print2DArray(matrix))


        val zeroLocations = arrayListOf<IntArray>()
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                if (matrix[i][j] == 0) {
                    zeroLocations.add(intArrayOf(i, j))
                }
            }
        }


        for (entry in zeroLocations) {
            for (rowElements in matrix[entry.first()].indices) {
                matrix[entry.first()][rowElements] = 0
            }
            for (row in matrix.indices) {
                matrix[row][entry[1]] = 0
            }

        }
//        println("Columns $columnsList")
        println(print2DArray(matrix))
    }

    fun print2DArray(array: Array<IntArray>) {
        array.forEach { row ->
            println(row.joinToString(" "))
        }
    }
}