package `fun`.fizzy.tools.datastructures.binarysearchtree

/**
 * @desc defines a node for the binary tree
 * @param left as a null pointer BinaryTreeNode
 * @param right as a null pointer BinaryTreeNode
 * @param data as a null data Int
 */
data class BinarySearchTreeNode(
    var left: BinarySearchTreeNode? = null
    , var right: BinarySearchTreeNode? = null
    , var data: Int? = null
)
