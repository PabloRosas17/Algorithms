package `fun`.fizzy.tools.heap

/** @desc Heap driver is meant for practice */
/**
 * @suppress when a member function is not used
 * , it is automatically flagged
 * , yea...no, suppress.
 */
@Suppress("MemberVisibilityCanBePrivate")
class Heap(private val heap: Array<Int>, private val MAX_SIZE: Int) {
    /** @improvements TODO Heap... min heap implementation ... max delete function, min max property */

    /** @desc size of the stack */
    /** @analysis O(1) why? assignment */
    private var size = 0

    /** @desc find the root of the heap */
    /** @analysis O(1) why? access */
    fun root(n: Array<Int>): Int = n[0]

    /** @desc find the parent of the heap */
    /** @analysis O(1) why? arithmetic operations */
    private fun parent(key: Int): Int { return ((key-1) / 2) }

    /** @desc find the left of the heap */
    /** @analysis O(1) why? arithmetic operations */
    private fun left(key: Int): Int { return ((2*key) + 1) }

    /** @desc find the right of the heap */
    /** @analysis O(1) why? arithmetic operations */
    private fun right(key: Int): Int { return ((2*key) + 2) }

    /** @desc find the max element */
    /** @analysis O(1) why? access */
    fun max(): Int { return heap[0] }

    /** @desc is the heap empty */
    /** @analysis O(1) why? comparison */
    private fun empty(): Boolean { return size == 0 }

    /** @desc is the heap full */
    /** @analysis O(1) why? comparison */
    private fun full(): Boolean { return size == MAX_SIZE }

    /** @desc adds an element into the heap */
    /** @analysis O(log(n)) why? balance  */
    fun insert(data: Int){
        if(full()){
            println("Heap is full.")
            return
        }
        heap[size++] = data
        var t = size-1
        while (t != 0 && heap[parent(t)] < heap[t]) {
            val temp = heap[t]
            heap[t] = heap[parent(t)]
            heap[parent(t)] = temp
            t = parent(t)
        }
        //this.show()
    }

    /** @desc remove an element from the heap */
    /** @analysis O(log(n)) why? inner operation heapify dominates */
    private fun extract() {
        if(full()){
            println("Heap Underflow.")
            return
        }
        val max = heap[0]
        heap[0] = heap[size--]
        heapify(0)
        println("extract_max, max:$max")
        this.show()
    }

    /** @desc create the heap from the data */
    /** @analysis O(log(n)) why? divide and conquer, walk left, walk right, combine */
    private fun heapify(i: Int) {
        val left = left(i)
        val right = right(i)
        var largest = i
        if (left <= size && heap[left] > heap[largest]) largest = left
        if (right <= size && heap[right] > heap[largest]) largest = right
        if(largest != i){
            val temp = heap[i]
            heap[i] = heap[largest]
            heap[largest] = temp
            heapify(largest)
        }
    }

    /** @desc create the heap fom the data */
    /** @analysis O(n) why? walks through N elements */
    fun build(heap: Array<Int>) {
        size = heap.size-1
        for (i in size/2 downTo  0){
            heapify(i)
        }
        this.show()
    }

    /** @desc organize the elements in the heap using heap sort */
    /** @analysis O(n*log(n)) why? iterate over N elements and heapify by divide and conquer log(N) */
    fun sort() {
        build(heap)
        for(i in size downTo 0){
            val temp = heap[0]
            heap[0] = heap[i]
            heap[i] = temp
            size--
            heapify(0)
        }
        this.show()
    }

    /** @desc displays the elements in the heap */
    /** @analysis O(n) why? iterate over N elements */
    fun show() {
        print("NULL")
        var counter = 0
        for (i in heap.indices) {
            print(" , [$i]:${heap[i]}")
            counter++
        }
        for(j in counter until MAX_SIZE){
            print(" , [$j]:null")
        }
        println(" , NULL")
    }
}