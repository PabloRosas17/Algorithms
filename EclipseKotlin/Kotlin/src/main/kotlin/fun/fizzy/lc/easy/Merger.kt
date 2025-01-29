package `fun`.fizzy.`fun`.fizzy.lc.easy

class Merger {

    /**
     * @description concatenation of arrays
     * @problem given an integer array `nums` of length `n`, create an array `ans` of length `2n`
     *  where nums[ i ] == ans[ i ] and nums[ i ] == ans[ i + n ]
     * @constraints for 0 <= i <= n
     * @complexity time o(n) where n is the length of the array
     *  and space o(2n) where n*n allocates memory for the new array
     * @improvements optimization suggestions
     * @tags leetcode official
     */
    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }
}