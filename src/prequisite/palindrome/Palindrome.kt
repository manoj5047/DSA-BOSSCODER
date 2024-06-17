package prequisite.palindrome

import prequisite.twosum.TwoSum
import kotlin.math.pow

fun main() {
    val param = 121
    println("IS NUMBER PALINDROME FOR $param  --> ${Solution().isPalindrome(param)}")

}

class Solution {
    fun isPalindrome(x: Int): Boolean = isPalindrome_v2(x)
    fun isPalindrome_v2(x: Int): Boolean {
        if(x<0){return false}
        if (x in 0..9) return true
        var tempNumber = x
        var reversedNumber = 0
        while (tempNumber!=0) {
            reversedNumber = (reversedNumber*10)+(tempNumber % 10)
            tempNumber /= 10
        }
         return x==reversedNumber
    }
    fun isPalindrome_v1(x: Int): Boolean {
        if(x<0){return false}
        var tempNumber = x
        val numberArray = arrayListOf<Int>()
        while (tempNumber / 10 > 0) {
            numberArray.add(tempNumber % 10)
            tempNumber /= 10
        }
        numberArray.add(tempNumber)
        println(numberArray)
        var reversedNumber = 0
            println(numberArray.size)

        for(index in numberArray.indices){
            val power = (numberArray.size-1 - index).toDouble()
            println("power ${power}")
            reversedNumber += (numberArray[index] * 10.0.pow(power).toInt())
            println("reversedNumber ${reversedNumber}")
        }
        println("ORIGINAL $x REVERSED $reversedNumber")
        return x==reversedNumber
    }
}
