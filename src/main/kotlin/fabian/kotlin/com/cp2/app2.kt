package fabian.kotlin.com.cp2

fun main() {
    while (true) {
        println("Input Number :")
        val line = readLine() ?: break // read a line of input
        if (line == "0") break // check for end of input
        val sumEven = line.filterIndexed { index, _ -> index % 2 == 0 }.sumBy { it - '0' }
        val sumOdd = line.filterIndexed { index, _ -> index % 2 == 1 }.sumBy { it - '0' }
        val diff = sumEven - sumOdd
        if (diff % 11 == 0) {
            println("$line is a multiple of 11.")
        } else {
            println("$line is not a multiple of 11.")
        }
    }
}