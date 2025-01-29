
#include <iostream>
#include "InsertionSort.h"

int main() {
    int data[] = { 64, 34, 25, 12, 22, 11, 90 };
    int size = sizeof(data) / sizeof(data[0]);

    InsertionSort sorter;
    sorter.insertionSort(data, size);

    return 0;
}
