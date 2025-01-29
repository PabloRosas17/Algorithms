#ifndef BUBBLESORT_H
#define BUBBLESORT_H
#include <iostream>

/** @desc organize the elements by using bubble sort */
/** @analysis O(n^2) why?
 *      data contains N nodes as input,
 *      intensive work will be done by iterating over N nodes M nodes,
 *      where M=N as input and M⊆N, as an inner product,
 *      which does the sort and swap until end of M ∀ N */
class BubbleSort {
public:
    BubbleSort() = default;
    void bubbleSort(int data[], int size);
};

#endif // BUBBLESORT_H