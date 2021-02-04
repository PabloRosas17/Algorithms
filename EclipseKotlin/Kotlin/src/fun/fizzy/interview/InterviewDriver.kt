package `fun`.fizzy.interview

/** @desc interview driver is meant for rehearsing questions i've been asked in interviews */
class InterviewDriver {

    /* find the transpose of a matrix. */
    fun fireMatrixTranspose(rows: Int, cols: Int, r: Array<IntArray>){
        val ret: Array<IntArray> = Array(3) { IntArray(3) }
        for(i in 0 until rows){
            for(j in 0 until cols){
                ret[i][j] = r[j][i]
            }
        }
        val t1 = printMatrixTransposeArray(r)
        val t2 = printMatrixTransposeArray(ret)
        println("Here is the original matrix.\n$t1\nHere is the transposed matrix.\n$t2")
    }

    /* prints the matrix. */
    private fun printMatrixTransposeArray(a: Array<IntArray>): String{
        var temp = ""
        a.forEachIndexed { i, ints ->
            ints.forEachIndexed { j, e ->
                temp += " [$i][$j]: $e"
            }
        }
        return temp
    }

    /* reverses a sentence. */
    fun fireSentenceReverse(s: String){
        var rever = ""
        var end = s.length-1
        for(i in 0..s.length-1){
            rever += s[end--]
        }
        print("Here is the original string.\n$s\nHere is the reversed string.\n$rever")
    }
}