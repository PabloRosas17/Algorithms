package `fun`.fizzy.practice

private val mPracticeDriver: PracticeDriver = PracticeDriver()

private val mWaitDriver: WaitDriver = WaitDriver()

fun main(args: Array<String>){

    println("* * * * * Find print two arrays. * * * * *")
    val a1: Array<Int> = arrayOf(1,2,3)
    val a2: Array<Int> = arrayOf(4,3,5,2)
    var twoarrays = ""
    a1.forEachIndexed { index, i -> twoarrays = twoarrays + a1[index] + " " }
    a2.forEachIndexed { index, i -> twoarrays = twoarrays + a2[index] + " " }
    println(twoarrays)

    println("* * * * * Find unique elements in two arrays. * * * * *")
    mPracticeDriver.fireFindUnique(a1,a2) //unique: 1,4,5

    println("* * * * * Find unique elements in two arrays. * * * * *")
    mPracticeDriver.fireFindDuplicates(a1,a2) //not unique: 2,3

    println("* * * * * Reversed a single word. * * * * *")
    val word: String = "California. Is My Home."
    println(mPracticeDriver.fireReverseWord(word)) //.ainrofilaC

    println("* * * * * Reverse some number. * * * * *")
    mPracticeDriver.fireReverseNumbers(args)

    println("* * * * * Add spaces after each word. * * * * *")
    mPracticeDriver.fireSpaceEachWord(args)

    println("* * * * * Check if a number between 0 and 10 inclusively. * * * * *")
    mPracticeDriver.fireCheck0and10(args)

    println("* * * * * Print the max value for different integer types. * * * * *")
    mPracticeDriver.firePrintMaxIntegerTypes()

    println("* * * * * Divide two Longs. * * * * *")
    mPracticeDriver.fireDivTwoLongs(500000000000 , 200000000000)

    println("* * * * * Is a char a char. * * * * *")
    mPracticeDriver.fireIsChar('@')

    println("* * * * * Is a char a digit. * * * * *")
    mPracticeDriver.fireIsDigit('1')

    println("* * * Show Enum * * *")
    mWaitDriver.showEnum()

    println("* * * Show Return Label * * *")
    mWaitDriver.showReturnLabel()

    println("* * * Show Inheritance * * *")
    mWaitDriver.showInheritance()

    println("* * * Lateinit and Lazy * * *")
    mWaitDriver.showLateAndLazy()

    println("testing this practice main driver.")
}