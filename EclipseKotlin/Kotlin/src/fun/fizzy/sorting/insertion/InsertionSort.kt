package `fun`.fizzy.sorting.insertion

@Suppress("FunctionName")

/** @desc organize the elements by using insertion sort */
/** @analysis O(n^2) why?
 *      data contains N nodes as input,
 *      intensive work will be done by iterating over N nodes and M nodes,
 *      where M=N as input and M∈N, as an inner product,
 *      which does the sort and swap until end of M ∀ N */
class InsertionSort {

    fun InsertionSort(data: Array<Int>){
        val size = data.size-1
        var temp: Int
        var h: Int
        var j: Int
        for(i in 0..size) {
            temp = data[i]
            j = i-1
            while ((j > -1) && (data[j] > temp)){
                data[j+1] = data[j]
                j--
            }
            data[j+1] = temp
        }
        data.forEach { it->print(" $it ") }
    }
}