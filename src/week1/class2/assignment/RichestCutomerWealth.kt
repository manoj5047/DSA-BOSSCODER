package week1.class2.assignment

object RichestCustomerWealth {
    @JvmStatic
    fun main(args: Array<String>) {
        // Initialize the outer list
        val listOfLists: MutableList<List<Int>> = ArrayList()

        // Add inner lists with specific values
        listOfLists.add(mutableListOf(1, 2, 3))
        listOfLists.add(mutableListOf(4, 5, 6))
        listOfLists.add(mutableListOf(7, 8, 9))
//        val result = solve(listOfLists).toString()
//        println(result)
    }

    fun solve(input: Array<IntArray>): Int {
        var result = 0
        for (currentAccount in input) {
            var tempAmount = 0
            for (integer in currentAccount) {
                tempAmount += integer
            }
            if (tempAmount >= result) {
                result = tempAmount
            }
        }
        return result
    }
}