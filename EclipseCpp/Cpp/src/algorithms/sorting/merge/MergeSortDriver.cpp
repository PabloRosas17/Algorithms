/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "MergeSort.h"

void MergeSort::mergeSort(int data[], int size) {
    mergeHelper(data, 0, size - 1);
    std::cout << "Sorted array: ";
    for (int i = 0; i < size; ++i) {
        std::cout << "[" << i << "]:" << data[i] << " ";
    }
    std::cout << std::endl;
}

void MergeSort::mergeHelper(int data[], int start, int end) {
    if (start < end) {
        // Divide
        int middle = (start + end) / 2;
        // Conquer (Recursively sort both halves)
        mergeHelper(data, start, middle);
        mergeHelper(data, middle + 1, end);
        // Combine (Merge the two sorted halves)
        merge(data, start, middle, end);
    }
}

void MergeSort::merge(int data[], int start, int middle, int end) {
    int sizeL = middle - start + 1;
    int sizeR = end - middle;
    int* tempL = new int[sizeL];
    int* tempR = new int[sizeR];

    // Copy data into temporary sub-arrays
    for (int i = 0; i < sizeL; ++i) {
        tempL[i] = data[start + i];
    }
    for (int i = 0; i < sizeR; ++i) {
        tempR[i] = data[middle + 1 + i];
    }

    // Merge the sub-arrays back into the original array
    int i = 0, j = 0, k = start;
    while (i < sizeL && j < sizeR) {
        if (tempL[i] <= tempR[j]) {
            data[k++] = tempL[i++];
        }
        else {
            data[k++] = tempR[j++];
        }
    }

    // Copy remaining elements of tempL if any
    while (i < sizeL) {
        data[k++] = tempL[i++];
    }

    // Copy remaining elements of tempR if any
    while (j < sizeR) {
        data[k++] = tempR[j++];
    }

    // Clean up dynamic memory
    delete[] tempL;
    delete[] tempR;
}
