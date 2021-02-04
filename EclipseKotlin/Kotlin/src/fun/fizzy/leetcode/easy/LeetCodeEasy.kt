package `fun`.fizzy.leetcode.easy

/** @desc leet code easy driver is meant for easy questions  */
class LeetCodeEasy {

    /**
     * @problem Given an array of integers return indices of the two numbers
     *  such that they add up to a specific target.
     * @assumption You may assume that each input would have exactly one solution
     *  , and you may not use the same element twice.
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val bucket = arrayListOf<Int>()
        val copy = nums.copyOf()
        nums.forEachIndexed { i, n ->
            copy.forEachIndexed { j, e ->
                if( i != j && (n + e) == target ){
                    bucket.add(n) //i index contains n
                    bucket.add(e) //j index contains e
                    return bucket.toIntArray()
                }
            }
        }
        return bucket.toIntArray() // no two elements sum to the target
    }

    /**
     * @problem Given the array candies and the integer extraCandies
     *  , where candies[ i ] represents the number of candies that the ith kid has.
     *  For each kid check if there is a way to distribute extraCandies among the
     *  kids such that he or she can have the greatest number of candies among them.
     *  Notice that multiple kids can have the greatest number of candies.
     *  @constraints
     *   2 <= candies.length <= 100
     *   1 <= candies[ i ] <= 100
     *   1 <= extraCandies <= 50
     */
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val bucket = arrayListOf<Boolean>()
        var biggest = 0
        candies.forEachIndexed { i, n ->
            if(biggest < n){
                biggest = n
            }
        }
        candies.forEachIndexed { j, e ->
            if( (extraCandies + e) >= biggest){
                bucket.add(true)
            } else {
                bucket.add(false)
            }
        }
        println(bucket)
        return bucket.toBooleanArray()
    }


}