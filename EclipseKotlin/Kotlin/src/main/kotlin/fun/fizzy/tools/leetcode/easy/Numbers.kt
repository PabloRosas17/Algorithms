package `fun`.fizzy.tools.leetcode.easy

class Numbers {

    /**
     * @problem determine the number of digits in an integer n
     * @analysis O(n) where n is the vale of the input int
     */
    fun findDigits(n: Int): Int {
        var copy = n
        val place = 10
        var counter = 0
        while (copy != 0){
            copy /= place
            counter++
        }
        return counter
    }

    /**
     * @problem find nth largest element in an unordered array
     * @analysis O(log n) where chopping the problem in half is log n
     */
    fun findNthLargest(a: Array<Int>): Int {
        val length = a.size
        val half = length/2
        val start = 0
        val end = length-1
        var left = 0
        var right = 0
        var largest = 0
        for(i in start..half){
            if(a[i] > left){
                left = a[i]
            }
        }
        for(i in half..end){
            if(a[i] > right){
                right = a[i]
            }
        }
        largest = if(right < left){
            left
        } else if(right > left){
            right
        } else {
            a.max() /* right == left */
        }
        return largest
    }

    /**
     * @problem Given an array of integers, determine how many of them contain an even number of digits.
     * @analysis O(n) where n is each nth element in the int array
     */
    fun findNumbers(num: IntArray): Int {
        var counter = 0
        num.forEach { if (it.toString().length % 2 == 0) counter++ }
        return counter
    }
}