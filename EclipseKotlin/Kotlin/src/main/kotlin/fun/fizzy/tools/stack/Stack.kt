package `fun`.fizzy.tools.stack

/** @desc Stack driver is meant for practice */
/**
 * @suppress when a member function is not used
 * , it is automatically flagged
 * , yea...no, suppress.
 */
@Suppress("MemberVisibilityCanBePrivate")
class Stack(private val MAX_SIZE: Int) {

    /** @desc pointer to the stack */
    /** @analysis O(1) why? assignment */
    private val stack = IntArray(MAX_SIZE)

    /** @desc size of the stack */
    /** @analysis O(1) why? assignment */
    private var size = 0

    /** @desc top of the stack */
    /** @analysis O(1) why? assignment */
    private var top = -1

    /** @desc prints the stack starting from the top ending at the bottom */
    /** @analysis O(n) why? iterate over N elements */
    fun printFromTop(){
        if(empty()) return
        print("NULL - ")
        for(e in stack){
            print("${e.toChar()} - ")
        }
        println("NULL")
    }

    /** @desc prints the stack starting from the bottom ending at the top */
    /** @analysis O(n) why? iterate over N elements */
    fun printFromBottom(){
        if(empty()) return
        print("NULL - ")
        for(e in stack.size-1 downTo 0){
            print("${stack[e].toChar()} - ")
        }
        println("NULL")
    }

    /** @desc adds an element to the stack */
    /** @analysis O(1) why? access assign */
    fun push(c: Char){
        if (full()) {
            println("stack size is $top which is full.")
        } else {
            println("push $c")
            stack[++top] = c.code
            size++
        }
    }

    /** @desc removes an element from the stack */
    /** @analysis O(1) why? access assign */
    fun pop() {
        if(empty()){
            println("stack size is $top which is empty.")
        } else {
            val element = stack[top]
            println("pop $element")
            stack[top--] = -1
            size--
        }
    }

    /** @desc removes all elements from the stack */
    /** @analysis O(n) why? iterate over N elements */
    fun clear() {
        for(i in top downTo 0){
            stack[top--] = -1
            size--
        }
    }

    /** @desc organize the elements in the stack using insertion sort */
    /** @analysis worst case O(n^2) why? visit each element twice in a descending stack */
    /** @analysis best case O(n) why? visit each element once in an ascending stack */
    fun sort(){
        if(empty()) return
        print("stack before insertion sorting: ")
        stack.forEach { it->print(" $it ") }
        print("\n")
        val size = stack.size-1
        var temp: Int
        var h: Int
        var j: Int
        for(i in 0..size) {
            temp = stack[i]
            j = i-1
            while ((j > -1) && (stack[j] > temp)){
                stack[j+1] = stack[j]
                j--
            }
            stack[j+1] = temp
        }
        print("stack after insertion sorting: ")
        stack.forEach { it->print(" $it ") }
        print("\n")
    }

    /** @desc is the stack empty */
    /** @analysis O(1) why? comparison */
    private fun empty(): Boolean { return top==-1 }

    /** @desc is the stack full  */
    /** @analysis O(1) why? comparison */
    private fun full(): Boolean { return top+1==MAX_SIZE }

    /** @desc is the size of the stack  */
    /** @analysis O(1) why? comparison */
    private fun size(): Int { return size }
}