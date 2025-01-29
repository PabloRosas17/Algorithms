/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "QuickSort.h"

void QuickSort::quickSort(int data[], int size) {
    quicker(data, 0, size - 1);
    std::cout << "Sorted array: ";
    for (int i = 0; i < size; ++i) {
        std::cout << "[" << i << "]:" << data[i] << " ";
    }
    std::cout << std::endl;
}

void QuickSort::quicker(int data[], int lo, int hi) {
    if (lo < hi) {
        // Divide
        int pv = partition(data, lo, hi);
        // Conquer & Combine left
        quicker(data, lo, pv - 1);
        // Conquer & Combine right
        quicker(data, pv + 1, hi);
    }
}

int QuickSort::partition(int data[], int lo, int hi) {
    // Index of the current smallest element
    int i = lo;
    // Find the smallest element and swap with pivot
    for (int k = lo; k < hi; ++k) {
        if (data[k] < data[hi]) {
            // Swap data[k] and data[i]
            int temp = data[k];
            data[k] = data[i];
            data[i] = temp;
            ++i;
        }
    }
    // Swap the pivot with the smaller element obtained
    int temp = data[hi];
    data[hi] = data[i];
    data[i] = temp;
    return i;
}
