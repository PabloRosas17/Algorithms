package `fun`.fizzy.tools.queue

import kotlin.random.Random

/** @desc Queue driver is meant for practice */
/**
 * @suppress maximum size is defined by the client
 * , this naming convention is not protocol
 * , but by design I am aware of this, I wish to name consciously
 * , therefore the suppression annotation will be used
 */
@Suppress("PrivatePropertyName")
class Queue(private val MAX_SIZE: Int){

    /** @desc pointer to the queue */
    /** @analysis O(1) why? assignment */
    private val queue = arrayOfNulls<Int>(MAX_SIZE)

    /** @desc pointer to front of the queue */
    /** @analysis O(1) why? assignment */
    private var front: Int? = null

    /** @desc pointer to rear of the queue */
    /** @analysis O(1) why? assignment */
    private var rear: Int? = null

    /** @desc size of the queue */
    /** @analysis O(1) why? assignment */
    private var size = 0

    /** @desc add an element to the queue */
    /** @analysis O(1) why? contains N elements but inserts into the next which is constant 1 */
    fun enqueue(element: Int){
        if(isFull()){
            println("queue size is $size which is full, can not enqueue")
            return
        } else{
            if(front == null && rear == null){
                front = 0
                rear = 0
                queue[0] = element
            } else {
                if(rear != null) {
                    var temp = rear!!
                    queue[++temp] = element
                    rear = temp
                }
            }
            size++
        }
        this.show()
    }

    /** @desc remove an element from the queue */
    /** @analysis O(1) why? contains N elements but deletes from the next which is constant 1 */
    fun dequeue(){
        if(isEmpty()){
            println("queue size is $size which is empty, can not dequeue")
            return
        } else{
            var temp = front!!
            queue[temp] = null
            front = ++temp
            size--
            if(front == MAX_SIZE){
                front = 0
                rear = 0
            }
        }
        this.show()
    }

    /** @desc delete all the elements in the queue */
    /** @analysis O(n) why? iterate over N nodes */
    fun clear(){
        if(isEmpty()) return
        for (i in 0 until MAX_SIZE) {
            queue[i] = -1
        }
        front = (null).also { rear = it }
        this.show()
    }

    /** @desc find an element in the queue */
    /** @analysis O(n) why? iterate over N nodes */
    fun search(element: Int){
        if(isEmpty()) return
        var temp: Int? = null
        for(e in queue) { if (e == element) { temp = e } }
        if(temp == null){ println("$element does not exist in the queue.") }
        else { println("$element does exist in the queue.") }
        this.show()
    }

    /** @desc organize the elements in the queue by recursion using merge sort */
    /** @analysis O(n*log(n)) why? walk left,walk right, recursively in half */
    fun sort(){
        if(isEmpty()) return
        print("queue before merge sorting: ")
        this.show()
        this.merger(queue, front!!,rear!!)
        print("queue after merge sorting: ")
        this.show()
    }

    /** @desc routine defines base-case and recursion for the sorting */
    /** @analysis O(n*log(n)) why? refer to sort() */
    private fun merger(array: Array<Int?>, start: Int, end: Int){
        if(start < end){
            //divide //O(1)
            val middle = (start+end)/2
            //conquer left //O(n/2)
            merger(array, start, middle)
            //conquer right //O(n/2)
            merger(array, middle+1, end)
            //combine //O(n)
            merge(array, start, middle,end)
        }
    }

    /** @desc sorts the left sorts the right combines the sub-arrays */
    /** @analysis O(n*log(n)) why? refer to sort() */
    private fun merge(array: Array<Int?>, start: Int, middle: Int, end: Int){
        //create sub-arrays arrays
        val tempL = array.copyOfRange(start,middle+1)
        val tempR = array.copyOfRange(middle+1,end+1)
        //track index of sub-arrayL (i), sub-arrayR (j), and main-array (k)
        var i = 0
        var j = 0
        var k = start
        //organize elements by swapping
        while( (i<tempL.size) && (j<tempR.size) ){
            if(tempL[i]!! <= tempR[j]!!){ queue[k++] = tempL[i++] }
            else{ queue[k++] = tempR[j++] }
        }
        //assume we reached the end in either sub-array
        //, but the other still has elements, simply copy them over
        while (i < tempL.size){ queue[k++] = tempL[i++] }
        while (j < tempR.size){ queue[k++] = tempR[j++] }
    }

    /** @desc show a random element in the queue */
    /** @analysis O(1) why? random number generator is constant 1 so the rest is access operations */
    fun peek(){
        if(isEmpty()) return
        var temp  = Random.nextInt(until = MAX_SIZE)
        while (queue[temp] == null){ temp = Random.nextInt(until = MAX_SIZE) }
        println("random index:$temp has a value:${queue[temp]}")
    }

    /** @desc show the top of the queue */
    /** @analysis O(1) why? comparison access */
    private fun front(): Int?{
        return if(front != null) queue[front!!] else null
    }

    /** @desc show the bottom of the queue */
    /** @analysis O(1) why? comparison access */
    private fun rear(): Int?{
        return if(rear != null) queue[rear!!] else null
    }

    /** @desc determine if there is something or nothing in the queue */
    /** @analysis O(1) why? comparison */
    //another way could be, return size == 0
    private fun isEmpty(): Boolean{
        return if(front == null && rear == null){
            println("queue was null, empty queue.")
            true
        } else {
            false
        }
    }

    /** @desc determine if the max size has been reached in the queue */
    /** @analysis O(1) why? comparison */
    //another way could be, return size == MAX_SIZE-1
    private fun isFull(): Boolean{
        return rear == MAX_SIZE-1
    }

    /** @desc number of elements in the queue */
    /** @analysis 0(1) why? access */
    //another way could be, traverse the array and use a counter for each element
    private fun size(): Int{
        return this.size
    }

    /** @desc display the queue */
    /** @analysis O(n) why? iterate over N nodes */
    private fun show(){
        if(isEmpty()) return
        for(element in queue){
            print("$element | ")
        }
        println("NULL")
    }
}