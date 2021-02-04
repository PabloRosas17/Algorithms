package `fun`.fizzy.leetcode

private val mLeetCodeDriver: LeetCodeDriver = LeetCodeDriver()

fun main(args: Array<String>){

    println("* * * * * LeetCode Easy * * * * *")
    mLeetCodeDriver.mLeetCodeEasy.twoSum(intArrayOf(1,2,3), 4)
    mLeetCodeDriver.mLeetCodeEasy.kidsWithCandies(intArrayOf(2,3,5,1,3),3)

    println("* * * * * LeetCode Medium * * * * *")

    println("* * * * * LeetCode Hard * * * * *")
}