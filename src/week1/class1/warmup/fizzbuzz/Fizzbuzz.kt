package week1.class1.warmup.fizzbuzz


/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


Constraints:

1 <= n <= 104*/
fun main() {
    println()
    val result =
        listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
    val test = Solution().fizzBuzz(15)
    println("Test calculation : ${test}")
}

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val returnList = arrayListOf<String>()
        for (number in 1..n) {
            val result = number % 15

            if (result == 0) {
                returnList.add("FizzBuzz")
            } else if (result % 5 == 0) {
                returnList.add("Buzz")
            } else if (result % 3 == 0) {
                returnList.add("Fizz")
            } else {
                returnList.add(number.toString())
            }
        }
        return returnList

    }
}