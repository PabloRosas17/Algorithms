#ifndef MERGESORT_H
#define MERGESORT_H
#include <iostream>

/** @desc organize the elements by using merge sort */
/** @analysis O(n*log(n)) why? sub-storage
 *      data contains N nodes as input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as sorts on N/2 nodes until key
 *      combine by creating storage T
 *          , placing elements by swapping and sorting on N nodes
 *          , and gluing the result into the original data */
class MergeSort {
    public:
        MergeSort() = default;
        void mergeSort(int data[], int size);

    private:
        void merge(int data[], int start, int middle, int end);
        void mergeHelper(int data[], int start, int end);
};

#endif // MERGESORT_H