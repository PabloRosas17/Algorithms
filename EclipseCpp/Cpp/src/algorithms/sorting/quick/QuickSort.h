#ifndef QUICKSORT_H
#define QUICKSORT_H
#include <iostream>

/** @desc organize the elements by using quick sort */
/** @analysis O(n^2) why? pivot
 *      data contains N nodes as input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as sorts on N/2 nodes until pivot is met
 *      combine by swapping elements inn the "sub-array"
 *      when the pivot is chosen poorly, such that, partition into two containers,
 *      one of size 1 and the other of size n-1, recursion depth will be n, which leads to n^2 */
class QuickSort {
    public:
        QuickSort() = default;
        void quickSort(int data[], int size);

    private:
        int partition(int data[], int lo, int hi);
        void quicker(int data[], int lo, int hi);
};

#endif // QUICKSORT_H