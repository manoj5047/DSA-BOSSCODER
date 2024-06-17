package week1

object Utils {
    fun print2DArrayUsingJoinToString(array: Array<IntArray>) {
        array.forEach { row ->
            println(row.joinToString("\t"))
        }
    }
}