#ifndef HEAPSORT_H
#define HEAPSORT_H
#include "Heap.h"

/** @desc organize the elements by using heap sort */
/** @analysis O(n*log(n)) why?
 *      data contains N nodes as input,
 *      heapsort insert operation does log(n) work to insert data,
 *      heapsort sort operation does n*log(n) work to sort data,
 *      specifically, build takes O(n) work and heapify takes O(log(n)) work,
 *      which n*log(n) dominates log(n) ∴ n*log(n) */
class HeapSort {
public:
    HeapSort() = default;
    void heapSort(int data[], int size);
};
#endif // HEAPSORT_H