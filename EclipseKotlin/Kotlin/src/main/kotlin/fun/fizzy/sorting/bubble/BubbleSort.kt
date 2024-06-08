package `fun`.fizzy.sorting.bubble

@Suppress("FunctionName")

/** @desc organize the elements by using bubble sort */
/** @analysis O(n^2) why?
 *      data contains N nodes as input,
 *      intensive work will be done by iterating over N nodes M nodes,
 *      where M=N as input and M⊆N, as an inner product,
 *      which does the sort and swap until end of M ∀ N */
class BubbleSort {

    fun BubbleSort(data: Array<Int>){
        for(i in data.size-1 downTo 0){
            for(j in 0..i){
                if(data[j] > data[i]){
                    val temp = data[j]
                    data[j] =  data[i]
                    data[i] = temp
                }
            }
        }
        data.forEach { it->print("-$it") }
    }
}