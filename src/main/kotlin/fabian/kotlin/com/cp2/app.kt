package fabian.kotlin.com.cp2

fun main() {
    val t = readLine()!!.toInt()

    for (i in 1..t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()

        var sum = 0
        for (j in a..b) {
            if (j % 2 == 1) {
                sum += j
            }
        }

        println("Case $i:$sum")
    }
}

