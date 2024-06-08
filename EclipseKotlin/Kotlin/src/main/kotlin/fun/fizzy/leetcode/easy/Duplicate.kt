package `fun`.fizzy.`fun`.fizzy.leetcode.easy

import java.util.ArrayList
import java.util.HashSet

class Duplicate {

    /**
     * @problem find duplicate elements in an array
     * @analysis O(n) where n is the size of the int array
     */
    fun findDuplicatesInArray(n: IntArray): IntArray {
        val set: HashSet<Int> = hashSetOf()
        n.forEach { it-> set.add(it) }
        return set.toIntArray()
    }

    /**
     * @problem given an integer array n, return true if any value appears at least twice in the array
     * , and return false if every element is distinct.
     * @constraints 1 <= n.length <= (math.pow(10,4))
     * (math.pow(-10,9)) <= n[ index ] <= (math.pow(+10,9))
     * @analysis O(n) where n is the number of elements in the array
     * @tag leetcode official problem
     */
    fun hasDuplicatesInArray(n: IntArray): Boolean {
        return hashSetOf<Int>().apply{ for(element in n){ this.add(element) } }.size != n.size
    }

    /**
     * @problem remove duplicates in-place from an array n, so that each element appears only once
     * , n is sorted in non-decreasing order, elements in n should be kept in the same relative order
     * @constraint perform the modification in O(1) space complexity, without allocating more memory
     * 0 <= n.length <= (3 * math.pow(10,4))
     * -100 <= n[ i ] <= 100
     * @analysis O(n) where n is the size of the array
     * @tag leetcode official problem
     */
    fun removeDuplicatesInArray(n: IntArray): Int {
        if(n.isEmpty()){ return 0 }
        val key: Int = -101
        var o: Boolean = false
        var p: Int = 0
        var q: Int = 0
        while (p < n.size){
            if(!o){
                q = n[p]
                o = true
            } else {
                if (n[p] == q){
                    n[p] = key
                } else {
                    q = n[p]
                }
            }
            p++
        }
        var h: Boolean = false
        var i: Int  = 0
        var j: Int  = 0
        var l: Int = 0
        while (i < n.size){
            if(!h){
                if(n[i] == key) {
                    j = i
                    h = true
                }
            } else {
                if(n[i] != key) {
                    val temp = n[j]
                    n[j] = n[i]
                    n[i] = temp
                    j++
                }
            }
            i++
        }
        var m: Int = 0
        var r: Int = 0
        while (m < n.size){
            if(n[m] == key){ break }
            r++
            m++
        }
        return r
    }
}