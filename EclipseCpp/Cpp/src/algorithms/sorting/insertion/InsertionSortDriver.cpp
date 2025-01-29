/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "InsertionSort.h"

void InsertionSort::insertionSort(int data[], int size) {
    int temp, j;

    // Loop through all elements of the array
    // Store the current element
    // Start comparing with the previous element
    for (int i = 0; i < size; ++i) {
        temp = data[i];
        j = i - 1;

        // Move elements of data[0..i-1] that are greater than temp
        // to one position ahead of their current position
        while (j >= 0 && data[j] > temp) {
            data[j + 1] = data[j];
            --j;
        }

        data[j + 1] = temp; // Place temp at its correct position
    }

    std::cout << "Sorted array: ";
    for (int i = 0; i < size; ++i) {
        std::cout << data[i] << " ";
    }
    std::cout << std::endl;
}
