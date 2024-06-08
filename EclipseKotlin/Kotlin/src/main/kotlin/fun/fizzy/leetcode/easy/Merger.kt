package `fun`.fizzy.`fun`.fizzy.leetcode.easy

import `fun`.fizzy.tools.linkedlist.Node

class Merger {

    /**
     * @problem Given an integer array nums of length n, you want to create an array ans of length 2n
     *  , where ans[ i ] == nums[ i ] and ans[ i + n ] == nums[ i ] for 0 <= i < n
     * @constraints
     *   n == nums.length
     *   1 <= n <= 1000
     *   1 <= nums[ i ] <= 1000
     *  @analysis O(n) where n is the length of the loop
     *  @tag leetcode official problem
     */
    fun mergeIntArray(nums: IntArray): IntArray {
        val temp = IntArray(nums.size*2) { 0 }
        var counter = 0
        for(i in nums){
            temp[counter++] = i
        }
        for(j in nums){
            temp[counter++] = j
        }
        return temp
    }

    /**
     * @problem merge two sorted linked lists
     * @constraints both lists are given by the head and are sorted in non-decreasing order
     *  number of nodes in both lists vary between 0 and 50
     * @analysis .....TODO
     * @tag leetcode official problem
     */
    fun mergeTwoLinkedLists(a: Node?, b: Node?) : Node? {
        if (a == null) return b
        if (b == null) return a
        return if (a.data < b.data) {
            a.next = mergeTwoLinkedLists(a.next, b)
            a
        } else {
            b.next = mergeTwoLinkedLists(a, b.next)
            b
        }
    }
}