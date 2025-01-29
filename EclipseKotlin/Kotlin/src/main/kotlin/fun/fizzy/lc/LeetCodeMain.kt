package `fun`.fizzy.`fun`.fizzy.lc

import `fun`.fizzy.lc.LeetCodeDriver

private val driver: LeetCodeDriver = LeetCodeDriver()

fun main() {
    //println("* * * * * LeetCode Easy * * * * *")
    val l1929 = driver.lce.merger.getConcatenation(arrayOf(1,2,3).toIntArray())
    l1929.forEach { print(it) }
    //println("* * * * * LeetCode Medium * * * * *")
    //driver.lcm
    //println("* * * * * LeetCode Hard * * * * *")
    //driver.lch
}