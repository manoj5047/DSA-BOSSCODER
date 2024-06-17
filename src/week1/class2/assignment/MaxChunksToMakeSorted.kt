package week1.class2.assignment

//https://leetcode.com/problems/max-chunks-to-make-sorted/description/

fun main() {
    println(MaxChunksToMakeSorted().maxChunksToSorted(intArrayOf(5,4,3,2,1)))
}

class MaxChunksToMakeSorted {
    /*First of all, we should "linearize" data according to indexes in the array.
    What does it means? Idealy, if we wanna maximize number of chunks, each chunk should be of size 1 and number in this chunk should be equal to index of the number in the array.
    But in reallity, we could have unordered data, where index is not equal to the number itself.
    So, we could simply save local maxima and try to split chunks when local maximum equal to the current index.
     In other words, we are trying to find a "right place" for our chunk end.*/


    fun maxChunksToSorted(arr: IntArray): Int {
        var chunks = 0
        var localMax = 0
        for (i in arr.indices) {
            localMax = maxOf(localMax, arr[i])
            if (localMax == i)
                chunks++
        }

        return chunks

    }
}