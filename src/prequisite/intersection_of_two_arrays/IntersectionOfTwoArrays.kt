package prequisite.intersection_of_two_arrays

fun main() {
//   intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)
//   intArrayOf (1, 2, 2, 1), intArrayOf (2, 2)
    val resultArray = Solution().intersectionWithSet(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    println("Result ::: ")
    for (num in resultArray) {
        println(num)
    }
}

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return intersection_v1(nums1, nums2)
    }

    fun intersection_v1(nums1: IntArray, nums2: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        for (num in nums1) {
            if (!map.containsKey(num)) {
                map[num] = 1
            }
        }
        for (num in nums2) {
            if (map.containsKey(num)) {
                map[num] = (map[num] ?: 0) + 1
            }
        }
        val resultArray = mutableListOf<Int>()

        for (entry in map.entries) {
            if (entry.value > 1) {
                resultArray.add(entry.key)

            }
        }
        return resultArray.toIntArray()
    }

    fun intersectionWithSet(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = mutableSetOf<Int>()
        val intersectionSet = mutableSetOf<Int>()
        for (num in nums1) {
            set1.add(num)
        }
        for (num in nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num)
            }
        }
        return intersectionSet.toIntArray()
    }

    fun intersectionWithPredefinedFunctions(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.toSet().intersect(nums2.toSet()).toIntArray()
    }
}