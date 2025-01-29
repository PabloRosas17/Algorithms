
#include <iostream>
#include "MergeSort.h"

int main() {
    int data[] = { 12, 11, 13, 5, 6, 7 };
    int size = sizeof(data) / sizeof(data[0]);

    MergeSort sorter;
    sorter.mergeSort(data, size);

    return 0;
}