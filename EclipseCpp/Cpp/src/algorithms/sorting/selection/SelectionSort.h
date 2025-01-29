#ifndef SELECTIONSORT_H
#define SELECTIONSORT_H
#include <iostream>

 /** @desc organize the elements by using selection sort */
 /** @analysis O(n^2) why?
  *      data contains N nodes as input,
  *      intensive work will be done by visiting all elements by both pointers,
  *      this will stimulate a resolution of N*(M=N) ∴ O(n^2) */
class SelectionSort {
    public:
        SelectionSort() = default;
        void selectionSortAscending(int data[], int size);
        void selectionSortDescending(int data[], int size);

    private:
        void ascending(int data[], int size);
        void descending(int data[], int size);
};

#endif // SELECTIONSORT_H