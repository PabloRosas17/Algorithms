package `fun`.fizzy.sorting.quick

@Suppress("FunctionName")

/** @desc organize the elements by using quick sort */
/** @analysis O(n^2) why? pivot
 *      data contains N nodes as input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as sorts on N/2 nodes until pivot is met
 *      combine by swapping elements inn the "sub-array"
 *      when the pivot is chosen poorly, such that, partition into two containers,
 *      one of size 1 and the other of size n-1, recursion depth will be n, which leads to n^2 */
class QuickSort {

    fun QuickSort(data: Array<Int>){
        this.sort(data)
        data.forEachIndexed { i, it->print(" [$i]:$it") }
    }

    /** @desc organize the elements in the data by recursion using quick sort */
    private fun sort(data: Array<Int>){
        this.quicker(data, lo = 0, hi = data.size-1)
    }

    /** @desc routine defines base-case and recursion for the sorting */
    private fun quicker(array: Array<Int>, lo: Int, hi: Int){
        if(lo < hi){
            //divide //O(n)
            val pv = partition(array,lo,hi)
            //conquer & combine left //O(n)
            quicker(array,lo,pv-1)
            //conquer & combine right //O(n)=>m
            quicker(array,pv+1,hi)
        }
    }

    /** @desc sorts the left sorts the right, combines the "sub-arrays" */
    private fun partition(array: Array<Int>, lo: Int, hi: Int): Int {
        //index of the current smallest element
        var i = lo
        //find the smallest element
        //swap with pivot
        //retain the index of smaller element
        for (k in lo until hi){
            if(array[k] < array[hi]){
                val temp = array[k]
                array[k] = array[i]
                array[i] = temp
                i++
            }
        }
        //swap the pivot with the smaller element obtained
        val temp = array[hi]
        array[hi] = array[i]
        array[i] = temp
        return i
    }
}