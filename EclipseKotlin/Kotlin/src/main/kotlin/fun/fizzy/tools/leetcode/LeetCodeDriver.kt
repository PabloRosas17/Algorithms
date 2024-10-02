package `fun`.fizzy.tools.leetcode

import `fun`.fizzy.tools.leetcode.easy.LeetCodeEasy
import `fun`.fizzy.tools.leetcode.hard.LeetCodeHard
import `fun`.fizzy.tools.leetcode.medium.LeetCodeMedium

/** @desc leetcode driver is meant for solving varying level of difficulty problems */
class LeetCodeDriver {
    val lce = LeetCodeEasy()
    val lcm = LeetCodeMedium()
    val lch = LeetCodeHard()
}

/***
 * things that got asked during interviews
 *     //transpose a matrix
 *     //reverse a sentence
 *     //string palindrome
 *     //find duplicates in an array
 */