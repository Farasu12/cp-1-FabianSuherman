package fabian.kotlin.com.cp4

import kotlin.math.sqrt

fun main() {
    println("Input Number: ")
    val inputs = mutableListOf<Int>()
    while (true) {
        val input = readLine()?.toIntOrNull()
        if (input == null) {
            break
        }
        inputs.add(input)
    }
    for (input in inputs) {
        val reversed = input.toString().reversed().toInt()
        if (isPrime(input)) {
            if (isPrime(reversed) && input != reversed) {
                println("$input is emirp.")
            } else {
                println("$input is prima.")
            }
        } else {
            println("$input is not prima.")
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n == 2) {
        return true
    }
    if (n < 2 || n % 2 == 0) {
        return false
    }
    val sqrtN = sqrt(n.toDouble()).toInt()
    for (i in 3..sqrtN step 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
