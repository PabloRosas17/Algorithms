
#include <iostream>
#include "QuickSort.h"

int main() {
    int data[] = { 12, 11, 13, 5, 6, 7 };
    int size = sizeof(data) / sizeof(data[0]);

    QuickSort sorter;
    sorter.quickSort(data, size);

    return 0;
}
