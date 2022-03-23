package `fun`.fizzy.leetcode.easy

import java.util.*

/** @desc leet code easy driver is meant for easy questions  */
/**
 * @suppress all functions in the file will be exposed to the client
 * , when a function is used by another function in the implementation
 * , the IDE believes that it should be encapsulated
 * , but by design I am aware of this, I wish to expose consciously
 * , therefore the suppression annotation will be used
 */
@Suppress("MemberVisibilityCanBePrivate")
class LeetCodeEasy {

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
     * @problem find duplicate elements in an array
     * @analysis O(n) where n is the size of the int array
     */
    fun findDuplicates(a1: IntArray): IntArray {
        val set: HashSet<Int> = hashSetOf()
        a1.forEach { it-> set.add(it) }
        return set.toIntArray()
    }

    /**
     * @problem find duplicate elements in an unordered list of length n using HashSet
     * @analysis O(n) where n is the size of the array
     */
    fun findDuplicatesHashSet(a: Array<Int>): ArrayList<Int> {
        val start = 0
        val end = a.size-1
        val set: HashSet<Int> = hashSetOf()
        val list: ArrayList<Int> = arrayListOf()
        for(i in start..end){
            if(!set.add(a[i])){
                list.add(a[i])
            }
        }
        return list
    }

    /**
     * @problem find duplicate elements in an unordered array of length n using HashMap
     * @constraints returns -1 at index 0 if array is empty or there is no duplicates
     * @analysis O(n) where n is the size of the array
     */
    fun findDuplicatesHashMap(a: Array<Int>): Array<Int?> {
        val length = a.size
        val map = hashMapOf<Int,Int>()
        val array = arrayOfNulls<Int>(length)
        var arrayL = 0
        val counter = 1
        val exists = 1
        for(i in 0 until length){
            if(map[a[i]] == exists){
                array[ arrayL ] = a[i]
                arrayL += 1
            } else {
                map[a[i]] = counter
            }
        }
        if(array.isEmpty()){
            array[0] = -1
        }
        return array
    }

    /**
     * @problem find the longest common prefix string amongst an array of strings
     * @define prefix is a group of letters placed before the root of a word
     * @analysis .....TODO
     * @tag leetcode official problem
     */
    fun findPrefix(s: Array<String>): String {
        /** todo: findPrefix(...)
         **     , found each element for each word
         **     , need to filter the common prefix
         **     , consider flower,flow,flo
         **     , flow is common when comparing flower and flow, but not flow and flo
         **/
        if(s.isEmpty()){ return "" }
        if(s.size == 1){ return s[0] }

        val first = s[0]
        val second = s[1]
        var prefix = ""

        //"flower","flow","flight"
        // it0: e:flower, flow => flo
        // it1: e:flow, flight => fl
        // it2 e:flight, null => return if comparing null
        for(e in s.indices){
            val next = if( (e+1) <= s.size-1) e+1 else null
            s[e].forEach { i ->
                if(next != null){
                    s[next].forEach { j ->
                        print("$i $j.")
                    }
                }
            }
        }

        return ""
    }

    /**
     * @problem reverse an integer n
     * @analysis O(n) where n is the value of the int
     */
    fun findReverse(n: Int): Int {
        var copy = n
        val place = 10
        var reversed = 0
        while (copy > 0){
            reversed = (reversed*place) + (copy%place)
            copy /= place
        }
        return reversed
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
            /* right == left */
            a.max()!!
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

    /**
     * @problem finds unique elements in two unordered arrays both of length n
     * @analysis O(n) where n is each nth element in the array
     */
    fun findUniques(a1: Array<Int>, a2: Array<Int>, n: Int) {
        val set = HashSet<Int>()
        a1.forEach { p -> set.add(p) }
        a2.forEach { q -> set.add(q) }
    }

    /**
     * @problems when n is divisible by key then add an element to a list
     * @constraints 1 <= n <= math.pow(10,4)
     * @analysis O(n) where n is the value of the input n
     * @tag leetcode official problem
     */
    fun fireFizzBuzz(n: Int): List<String> {
        arrayListOf<String>().run {
            (1..n).forEach { it ->
                if ((it % 5) == 0 && (it % 3) == 0) {
                    this.add("FizzBuzz")
                } else if ((it % 5) == 0) {
                    this.add("Buzz")
                } else if ((it % 3) == 0) {
                    this.add("Fizz")
                } else {
                    this.add(it.toString())
                }
            }
            return this
        }
    }

    /**
     * @problem Given the array candies and the integer extraCandies
     *  , where candies[ i ] represents the number of candies that the ith kid has.
     *  For each kid check if there is a way to distribute extraCandies among the
     *  kids such that he or she can have the greatest number of candies among them.
     *  Notice that multiple kids can have the greatest number of candies.
     * @constraints
     *  2 <= candies.length <= 100
     *  1 <= candies[ i ] <= 100
     *  1 <= extraCandies <= 50
     * @analysis O(n) where n is the size of the int array
     * @tag leetcode official problem
     */
    fun fireKidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val bucket = arrayListOf<Boolean>()
        var biggest = 0
        candies.forEachIndexed { _, n ->
            if(biggest < n){
                biggest = n
            }
        }
        candies.forEachIndexed { _, e ->
            if( (extraCandies + e) >= biggest){
                bucket.add(true)
            } else {
                bucket.add(false)
            }
        }
        return bucket
    }

    /**
     * @problem take up to 5 arguments, regardless of order
     * , parses the string, and adds a space between each word
     * @param args by System.`in`
     * @analysis O(n) where n is the size of temp the input
     */
    fun fireSpaceEachWord(args: Array<String>): String {
        var result = ""
        var temp = ""
        var counter = 0
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()){
            val read = scanner.next()
            temp += if(counter == 0){
                read
            } else {
                " $read"
            }
            if(read.isNotEmpty()){
                if(++counter == 5){
                    break
                }
            }
        }
        for(i in temp.indices){
            result += if(temp[i].toString() == " "){
                "\n"
            } else {
                temp[i].toString()
            }
        }
        return result
    }

    /**
     * @problem two strings are called anagrams,
     * if they contain all the same characters in the same frequencies
     * @constraints
     *  1 <= a.length, b.length <= (5 * math.pow(10,4))
     *  a and b consist of lowercase English letters.
     * @analysis O(n) where n is the size of a b
     * @tag leetcode official problem
     * @tag hackerrank official problem
     */
    fun isAnagram(a:String,b:String): Boolean{
        var result = true
        val aL = a.toLowerCase()
        val bL = b.toLowerCase()

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
     * @problem checks if a character is a character
     * @constraints c >= 0x20 && c <= 0x7e
     * @analysis O(1) comparison
     */
    fun isChar(c: Char): Boolean {
        if(c.toInt() in 0x20..0x7e){
            return true
        }
        return false
    }

    /**
     * @problem checks if a character is a number
     * @constraints c >= 0x30 && c <= 0x39
     * @analysis O(1) comparison
     */
    fun isDigit(c: Char): Boolean {
        if(c.toInt() in 0x30..0x39){
            return true
        }
        return false
    }

    /**
     * @problem determine if an argument is a number between S and E, inclusively
     * @param args by System.`in`
     * @analysis O(1) input
     */
    fun isInRange(args: Array<String>, S: Int, E: Int): Boolean {
        val scanner = Scanner(System.`in`)
        val read = scanner.nextInt()
        return read in S..E
    }

    /**
     * @problem check if an integer n is a palindrome
     * @analysis O(n) where n is the value of the int
     * @tag leetcode official problem
     */
    fun isPalindrome(n: Int): Boolean {
        if(n < 0){ return  false }
        if(n in 0..9){ return true }
        val reversed = this.findReverse(n)
        return reversed == n
    }

    /**
     * @problem check if a phrase as a string is a palindrome
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
    fun isPalindrome(s: String): Boolean {
        //check in range
        s.forEach { i-> if(i.toInt() < 32 || i.toInt() > 126){ return false } }
        //strip and lowercase
        val regex = Regex("[^A-Za-z0-9]")
        val p = regex.replace(s,"")
        val q = p.toLowerCase()
        //algorithm
        val half = q.length/2
        val start = 0
        val end = q.length
        for(i in start until half){
            if(q[i] != q[end-i-1]){
                return false
            }
        }
        return true
    }

    /**
     * @problem Given an integer array nums, return true if any value appears at least twice in the array
     * , and return false if every element is distinct.
     * @constraints 1 <= nums.length <= (math.pow(10,4))
     * (math.pow(-10,9)) <= nums[ index ] <= (math.pow(+10,9))
     * @analysis O(n) where n is the number of elements in the array
     * @tag leetcode official problem
     */
    fun hasDuplicates(nums: IntArray): Boolean {
        return hashSetOf<Int>().apply{ for(element in nums){ this.add(element) } }.size != nums.size
    }

    /**
     * @problem given n1 integer and n2 integer represented as strings, return their sum as a string
     * @constraints 1 <= n1.length, n2.length <= (math.pow(10,4))
     * @analysis O(n) where n is the nth iteration of the loops as the number of elements in each stack
     * @tag leetcode official problem
     */
    fun mathAddStrings(n1: String, n2: String): String {
        val a: Stack<Int> = Stack<Int>().apply { n1.forEach { e -> this.push(mathStrToInt("0$e")) } }
        val b: Stack<Int> = Stack<Int>().apply { n2.forEach { e -> this.push(mathStrToInt("0$e")) } }
        return mathPlusInts(a, b,"")
    }

    /**
     * @problem recursively add integers a and b contained in strings n and m inside stacks p and q
     * @constraints do not use and built-in functions to handle string to int or int to string
     * , furthermore handle big integers where characters of n and m, 0 <= n and m<= 24
     * @analysis .....TODO
     */
    fun mathPlusInts(a: Stack<Int>, b: Stack<Int>, sum: String): String {
        if(a.isEmpty() && b.isEmpty()) return sum.ifBlank { "0" }

        val p = if(!a.isEmpty()) a.pop() else 0
        val q = if(!b.isEmpty()) b.pop() else 0
        val c = if(sum.isNotEmpty() && sum.length >= 2) mathStrToInt(sum[0].toString()) else 0
        val o = if(c+p+q >= 10) c+p+q else 0
        /**
         ** todo: overflow failing in mathPlusInts(...)
         **     , 111+0 failing, after this is resolved
         **     , and tested
         **     , then add left + right
         **     , n/2 divide and conquer
        **/
        val z = if(sum.length>=2) sum.substring(1) else if (sum.length==1) sum.substring(0) else ""

        val v = mathIntToStr(o)+z

        if(!a.isEmpty() && !b.isEmpty()) return mathPlusInts(a,b,v)
        if(!a.isEmpty() && b.isEmpty()) return mathPlusInts(a,b,v)
        if(a.isEmpty() && !b.isEmpty()) return mathPlusInts(a,b,v)

        print("$v _")
        return v
    }

    /**
     * @problem given n string as an integer return its value as a string
     * @constraint n is not a negative
     * @analysis O(n) where n is the nth iteration as size of the int
     */
    fun mathIntToStr(n: Int): String {
        if(n == 0){ return ""+0 }
        val ascii: Char = '0'
        var number: Int = n
        val factor = 10
        var result: String = ""
        val token: String = ""
        val builder = StringBuilder()
        val front = 0
        while (number != 0){
            val temp = number % factor
            result = token+(ascii + number % factor)
            builder.insert(front,result)
            number /= factor
        }
        return token+builder
    }

    /**
     * @problem given n integer as a string return its value as an integer
     * @constraint n is not a negative
     * @analysis O(n) where n is the length of the number as a string
     */
    fun mathStrToInt(n: String): Int {
        val ascii: Char = '0'
        val number: String = n
        val factor = 10
        var index: Int = 0
        var result: Int = 0
        var token: Char = '*'
        while (index < number.length){
            result *= factor
            token = number[index]
            result += (token - ascii)
            index++
        }
        return result
    }

    /**
     * @problem divides two numbers of type long and returns a double
     * @constraint b is not 0
     * @analysis O(1) division
     */
    fun mathDivTwoLongs(a : Long, b : Long) : Double {
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
     * @problem convert a string of roman symbols to integer values
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
     * @problem convert a character to a roman value
     * @analysis O(1) assignment
     */
    fun mathRomanValue(s: Char): Int {
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
     * @problem find the transpose of a matrix
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
     * @problem print a matrix,
     * @constraints n rows, m cols
     * @analysis O(n^2) where iterating ith times iterating jth times is n^2
     */
    fun printMatrix(a: Array<IntArray>): String {
        var temp = ""
        a.forEachIndexed { i, ints ->
            ints.forEachIndexed { j, e ->
                temp += " [$i][$j]: $e"
            }
        }
        return temp
    }

    /**
     * @problem in increasing order , prints the max value for each integer type
     * @analysis O(1) print
     */
    fun printMaxIntegerTypes() {
        println(Byte.MAX_VALUE)
        println(Short.MAX_VALUE)
        println(Integer.MAX_VALUE)
        println(Long.MAX_VALUE)
    }

    /**
     * @problem reverses a string where the input string is given as a raw string type.
     * @analysis O(n) when iterating the string of length n
     * @improvement O(log n) where dividing in half is log n
     */
    fun reverseString(string: String): String {
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
    fun reverseString(array: CharArray): Unit {
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
    fun reverseNumbers(): Int {
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
     * @problem remove duplicates in-place from an array n, so that each element appears only once
     * , n is sorted in non-decreasing order, elements in n should be kept in the same relative order
     * @constraint perform the modification in O(1) space complexity, without allocating more memory
     * 0 <= n.length <= (3 * math.pow(10,4))
     * -100 <= n[ i ] <= 100
     * @analysis O(n) where n is the size of the array
     * @tag leetcode official problem
     */
    fun removeDuplicates(n: IntArray): Int {
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