package `fun`.fizzy.`fun`.fizzy.leetcode.easy

import java.util.*

class Maths {

    /**
     * @problem divide two numbers of type long and return a double
     * @constraint b is not 0
     * @analysis O(1) division
     */
    fun mathDivide(a : Long, b : Long) : Double {
        return a.toDouble()/b.toDouble()
    }

    /**
     * @problem Given an array of integers, return indices of the two numbers
     *  such that they add up to a specific target.
     * @assumption Assume that each input would have exactly one solution
     *  , and you may not use the same element twice.
     *  @analysis O(n^2) where ith loop is n * jth loop is m=n, compare with indices
     *  @improved O(n) where depth of loop is n, compare with pointers
     *  @tag leetcode official problem
     */
    fun mathTwoSum(numbers: IntArray, target: Int): IntArray {
        val bucket = arrayListOf<Int>()
        val reset = 0
        var p = 0
        var q = numbers.size-1
        while (p < q){
            if(numbers[p]+numbers[q]==target){
                bucket.add(p)
                bucket.add(q)
                return bucket.toIntArray()
            }
            else {
                p++
                if (p == q) {
                    p = reset
                    q--
                }
            }
        }
        return bucket.toIntArray()
    }

    /**
     * @problem convert a string of roman symbols to integer math values
     * @constraints symbol=value, I=1, V=5, X=10, L=50, C=100, D=500, M=1000
     *  range of S: s >= 1 && s <= 3999
     *  length of S: 1 <= s.length <= 15
     * subtraction
     *  I can be placed before V (5) and X (10) to make 4 and 9.
     *  X can be placed before L (50) and C (100) to make 40 and 90.
     *  C can be placed before D (500) and M (1000) to make 400 and 900.
     *  @analysis O(n) where n is the length of the string
     *  @tag leetcode official problem
     */
    fun mathRomanToInt(s: String): Int {
        var sub: Int = 0
        var sum: Int = 0
        val length = s.length-1
        val patterns = mapOf<String,Int>(Pair("IV",4),Pair("IX",9),Pair("XL",40),Pair("XC",90),Pair("CD",400),Pair("CM",900))

        var i: Int = 0
        while( i <= length){
            val next = if( (i+1) <= length) i+1 else i
            val p = s.slice( i..next)
            if( patterns.containsKey(p) ) {
                sub -= patterns.getValue(p)
                i+=2
            } else {
                val q = s.slice(i downTo i)
                sum += mathRomanValue(q.first())
                i++
            }
        }

        return sum-sub
    }

    /**
     * @problem convert a character to a roman math value
     * @analysis O(1) assignment
     */
    private fun mathRomanValue(s: Char): Int {
        return when (s) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> -1
        }
    }

    /**
     * @problem perform math transpose of a matrix
     * @constraints n rows, m cols
     * @analysis O(n^2) where iterating ith times iterating jth times is n^2
     */
    fun mathMatrixTranspose(rows: Int, cols: Int, r: Array<IntArray>) {
        val ret: Array<IntArray> = Array(3) { IntArray(3) }
        for(i in 0 until rows){
            for(j in 0 until cols){
                ret[i][j] = r[j][i]
            }
        }
        val t1 = printMatrix(r)
        val t2 = printMatrix(ret)
        println("Here is the original matrix.\n$t1\nHere is the transposed matrix.\n$t2")
    }

    /**
     * @problem print a math matrix,
     * @constraints n rows, m cols
     * @analysis O(n^2) where iterating ith times iterating jth times is n^2
     */
    private fun printMatrix(a: Array<IntArray>): String {
        var temp = ""
        a.forEachIndexed { i, ints ->
            ints.forEachIndexed { j, e ->
                temp += " [$i][$j]: $e"
            }
        }
        return temp
    }
}