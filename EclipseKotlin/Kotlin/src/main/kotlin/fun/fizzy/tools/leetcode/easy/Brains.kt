package `fun`.fizzy.tools.leetcode.easy

class Brains {

    /**
     * @problems brain fun. when n is divisible by key then add an element to a list
     * @constraints 1 <= n <= math.pow(10,4)
     * @analysis O(n) where n is the value of the input n
     * @tag leetcode official problem
     */
    fun fireFizzBuzz(n: Int): List<String> {
        arrayListOf<String>().run {
            (1..n).forEach { it ->
                if ((it % 5) == 0 && (it % 3) == 0) {
                    this.add("FizzBuzz")
                } else if ((it % 5) == 0) {
                    this.add("Buzz")
                } else if ((it % 3) == 0) {
                    this.add("Fizz")
                } else {
                    this.add(it.toString())
                }
            }
            return this
        }
    }

    /**
     * @problem brain fun. Given the array candies and the integer extraCandies
     *  , where candies[ i ] represents the number of candies that the ith kid has.
     *  For each kid check if there is a way to distribute extraCandies among the
     *  kids such that he or she can have the greatest number of candies among them.
     *  Notice that multiple kids can have the greatest number of candies.
     * @constraints
     *  2 <= candies.length <= 100
     *  1 <= candies[ i ] <= 100
     *  1 <= extraCandies <= 50
     * @analysis O(n) where n is the size of the int array
     * @tag leetcode official problem
     */
    fun fireKidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val bucket = arrayListOf<Boolean>()
        var biggest = 0
        candies.forEachIndexed { _, n ->
            if(biggest < n){
                biggest = n
            }
        }
        candies.forEachIndexed { _, e ->
            if( (extraCandies + e) >= biggest){
                bucket.add(true)
            } else {
                bucket.add(false)
            }
        }
        return bucket
    }
}