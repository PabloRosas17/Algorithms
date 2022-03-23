package `fun`.fizzy.sorting.heap

import `fun`.fizzy.tools.heap.Heap

@Suppress("FunctionName")

/** @desc organize the elements by using heap sort */
/** @analysis O(n*log(n)) why?
 *      data contains N nodes as input,
 *      heapsort insert operation does log(n) work to insert data,
 *      heapsort sort operation does n*log(n) work to sort data,
 *      specifically, build takes O(n) work and heapify takes O(log(n)) work,
 *      which n*log(n) dominates log(n) ∴ n*log(n) */
class HeapSort {

    fun HeapSort(data: Array<Int>){
        val heap: Heap = Heap(arrayOf(0,0,0,0,0,0,0,0,0,0), MAX_SIZE = 10)
        for(i in data.indices) heap.insert(data[i])
        heap.sort()
    }
}