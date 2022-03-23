package `fun`.fizzy.sorting.selection

@Suppress("FunctionName")

/** @desc organize the elements by using selection sort */
/** @analysis O(n^2) why?
 *      data contains N nodes as input,
 *      intensive work will be done by visiting all elements by both pointers,
 *      this will stimulate a resolution of N*(M=N) ∴ O(n^2) */
class SelectionSort {

    fun SelectionSort(data: Array<Int>){
        val size = data.size-1
        for(i in data.indices){
            var min = i
            for(j in i+1 until data.size){
                if(data[j] < data[min]){
                    min = j
                }
            }
            val temp = data[i]
            data[i] = data[min]
            data[min] = temp
        }
        data.forEach { it->print(" $it ") }
    }

    /** @desc organize the elements in ascending order by using selection sort  */
    private fun ascending(data: Array<Int>){
        val size = data.size-1
        for(i in data.indices){
            var min = i
            for(j in i+1 until data.size){
                // <>> descending
                if(data[j] < data[min]){
                    min = j
                }
            }
            val temp = data[i]
            data[i] = data[min]
            data[min] = temp
        }
    }

    /** @desc organize the elements in descending order by using selection sort  */
    private fun descending(data: Array<Int>){
        val size = data.size-1
        for(i in data.indices){
            var min = i
            for(j in i+1 until data.size){
                // > descending
                if(data[j] > data[min]){
                    min = j
                }
            }
            val temp = data[i]
            data[i] = data[min]
            data[min] = temp
        }
    }
}