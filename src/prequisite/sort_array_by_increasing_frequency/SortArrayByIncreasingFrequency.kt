package prequisite.sort_array_by_increasing_frequency

fun main() {
    /*[1,1,2,2,2,3] , [2,3,1,3,2] , [-1,1,-6,4,5,-6,1,4,1]*/
    val response = Solution().frequencySort(intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1))
    for (item in response) {
        print("$item , ")
    }
}

class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        val finalmap = mutableSetOf<Pair<Int, Int>>()
        val resultArray = arrayListOf<Int>()

        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }
        val sortedMap = mutableListOf<Map.Entry<Int, Int>>().apply {
            addAll(map.entries.sortedBy {
                it.value
            })
        }

        for (entry in sortedMap) {
            val filteredMap = map.filter { it.value == entry.value }

            val sortedList = filteredMap.entries.sortedByDescending {
                it.key
            }

            if (filteredMap.size > 1) {

                for (filterEntry in sortedList) {
                    finalmap.add(filterEntry.toPair())

                }
            } else {
                finalmap.add(entry.toPair())

            }

        }
        for (entry in finalmap) {
            for (i in 0..<entry.second) {
                resultArray.add(entry.first)
            }
        }
        return resultArray.toIntArray()

    }
}