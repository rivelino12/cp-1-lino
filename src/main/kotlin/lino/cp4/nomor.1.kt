package lino.cp4

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun isEmirp(n: Int): Boolean {
    if (!isPrime(n)) {
        return false
    }
    val reversed = n.toString().reversed().toInt()
    return n != reversed && isPrime(reversed)
}

fun main() {
    val numbers = listOf(17, 18, 31, 37, 71)
    for (n in numbers) {
        if (isEmirp(n)) {
            println("$n adalah bilangan emirp")
        } else if (isPrime(n)) {
            println("$n adalah bilangan prima")
        } else {
            println("$n bukan bilangan prima atau bilangan emirp")
        }
    }
}