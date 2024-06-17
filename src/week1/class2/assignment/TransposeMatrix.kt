package week1.class2.assignment

import week1.Utils


//https://leetcode.com/problems/transpose-matrix/description/

fun main() {
    val mainArray = arrayOf(
        intArrayOf(3, 0, 1, 4, 2),
        intArrayOf(5, 6, 3, 2, 1),
        intArrayOf(1, 2, 0, 1, 5),
        intArrayOf(4, 1, 0, 1, 7),
        intArrayOf(1, 0, 3, 0, 5),
    )

    println(TransposeMatrix().transpose(mainArray))
}

class TransposeMatrix {

    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val newArray = Array(matrix.first().size) { IntArray(matrix.size) { 0 } }
        println("numarray")
        Utils.print2DArrayUsingJoinToString(newArray)

        println("Input")
        Utils.print2DArrayUsingJoinToString(matrix)
        println("=======")
        for (i in matrix.indices) {
            for (j in 0..<matrix[i].size) {
                newArray[j][i] = matrix[i][j]
            }
        }
        println("Output")
        Utils.print2DArrayUsingJoinToString(newArray)
        println("======")
        return newArray
    }
}