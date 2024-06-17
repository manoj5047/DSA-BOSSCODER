package prequisite.fibonacci

fun main() {
    println("Result :: ${Solution().tab_fib(10)}")
}

class Solution {
    fun fib(n: Int): Int {
        return fib_manoj(n)
    }

    fun fib_manoj(n: Int): Int {
        return if (n < 2) n
        else fib_manoj(n - 1) + fib_manoj(n - 2)
    }

    fun opt_fib(n: Int): Int {
        var f0 = 0
        var f1 = 1
        var c: Int;
        if (n == 0) {
            return 0
        } else {
            for (i in 2..n) {
                c = f0 + f1
                f0 = f1
                f1 = c
            }
        }
        return f1
    }

    fun tab_fib(n: Int): Int {
        if (n < 2) return n
        val table = IntArray(n + 1)
        table[0] = 0
        table[1] = 1
        for (i in 2..n) {
            table[i] = table[i - 1] + table[i - 2]
        }
        return table[n]
    }
}