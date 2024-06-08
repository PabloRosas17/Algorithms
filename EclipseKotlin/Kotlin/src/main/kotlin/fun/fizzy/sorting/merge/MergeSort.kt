package `fun`.fizzy.sorting.merge

@Suppress("FunctionName")

/** @desc organize the elements by using merge sort */
/** @analysis O(n*log(n)) why? sub-storage
 *      data contains N nodes as input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as sorts on N/2 nodes until key
 *      combine by creating storage T
 *          , placing elements by swapping and sorting on N nodes
 *          , and gluing the result into the original data */
class MergeSort {

    private var data: Array<Int> = arrayOf()

    fun MergeSort(data: Array<Int>){
        this.data = data
        this.sort()
        data.forEachIndexed { i, it->print(" [$i]:$it") }
    }

    private fun sort(){
        this.merger(data, start = 0, end = data.size-1)
    }

    /** @desc routine defines base-case and recursion for the sorting */
    private fun merger(array: Array<Int>, start: Int, end: Int){
        if(start < end){
            //divide //O(1)
            val middle = (start+end)/2
            //conquer left //O(n/2)
            merger(data, start, middle)
            //conquer right //O(n/2)
            merger(data, middle+1, end)
            //combine //O(n)
            merge(data, start, middle,end)
        }
    }

    /** @desc sorts the left sorts the right combines the sub-arrays */
    private fun merge(array: Array<Int>, start: Int, middle: Int, end: Int){
        //create sub-arrays arrays
        val tempL = array.copyOfRange(start,middle+1)
        val tempR = array.copyOfRange(middle+1,end+1)
        //track index of sub-arrayL (i), sub-arrayR (j), and main-array (k)
        var i = 0
        var j = 0
        var k = start
        //organize elements by swapping
        while( (i<tempL.size) && (j<tempR.size) ){
            if(tempL[i] <= tempR[j]){ data[k++] = tempL[i++] }
            else{ data[k++] = tempR[j++] }
        }
        //assume we reached the end in either sub-array
        //, but the other still has elements, simply copy them over
        while (i < tempL.size){ data[k++] = tempL[i++] }
        while (j < tempR.size){ data[k++] = tempR[j++] }
    }
}