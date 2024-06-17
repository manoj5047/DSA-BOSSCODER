package prequisite.cells_with_odd_values_in_a_matrix

fun main() {
    println(
        "ODD ELEMENT COUNT :: ${
            Solution().oddCells(
                48, 37,
                arrayOf(
                    intArrayOf(40, 5)
                )
            )
        }"
    )
}

class Solution {
    fun print2DArrayUsingJoinToString(array: Array<Array<Int>>) {
        array.forEach { row ->
            println(row.joinToString("\t"))
        }
    }

    fun print1DArrayUsingJoinToString(array: Array<IntArray>) {
        array.forEach { row ->
            row.forEach { column ->
                print(column.toString() + " " + ("\t"))
            }
        }
    }

    fun oddCells(rows: Int, columns: Int, indices: Array<IntArray>): Int {
        var oddElementCount = 0
        //Create 2D array initialised with 0 for all elements
        val inputArray = Array(rows) { Array(columns) { 0 } }
        //Iterate in indices , for each iteration, take the elements in indices current element array
        // first element is ROW, Second element is column
        // increment all values by 1 in given Row Index in @initialArray
        // increment all value by 1 in given Column Index in @initialArray
        for (currentElement in indices) {
            val rowIndexToIncrease = currentElement.first()
            val columnIndexToIncrease = currentElement[1]
            //Perform Calculations on ROW
            for (row in inputArray) {
                for (rowElementIndex in row.indices) {
                    if (inputArray.indexOf(row) == rowIndexToIncrease) {
                        row[rowElementIndex]++
                    }
                    if ((rowElementIndex) == columnIndexToIncrease) {
                        row[rowElementIndex]++
                    }

                }

            }
        }
        for (row in inputArray) {
            for (rowItem in row) {
                if (rowItem % 2 != 0) {
                    oddElementCount++
                }
            }
        }
        println("inputArray :: ${print2DArrayUsingJoinToString(inputArray)}")
        return oddElementCount;

    }
}

