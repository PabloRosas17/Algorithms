package `fun`.fizzy.practice

import java.util.*
import kotlin.collections.HashMap

/** @desc practice driver is meant for exploring and practicing programming riddles */
class PracticeDriver {

    /* X. */
    fun x(){

    }

    /* finds unique elements in two arrays */
    fun fireFindUnique(a1: Array<Int>, a2: Array<Int>) {
        // TODO: finish unique elements
        val unique: HashMap<Int,Int> = hashMapOf()
        for (i in 0..a1.size-1){
            for(j in 0..a2.size-1){
            }
        }
        unique.forEach { t, u ->
        }
    }

    /* find duplicate elements in two arrays */
    fun fireFindDuplicates(a1: Array<Int>, a2: Array<Int>){
        // TODO: finish duplicate elements
        val duplicate: HashMap<Int,Int> = hashMapOf()
        for (i in 0..a1.size-1){
            for(j in 0..a2.size-1){
            }
        }
        duplicate.forEach { t, u ->
            println("t:$t , u:$u")
        }
    }

    /* reverses a word */
    fun fireReverseWord(word: String): String {
        var temp = ""
        var len = word.length-1
        for(i in 0..word.length-1){
            if(word[len].toString().equals(" ")){ break }
            temp += word[len--]
        }
        return temp
    }

    /* takes args through System.`in`, parses the string and reverses it, cast to a number */
    fun fireReverseNumbers(args: Array<String>){
        var result = ""
        val scanner = Scanner(System.`in`)
        val read = scanner.nextInt()
        val temp = read.toString()
        var end = temp.length-1
        for(i in 0..temp.length-1){
            result += temp[end--]
        }
        println(result.toInt())
    }

    /* takes up to 5 args regardless of order through System.`in`, parses the string and adds a space between each word */
    fun fireSpaceEachWord(args: Array<String>){
        var result = ""
        var temp = ""
        var cntr = 0
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()){
            val read = scanner.next()
            if(cntr == 0){
                temp += read
            } else {
                temp += " $read"
            }
            if(read.isNotEmpty()){
                if(++cntr == 5){
                    break
                }
            }
        }
        for(i in temp.indices){
            if(temp[i].toString() == " "){
                result += "\n"
            } else {
                result += temp[i].toString()
            }
        }
        println(result)
    }

    /* takes args through System.`in`, casts to number and determines if it's between 0 and 10, inclusively */
    fun fireCheck0and10(args: Array<String>){
        val scanner = Scanner(System.`in`)
        val read = scanner.nextInt()
        if(read in 1..9){
            println(true)
        } else {
            println(false)
        }
    }

    /* in increasing order , prints the max value for each integer type */
    fun firePrintMaxIntegerTypes(){
        println(Byte.MAX_VALUE)
        println(Short.MAX_VALUE)
        println(Integer.MAX_VALUE)
        println(Long.MAX_VALUE)
    }

    /* divides two numbers of type long and returns a double */
    fun fireDivTwoLongs(a : Long , b : Long) : Double {
        return a.toDouble()/b.toDouble()
    }

    /** checks if a character is not a number **/
    fun fireIsChar(c: Char): Boolean {
        return try {
            c.toInt() <= 0x2f || c.toInt() >= 0x3a
            println(true)
            true
        } catch (e: NumberFormatException) {
            println("NumberFormatException")
            false
        }
    }

    /** checks if a character is a number **/
    fun fireIsDigit(c: Char): Boolean {
        return try {
            c.toInt() >= 0x30 || c.toInt() <= 0x39
            println(true)
            true
        } catch (e: NumberFormatException) {
            println("NumberFormatException")
            false
        }
    }

    /* X. */
    fun xyz(){

    }
}