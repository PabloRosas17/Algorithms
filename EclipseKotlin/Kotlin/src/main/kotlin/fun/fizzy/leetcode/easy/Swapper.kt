package `fun`.fizzy.`fun`.fizzy.leetcode.easy

class Swapper {

    /**
     * @problem swap two elements n and m in string s
     * @analysis O(1) array access array assign
     * @note strings in kotlin are immutable, why?
     * think, object, safety, memory, others exist
     */
    fun swap(s: String, n: Int, m: Int): String {
        val a = s.toCharArray()
        val temp = a[m]
        a[m] = a[n]
        a[n] = temp
        return a.toString()
    }
}