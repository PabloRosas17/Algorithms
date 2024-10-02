package `fun`.fizzy.tools.leetcode.easy

import java.util.*

class Detector {

    /**
     * @problem detect if two strings are anagrams,
     * if they contain all the same characters in the same frequencies
     * @constraints
     *  1 <= a.length, b.length <= (5 * math.pow(10,4))
     *  a and b consist of lowercase English letters.
     * @analysis O(n) where n is the size of a b
     * @tag leetcode official problem
     */
    fun isAnagram(a: String, b: String): Boolean {
        var result = true
        val aL = a.lowercase(Locale.getDefault())
        val bL = b.lowercase(Locale.getDefault())

        /* get unique occurrence of each letter in the first string as lower-case */
        var aU = ""
        for (i in aL.indices) {
            if (!aU.contains(aL[i].toString())) {
                aU += aL[i]
            }
        }

        /* get unique occurrence of each letter in the second string as lower-case */
        var bU = ""
        for (j in bL.indices) {
            //if b[i] is already in aU skip otherwise add
            if (!bU.contains(bL[j].toString())) {
                bU += bL[j]
            }
        }

        /* number of unique characters, number of unique entries */
        var len = 0
        len = if (aU.length > bU.length) {
            aU.length
        } else if (aU.length < bU.length) {
            bU.length
        } else {
            aU.length * 2 - bU.length
        }

        /* table with unique characters */
        val lT = CharArray(len)
        if (aU.length > bU.length) {
            for (k in 0 until len) {
                lT[k] = aU[k]
            }
        } else if (aU.length < bU.length) {
            for (k in 0 until len) {
                lT[k] = bU[k]
            }
        } else {
            for (k in 0 until len) {
                lT[k] = aU[k]
            }
        }

        /* table for frequency for second string */
        val bF = IntArray(len)
        for (element in bL) {
            for (n in lT.indices) {
                if (element == lT[n]) {
                    bF[n]++
                }
            }
        }

        /* table for frequency for first string */
        val aF = IntArray(len)
        for (element in aL) {
            for (n in lT.indices) {
                if (element == lT[n]) {
                    aF[n]++
                }
            }
        }

        /* compare frequencies */
        for (o in 0 until len) {
            if (aF[o] != bF[o]) {
                result = false
            }
        }

        return result
    }

    /**
     * @problem detect if a character is a character
     * @constraints c >= 0x20 && c <= 0x7e
     * @analysis O(1) comparison
     */
    fun isChar(c: Char): Boolean {
        return c.code in 0x20..0x7e
    }

    /**
     * @problem detect if a character is a number
     * @constraints c >= 0x30 && c <= 0x39
     * @analysis O(1) comparison
     */
    fun isDigit(c: Char): Boolean {
        return c.code in 0x30..0x39
    }

    /**
     * @problem detect if an argument is a number between s and e, inclusively
     * @param args by System.`in`
     * @analysis O(1) input
     */
    fun isInRange(args: Array<String>, s: Int, e: Int): Boolean {
        val scanner = Scanner(System.`in`)
        val read = scanner.nextInt()
        return read in s..e
    }

    /**
     * @problem detect if an integer n is a palindrome
     * @analysis O(n) where n is the value of the int
     * @tag leetcode official problem
     */
    fun isPalindromeA(n: Int): Boolean {
        if(n < 0){ return  false }
        if(n in 0..9){ return true }
        val reversed = `fun`.fizzy.`fun`.fizzy.tools.leetcode.easy.Reverser().reverseIntegerN(n)
        return reversed == n
    }

    /**
     * @problem detect if a phrase as a string is a palindrome
     * , if after converting all uppercase letters into lowercase letters
     * , and removing all non-alphanumeric characters
     * , it reads the same forward and backward, then it is a palindrome.
     * Alphanumeric characters include letters and numbers.
     * return true if it is, return false if it is not
     * @constraints 1 >= s.length <= (2*Math.pow(10,5))
     * s consists of only printable ascii characters, 0x20 <= s as a character <= 0x7E
     * @analysis O(log n) where splitting the problem in half is log n
     * @tag leetcode official problem
     * @fun removes alphanumeric, val regex = Regex("[^A-Za-z0-9]").apply{this.replace(s,"")}
     */
    fun isPalindromeB(s: String): Boolean {
        //check in range
        s.forEach { i ->
            if (i.code < 32 || i.code > 126) {
                return false
            }
        }
        //strip and lowercase
        val regex = Regex("[^A-Za-z0-9]")
        val p = regex.replace(s, "")
        val q = p.lowercase(Locale.getDefault())
        //algorithm
        val half = q.length / 2
        val start = 0
        val end = q.length
        for (i in start until half) {
            if (q[i] != q[end - i - 1]) {
                return false
            }
        }
        return true
    }
}