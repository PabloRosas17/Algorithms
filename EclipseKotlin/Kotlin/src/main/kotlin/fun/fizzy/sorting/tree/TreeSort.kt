package `fun`.fizzy.sorting.tree

import `fun`.fizzy.tools.datastructures.binarysearchtree.BinarySearchTree

@Suppress("FunctionName")

/** @desc organize the elements by using tree sort */
/** @analysis O(n*log(n)) or O(n^2) why?
 *      a balanced tree will have a height of log(n) nodes,
 *      an unbalanced tree will have a height of n nodes,
 *      at a minimum we will visit the height of the tree,
 *      traversing the tree we will visit m nodes as we insert,
 *      where m is log(n) nodes or n nodes,
 *      which stimulates a resolution of O(n*log(n)) or O(n^2),
 *      ∴ insert+sort=O(n * (log(n)or(n)) ) */
class TreeSort {

    fun TreeSort(data: Array<Int>){
        val bst: BinarySearchTree = BinarySearchTree()
        for(i in data.indices){ bst.insert(data[i]) }
        bst.sort()
    }
}