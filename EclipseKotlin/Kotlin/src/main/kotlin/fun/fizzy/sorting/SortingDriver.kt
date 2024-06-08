package `fun`.fizzy.sorting

import `fun`.fizzy.sorting.bubble.BubbleSort
import `fun`.fizzy.sorting.heap.HeapSort
import `fun`.fizzy.sorting.insertion.InsertionSort
import `fun`.fizzy.sorting.merge.MergeSort
import `fun`.fizzy.sorting.quick.QuickSort
import `fun`.fizzy.sorting.selection.SelectionSort
import `fun`.fizzy.sorting.tree.TreeSort

/** @desc sorting driver is meant for exploring on sorting algorithms
 * , bubble sort, insertion sort, selection sort, quick sort, merge sort, heap sort, tree sort */
class SortingDriver {

    /**
     * driver for bubble sort.
     */
    val mBubbleSort = BubbleSort()

    /**
     * driver for insertion sort.
     */
    val mInsertionSort = InsertionSort()

    /**
     * driver for selection sort.
     */
    val mSelectionSort = SelectionSort()

    /**
     * driver for selection sort.
     */
    val mQuickSort = QuickSort()

    /**
     * driver for merge sort.
     */
    val mMergeSort = MergeSort()

    /**
     * driver for heap sort.
     */
    val mHeapSort = HeapSort()

    /**
     * driver for selection sort.
     */
    val mTreeSort = TreeSort()
}