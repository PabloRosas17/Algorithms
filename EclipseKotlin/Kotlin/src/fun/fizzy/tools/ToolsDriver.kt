package `fun`.fizzy.tools

import `fun`.fizzy.tools.bst.BinarySearchTree
import `fun`.fizzy.tools.dat.DirectAddressTable
import `fun`.fizzy.tools.hashtable.HashTable
import `fun`.fizzy.tools.heap.Heap
import `fun`.fizzy.tools.linkedlist.LinkedList
import `fun`.fizzy.tools.queue.Queue
import `fun`.fizzy.tools.set.Set
import `fun`.fizzy.tools.stack.Stack

/** @desc ToolsDriver is meant for practice */
class ToolsDriver {

    /**
     * driver for binary search tree.
     */
    val mBinarySearchTree = BinarySearchTree()

    /**
     * driver for heap.
     */
    val mHeap = Heap(arrayOf(0,0,0,0,0,0,0,0,0,0), MAX_SIZE = 10)

    /**
     * driver for linked list.
     */
    val mLinkedList = LinkedList()

    /**
     * driver for queue.
     */
    val mQueue = Queue(MAX_SIZE = 10)

    /**
     * driver for stack.
     */
    val mStack = Stack(MAX_SIZE = 10)

    /**
     * driver for set.
     */
    val mSet = Set()

    /**
     * driver for dat.
     */
    val mDat = DirectAddressTable()

    /**
     * driver for hashtable.
     */
    val mHashTable = HashTable()
}