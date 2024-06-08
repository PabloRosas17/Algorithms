package `fun`.fizzy.`fun`.fizzy.leetcode.easy

import java.util.*

class Strings {

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
     * @problem recursively add integers a and b contained in strings n and m inside stacks p and q
     * @constraints do not use and built-in functions to handle string to int or int to string
     * , furthermore handle big integers where characters of n and m, 0 <= n and m<= 24
     * @analysis .....TODO
     */
    private fun plusInts(a: Stack<Int>, b: Stack<Int>, sum: String): String {
        if(a.isEmpty() && b.isEmpty()) return sum.ifBlank { "0" }

        val p = if(!a.isEmpty()) a.pop() else 0
        val q = if(!b.isEmpty()) b.pop() else 0
        val c = if(sum.isNotEmpty() && sum.length >= 2) strToInt(sum[0].toString()) else 0
        val o = if(c+p+q >= 10) c+p+q else 0
        /**
         ** todo: overflow failing in mathPlusInts(...)
         **     , 111+0 failing, after this is resolved
         **     , and tested
         **     , then add left + right
         **     , n/2 divide and conquer
         **/
        val z = if(sum.length>=2) sum.substring(1) else if (sum.length==1) sum.substring(0) else ""

        val v = intToStr(o)+z

        if(!a.isEmpty() && !b.isEmpty()) return plusInts(a,b,v)
        if(!a.isEmpty() && b.isEmpty()) return plusInts(a,b,v)
        if(a.isEmpty() && !b.isEmpty()) return plusInts(a,b,v)

        print("$v _")
        return v
    }

    /**
     * @problem given n string as an integer return its value as a string
     * @constraint n is not a negative
     * @analysis O(n) where n is the nth iteration as size of the int
     */
    private fun intToStr(n: Int): String {
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
     * @problem given n1 integer and n2 integer represented as strings, return their sum as a string
     * @constraints 1 <= n1.length, n2.length <= (math.pow(10,4))
     * @analysis O(n) where n is the nth iteration of the loops as the number of elements in each stack
     * @tag leetcode official problem
     */
    fun plusStrings(n1: String, n2: String): String {
        val a: Stack<Int> = Stack<Int>().apply { n1.forEach { e -> this.push(strToInt("0$e")) } }
        val b: Stack<Int> = Stack<Int>().apply { n2.forEach { e -> this.push(strToInt("0$e")) } }
        return plusInts(a, b,"")
    }

    /**
     * @problem given n integer as a string return its value as an integer
     * @constraint n is not a negative
     * @analysis O(n) where n is the length of the number as a string
     */
    private fun strToInt(n: String): Int {
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
     * @problem take up to 5 arguments, regardless of order
     * , parses the string, and adds a space between each word
     * @param args by System.`in`
     * @analysis O(n) where n is the size of temp the input
     */
    fun spaceEachWord(args: Array<String>): String {
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
}