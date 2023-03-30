package lino.cp3

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    while (true) {
        val n = scanner.nextInt()
        val m = scanner.nextInt()
        if (n == 0 && m == 0) break
        val arr = Array(n) { scanner.nextInt() }
        Arrays.sort(arr) { a: Int, b: Int ->
            val aMod = a % m
            val bMod = b % m
            if (aMod != bMod) aMod - bMod
            else if (a and 1 == 1 && b and 1 == 0) -1
            else if (a and 1 == 0 && b and 1 == 1) 1
            else if (a and 1 == 1 && b and 1 == 1) b - a
            else a - b
        }
        println("$n $m")
        arr.forEach { println(it) }
    }
}
