package week1.class2.assignment.search2dmatrix

fun main() {
    val target = 5
    val inputArray = arrayOf(
        intArrayOf(1, 4, 7, 11, 15),
        intArrayOf(2, 5, 8, 12, 19),
        intArrayOf(3, 6, 9, 16, 22),
        intArrayOf(10, 13, 14, 17, 24),
        intArrayOf(18, 21, 23, 26, 30),
    )
    val result = Search2dMatrix().searchMatrix(inputArray, target)
    println(result)
}

class Search2dMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
//        for (row in matrix) {
//            for (re in row) {
//                if (re == target) {
//                    return true
//                }
//            }
//        }
//        return false
//
//    }
        var result = false
        var matrixMid = matrix.size / 2
        var range: IntRange = 0..0

        for (number in matrix[matrixMid]) {
            if (number == target) {
                return true
            }
            if (number > target) {
                range = 0..matrixMid
            } else {
                range = matrix.size..matrixMid
            }
        }

        for (i in range) {
            for (re in matrix[i]) {
                if (re == target) {
                    result = true
                    break
                }
            }

        }
        return result
    }
}