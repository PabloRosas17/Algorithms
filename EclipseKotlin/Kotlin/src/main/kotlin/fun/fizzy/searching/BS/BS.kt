@file:Suppress("PackageName","FunctionName")

package `fun`.fizzy.searching.BS

/** @desc find data in an array using binary search */
/** @analysis O(log(n)) why?
 *      data contains N nodes as the input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as searches on N/2 nodes until key */
class BS {

    fun BS(data: Array<Int>, key: Int) {
        if(!isSorted(data)){
            println("binary search requires the data be sorted.")
            return
        }
        val temp = this.search(data,key,start=0,end=data.size-1)
        if(temp == -1){ println("binary search did not find the data:$temp.") }
        else{ println("binary search found, data:${data[temp]} at index:$temp.") }
    }

    private fun search(data: Array<Int>, key: Int, start: Int, end: Int): Int{
        if(start > end) return -1
        val middle = (start+end)/2
        return if(key == data[middle]) middle
        else if(key < data[middle]) search(data,key,start,middle-1)
        else search(data,key,middle+1,end)
    }

    private fun isSorted(data: Array<Int>): Boolean {
        for(i in 0 until data.size-1){
            if(data[i] > data[i+1]) return false
        }
        return true
    }
}