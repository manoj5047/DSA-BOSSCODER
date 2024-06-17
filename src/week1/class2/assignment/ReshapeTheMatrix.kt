package week1.class2.assignment

import week1.Utils

/*
https://leetcode.com/problems/reshape-the-matrix/description/
* In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300

* */
fun main() {
    val mainArray = arrayOf(
        intArrayOf(4, 3, 2, -1),
        intArrayOf(3, 2, 1, -1),
        intArrayOf(1, 1, -1, -2),
        intArrayOf(-1, -1, -2, -3),
    )
    val input1 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),

        )
    val output = ReshapeTheMatrix().matrixReshape(input1, 4, 1)
    Utils.print2DArrayUsingJoinToString(output)
}

class ReshapeTheMatrix {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
//        println("INPUT")
//        Utils.print2DArrayUsingJoinToString(mat)
//        println("OUPUT")
        val size = mat.size * mat.first().size
        if (r * c != size) {
            return mat
        }
        val resultIntArray = Array(r) { IntArray(c) { 0 } }
        val flatArray = Array(size) { 0 }
        var index = 0;
        for (r in mat) {
            for (c in r) {
                flatArray[index] = c
                index++
            }
        }
        index = 0
        for (r in resultIntArray.indices) {
            for (c in resultIntArray[r].indices) {
                resultIntArray[r][c] = flatArray[index]
                index++
            }
        }

        return resultIntArray
    }
}