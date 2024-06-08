package `fun`.fizzy.`fun`.fizzy.leetcode.easy

import java.util.HashSet

class Unique {

    /**
     * @problem finds unique elements in two unordered arrays both of length n
     * @analysis O(n) where n is each nth element in the array
     */
    fun findUniques(a1: Array<Int>, a2: Array<Int>, n: Int) {
        val set = HashSet<Int>()
        a1.forEach { p -> set.add(p) }
        a2.forEach { q -> set.add(q) }
    }
}