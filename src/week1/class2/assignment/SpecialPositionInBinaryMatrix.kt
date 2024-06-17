package week1.class2.assignment

/*
https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
* Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).



Example 1:


Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:


Input: mat = [
[1,0,0],
[0,1,0],
[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
[[0,0,1,0],
[0,0,0,0],
[0,0,0,0],
[0,1,0,0]]

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
mat[i][j] is either 0 or 1.
* */

fun main() {
    val ip1 = arrayOf(
        intArrayOf(1, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 1)
    )
    val ip2 = arrayOf(
        intArrayOf(1, 0, 0),
        intArrayOf(0, 0, 1),
        intArrayOf(1, 0, 0)
    )
    val ip3 = arrayOf(

        intArrayOf(0, 0, 1, 0),
        intArrayOf(0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0),
        intArrayOf(0, 1, 0, 0)
    )
    val result = SpecialPositionInBinaryMatrix().numSpecial(ip1)
    val result2 = SpecialPositionInBinaryMatrix().numSpecial(ip2)
    val result3 = SpecialPositionInBinaryMatrix().numSpecial(ip3)
    println("Expectation : 3 Result $result")
    println("Expectation : 1 Result $result2")
    println("Expectation : 2 Result $result3")
}

class SpecialPositionInBinaryMatrix {
    fun numSpecial(mat: Array<IntArray>): Int {
        println("Start")
        var result = 0
        val rowSum = IntArray(mat.size) { 0 }
        val columnSum = IntArray(mat.first().size) { 0 }
        for (i in 0..<mat.size-1) {
            for (j in mat.indices) {
                rowSum[i] += mat[i][j]
                columnSum[i] += mat[j][i]
            }
        }
        for (i in mat.indices) {
            for (j in mat.indices) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && columnSum[j] == 1) {
                    result++
                }
            }
        }
        return result
    }

    fun numSpecial_2(mat: Array<IntArray>): Int {
        println("Start")
        var result = 0
        for (i in mat.indices) {
            for (j in mat.indices) {
                if (mat[i][j] == 1) {
                    var isMoreOccured = false
                    for (k in mat.indices) {
                        if (mat[k][j] > 0) {
                            isMoreOccured = true
                        }
                    }
                    if (isMoreOccured) {
                        result++
                    }
                }
            }

        }
        return result
    }
}