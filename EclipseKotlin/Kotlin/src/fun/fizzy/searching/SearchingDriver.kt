package `fun`.fizzy.searching

import `fun`.fizzy.searching.BFS.BFS
import `fun`.fizzy.searching.BS.BS
import `fun`.fizzy.searching.DFS.DFS
import `fun`.fizzy.searching.LS.LS

/** @desc searching driver is meant for exploring on searching algorithms
 * , linear search, binary search, depth first search, breadth first search */
class SearchingDriver {

    /**
     * driver for linear search.
     */
    val mLS = LS()

    /**
     * driver for binary search.
     */
    val mBS = BS()

    /**
     * driver for depth first search.
     */
    val mDFS = DFS()
    /**
     * driver for breath first search.
     */
    val mBFS = BFS()
}