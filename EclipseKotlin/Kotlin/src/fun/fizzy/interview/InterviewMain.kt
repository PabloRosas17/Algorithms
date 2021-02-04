package `fun`.fizzy.interview

private val mInterviewDriver: InterviewDriver = InterviewDriver()

fun main(args: Array<String>){
    println("* * * * * Transpose of a matrix. * * * * *")
    val matrix: Array<IntArray> = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6),intArrayOf(7,8,9))
    mInterviewDriver.fireMatrixTranspose(3,3, matrix)

    println("* * * * * Reversed form of a string. * * * * *")
    val sentence: String = "I am a sentence and you're not."
    mInterviewDriver.fireSentenceReverse(sentence)
}