package `fun`.fizzy.tools

import `fun`.fizzy.tools.datastructures.binarysearchtree.BinarySearchTree
import `fun`.fizzy.tools.datastructures.directaccesstable.DirectAddressTable
import `fun`.fizzy.tools.datastructures.hashtable.HashTable
import `fun`.fizzy.tools.datastructures.heap.Heap
import `fun`.fizzy.tools.datastructures.linkedlist.LinkedList
import `fun`.fizzy.tools.datastructures.queue.Queue
import `fun`.fizzy.tools.datastructures.set.Set
import `fun`.fizzy.tools.datastructures.stack.Stack

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