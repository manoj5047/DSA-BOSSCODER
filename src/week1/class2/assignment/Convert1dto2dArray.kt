package week1.class2.assignment

import week1.Utils


fun main() {
    val input = intArrayOf(1, 2, 3, 4)
    val row = 1
    val col = 4
    val result = Convert1dto2dArray().construct2DArray(input, row, col)
    println("Result : ${Utils.print2DArrayUsingJoinToString(result)}")
}

class Convert1dto2dArray {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if ( m * n != original.size) {
            return emptyArray()
        }
        val result = Array(m) { IntArray(n) }
        var ind = 0;
        for (i in 0..m-1) {
            for (j in 0..n-1) {
                result[i][j] = original[ind++]
            }
        }
        return result
    }
}