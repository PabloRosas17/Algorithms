package `fun`.fizzy.lc.easy

import `fun`.fizzy.`fun`.fizzy.lc.easy.*

/** @desc leet code easy driver is meant for easy questions  */
/**
 * @suppress all functions in the file will be exposed to the client
 * , when a function is used by another function in the implementation
 * , the IDE believes that it should be encapsulated
 * , but by design I am aware of this, I wish to expose consciously
 * , therefore the suppression annotation will be used
 */
@Suppress("MemberVisibilityCanBePrivate")
class LeetCodeEasy {
    val brain = Brains()
    val data = Data()
    val detect = Detector()
    val duplicate = Duplicate()
    val maths = Maths()
    val merger = Merger()
    val numbers = Numbers()
    val reverser = Reverser()
    val strings = Strings()
    val swapper = Swapper()
    val unique = Unique()
}