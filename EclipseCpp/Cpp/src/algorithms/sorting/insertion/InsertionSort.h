#ifndef INSERTIONSORT_H
#define INSERTIONSORT_H
#include <iostream>

/** @desc organize the elements by using insertion sort */
/** @analysis O(n^2) why?
 *      data contains N nodes as input,
 *      intensive work will be done by iterating over N nodes and M nodes,
 *      where M=N as input and M∈N, as an inner product,
 *      which does the sort and swap until end of M ∀ N */
class InsertionSort {
    public:
        InsertionSort() = default;
        void insertionSort(int data[], int size);
};
#endif // INSERTIONSORT_H