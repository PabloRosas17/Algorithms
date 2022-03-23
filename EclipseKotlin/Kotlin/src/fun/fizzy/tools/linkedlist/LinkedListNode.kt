package `fun`.fizzy.tools.linkedlist

/**
 * @desc defines a node for the linked list
 * @param next as a null pointer LinkedListNode
 * @param data as a null data Int
 */
data class LinkedListNode(
    var next: LinkedListNode? = null
    , var data: Int
)