@file:Suppress("PackageName","FunctionName")

package `fun`.fizzy.searching.LS

/** @desc find data in an array using linear search */
/** @analysis O(n) why?
 *      data contains N nodes as the input,
 *      intensive work will be done by having to visit N nodes until key */
class LS {

    fun LS(data: Array<Int>, key: Int){
        this.iteratively(data,key)
        this.recursively(data,key)
    }

    private fun iteratively(data: Array<Int>, key: Int){
        data.forEachIndexed {i,it->
            if(it==key) println("$key is found at index $i")
            else println("$key is not found")
        }
    }

    private fun recursively(data: Array<Int>, key: Int){
        val k = this.recurse(data,key,0,data.size-1)
        if(data[k] == key) println("$key is found at index $k")
        else println("$key is not found")
    }

    private fun recurse(data: Array<Int>, key: Int, left: Int, right: Int): Int {
        return if(left > right) -1
        else if(data[left] == key) left
        else recurse(data,key,left+1,right)
    }
}