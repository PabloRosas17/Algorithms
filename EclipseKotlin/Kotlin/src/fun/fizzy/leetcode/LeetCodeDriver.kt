package `fun`.fizzy.leetcode

import `fun`.fizzy.leetcode.easy.LeetCodeEasy
import `fun`.fizzy.leetcode.hard.LeetCodeHard
import `fun`.fizzy.leetcode.medium.LeetCodeMedium
import `fun`.fizzy.patterns.MaObserver

/** @desc leetcode driver is meant for solving varying level of difficulty problems */
class LeetCodeDriver {

    /**
     * driver for easy problems.
     */
    val mLeetCodeEasy = LeetCodeEasy()

    /**
     * driver for medium problems.
     */
    val mLeetCodeMedium = LeetCodeMedium()

    /**
     * driver for hard problems.
     */
    val mLeetCodeHard = LeetCodeHard()
}