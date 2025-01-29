
#include <iostream>
#include "HeapSort.h"

int main() {
    int data[] = { 64, 34, 25, 12, 22, 11, 90 };
    int size = sizeof(data) / sizeof(data[0]);

    HeapSort sorter;
    sorter.heapSort(data, size);

    return 0;
}
