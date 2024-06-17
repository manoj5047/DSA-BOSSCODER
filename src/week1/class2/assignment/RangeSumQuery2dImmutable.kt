package week1.class2.assignment
/*
* https://leetcode.com/problems/range-sum-query-2d-immutable/
* */
fun main() {
    val mainArray = arrayOf(
        intArrayOf(3, 0, 1, 4, 2),
        intArrayOf(5, 6, 3, 2, 1),
        intArrayOf(1, 2, 0, 1, 5),
        intArrayOf(4, 1, 0, 1, 7),
        intArrayOf(1, 0, 3, 0, 5),
    )
    val input = arrayOf(
        intArrayOf(2, 1, 4, 3),
        intArrayOf(1, 1, 2, 2),
        intArrayOf(1, 2, 2, 4)
    )
    val numMatrix = NumMatrix(mainArray)
    val result = arrayListOf<Int>()
    for (i in input) {
        result.add(numMatrix.sumRegion(i[0], i[1], i[2], i[3]))
    }
    println(result.toList())
}

class NumMatrix(val matrix: Array<IntArray>) {
    lateinit var sumMatrix: Array<IntArray>
    var maxRow: Int = 0
    var maxCol: Int = 0

    init {
        // Create a prefixsum Array
        maxRow = matrix.lastIndex
        maxCol = matrix.first().lastIndex
        sumMatrix = Array(maxRow + 1) { IntArray(maxCol + 1) { 0 } }
        for (row in 0..maxRow) {
            for (col in 0..maxCol) {
                if (col == 0) {
                    sumMatrix[row][col] = matrix[row][col]

                } else {
                    sumMatrix[row][col] = sumMatrix[row][col - 1] + matrix[row][col]
                }
            }
        }
    }
        fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
//        BRUTE FORCE APPROACH
        var sum = 0
        for (row in row1..row2) {
             sum += sumMatrix[row][col2]
            sum -= if(col1<=0) 0 else sumMatrix[row][col1-1]
        }
        return sum
    }

    fun sumRegion_bf(row1: Int, col1: Int, row2: Int, col2: Int): Int {
//        BRUTE FORCE APPROACH
        var result = 0
        for (row in row1..row2) {
            for (col in col1..col2) {
                result += matrix[row][col]
            }
        }
        return result
    }

}