package prequisite.twosum

import java.util.Hashtable

fun main() {
    val twoSum = TwoSum()
    val response = twoSum.twoSum_hash_table(intArrayOf(3, 2, 3), 6)

    for (item in response ?: intArrayOf()) {
        println("INDEX ${response!!.indexOf(item)} :: VAL $item")
    }
}

class TwoSum {

    val result = IntArray(2)

    fun twoSum_hash_table(inputArray: IntArray, target: Int): IntArray? {
        val resultantArray = IntArray(2)
        if (inputArray.size == 2) {
            return if (inputArray[0] + inputArray[1] == target) {
                return intArrayOf(0, 1)
            } else {
                null
            }
        } else {

            val elementToIndexMap = Hashtable<Int, ArrayList<Int>>()
            for (index in inputArray.indices) {
                elementToIndexMap.computeIfAbsent(inputArray[index]) { arrayListOf() }.add(index)
            }
            for (currentElement in inputArray) {
                val componentElement = target - currentElement
                if (elementToIndexMap.containsKey(componentElement)) {

                    val componentIndexList = elementToIndexMap[componentElement]
                    val componentIndexListSize = (componentIndexList ?: listOf()).size
                    val currentElementIndex = inputArray.indexOf(currentElement)
                    val firstElementFromElementToIndexMap = elementToIndexMap[componentElement]!!.first()

                    if (componentIndexListSize == 1 && firstElementFromElementToIndexMap != (currentElementIndex)) {
                        resultantArray[0] = inputArray.indexOf(currentElement)
                        resultantArray[1] = componentIndexList!!.first()
                        return resultantArray

                    } else if (componentIndexListSize == 2) {
                        resultantArray[0] = inputArray.indexOf(currentElement)
                        resultantArray[1] = componentIndexList!![1]
                        return resultantArray

                    }

                }
            }
        }
        return null
    }

    fun twoSum_brute_force(nums: IntArray, target: Int): IntArray {
        if (nums.size == 2) {
            result[0] = 0
            result[1] = 1

        } else {
            for (index in nums.indices) {
                for (innerIndex in index..<nums.size) {
                    if (nums[index] + nums[innerIndex] == target) {
                        result[0] = index
                        result[1] = innerIndex
                    }
                }
            }
        }
        return result
    }

}