package `fun`.fizzy.tools.leetcode.easy

import java.util.*

class Reverser {

    /**
     * @problem reverses a string where the input string is given as a raw string type.
     * @analysis O(n) when iterating the string of length n
     * @improvement O(log n) where dividing in half is log n
     */
    fun reverseStringRaw(string: String): String {
        var temp = ""
        val length = string.length-1
        val len = (length/2)-1
        val half = length/2
        val start = 0
        val end = string.length
        for (i in start..len){
            temp += string[end-1-i]
        }
        for (i in half until end){
            temp += string[end-1-i]
        }
        return temp
    }

    /**
     * @problem reverses a string where the input string is given as an array of character type.
     * @constraints achieve this by O(1) extra memory
     * 1 <= s.length <= (Math.pow(10,5)), s[ index ] is a printable ascii character
     * @analysis O(log n) where cutting the problem in half is log n
     */
    fun reverseStringChar(array: CharArray): Unit {
        var temp = ""
        val length = array.size-1
        val len = (length/2)-1
        val half = length/2
        val begin = 0
        val end = array.size
        var a = 0
        var b = 0
        var finish = array.size-1
        val copy = array.copyOf()
        //swap second half with first half
        for (i in begin..len){
            array[finish-i]=copy[a++]
        }
        //swap first half with second half
        for (i in half until end){
            array[b++] = copy[finish--]
        }
    }

    /**
     * @problem parses and reverse a string, then cast it to a number
     * @analysis O(n) where n is the length of the input string
     */
    fun reverseParsed(): Int {
        var result = ""
        val scanner = Scanner(System.`in`)
        val read = scanner.nextInt()
        val temp = read.toString()
        var end = temp.length-1
        for(i in temp.indices){
            result += temp[end--]
        }
        return result.toInt()
    }

    /**
     * @problem reverse an integer n
     * @analysis O(n) where n is the value of the int
     */
    fun reverseIntegerN(n: Int): Int {
        var copy = n
        val place = 10
        var reversed = 0
        while (copy > 0){
            reversed = (reversed*place) + (copy%place)
            copy /= place
        }
        return reversed
    }
}