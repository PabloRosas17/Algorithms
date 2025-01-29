/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "SelectionSort.h"

void SelectionSort::selectionSortAscending(int data[], int size) {
    ascending(data, size);
    std::cout << "Sorted in Ascending Order: ";
    for (int i = 0; i < size; ++i) {
        std::cout << data[i] << " ";
    }
    std::cout << std::endl;
}

void SelectionSort::selectionSortDescending(int data[], int size) {
    descending(data, size);
    std::cout << "Sorted in Descending Order: ";
    for (int i = 0; i < size; ++i) {
        std::cout << data[i] << " ";
    }
    std::cout << std::endl;
}

void SelectionSort::ascending(int data[], int size) {
    for (int i = 0; i < size - 1; ++i) {
        int min = i;
        for (int j = i + 1; j < size; ++j) {
            if (data[j] < data[min]) {
                min = j;
            }
        }
        // Swap data[i] with data[min]
        int temp = data[i];
        data[i] = data[min];
        data[min] = temp;
    }
}

void SelectionSort::descending(int data[], int size) {
    for (int i = 0; i < size - 1; ++i) {
        int min = i;
        for (int j = i + 1; j < size; ++j) {
            if (data[j] > data[min]) {
                min = j;
            }
        }
        // Swap data[i] with data[min]
        int temp = data[i];
        data[i] = data[min];
        data[min] = temp;
    }
}
