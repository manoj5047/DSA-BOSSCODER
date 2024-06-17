package week1.class1.warmup.matrixdiagonalsum

/*
* Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5


Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100

* */
fun main() {
    val evenarray = arrayOf(
        intArrayOf(1, 1, 1, 1),
        intArrayOf(1, 1, 1, 1),
        intArrayOf(1, 1, 1, 1),
        intArrayOf(1, 1, 1, 1),
    )
    val oddArray = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val longArray = arrayOf(
        intArrayOf(7, 3, 1, 9),
        intArrayOf(3, 4, 6, 9),
        intArrayOf(6, 9, 6, 6),
        intArrayOf(9, 5, 8, 5)
    )
    val simpleArray = arrayOf(
        intArrayOf(5)
    )
    println(Solution().diagonalSum(evenarray))
    println(Solution().diagonalSum(oddArray))
    println(Solution().diagonalSum(longArray))
    println(Solution().diagonalSum(simpleArray))
}

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val rowSize = mat.size - 1
        var result = 0
        for (i in 0..<mat[0].size) {
            result += mat[i][i]
            print("Indexes [$i] [$i] Result After PD addition $result -- ")
            if (rowSize - i != i)
                result += mat[i][rowSize - i]
            println("Indexes [${i}] [${rowSize - i}] Result After SD addition $result")


        }
        return result
    }
}