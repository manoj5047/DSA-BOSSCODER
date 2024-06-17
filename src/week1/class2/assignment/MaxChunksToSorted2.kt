package week1.class2.assignment

import java.util.*


/*
* https://leetcode.com/problems/max-chunks-to-make-sorted-ii/
* */
fun main() {
    val ip1 = intArrayOf(4, 2, 2, 1, 1)
    val ip2 = intArrayOf(5, 4, 3, 2, 1)
    val ip3 = intArrayOf(2, 1, 3, 4, 4)
    val ip4 = intArrayOf(0, 0, 1, 1, 1)
    println(Solution().maxChunksToSorted(ip1).toString() + " Ex: 1")
    println(Solution().maxChunksToSorted(ip2).toString() + " Ex: 1")
    println(Solution().maxChunksToSorted(ip3).toString() + " Ex: 4")
    println(Solution().maxChunksToSorted(ip4).toString() + " Ex: 5")
}

class Solution {
    fun maxChunksToSorted(arr: IntArray): Int {
        val max = 0
        var count = 0
        val map1: MutableMap<Int, Int> = HashMap()
        val map2: MutableMap<Int, Int> = HashMap()
        val nums = IntArray(arr.size)
        var i = 0
        while (i < nums.size) {
            nums[i] = arr[i]
            i++
        }
        Arrays.sort(nums)
        println(arr.toList())
        println(nums.toList())

        i = 0
        while (i < nums.size) {
            map1[nums[i]] = map1.getOrDefault(nums[i], 0) + 1
            map2[arr[i]] = map2.getOrDefault(arr[i], 0) + 1
            if (map1 == map2) {
                println("map1 $map1")
                println("map2 $map2")
                count++
                map1.clear()
                map2.clear()
            }
            i++
        }
        val numberArrayList = arrayListOf<Int>()
        for (i in arr) {
            if (!numberArrayList.contains(i)) {
                numberArrayList.add(i)
            }
        }
        println("numberArrayList $numberArrayList")
        return count
    }

    fun maxChunksToSorted_(arr: IntArray): Int {
        val numberArrayList = arrayListOf<Int>()
        for (i in arr) {
            if (!numberArrayList.contains(i)) {
                numberArrayList.add(i)
            }
        }
        println(numberArrayList)
        var count = 0
        var localMax = 0
        for (i in numberArrayList.indices) {
            localMax = maxOf(localMax, numberArrayList[i])
            if (localMax == i) {
                count++
            }
        }
        return if (count <= 0) 1 else count
    }
}