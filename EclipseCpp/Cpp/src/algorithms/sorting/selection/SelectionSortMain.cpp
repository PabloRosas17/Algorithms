
#include <iostream>
#include "SelectionSort.h"

int main() {
    int data[] = { 64, 25, 12, 22, 11 };
    int size = sizeof(data) / sizeof(data[0]);

    SelectionSort sorter;
    sorter.selectionSortAscending(data, size);
    sorter.selectionSortDescending(data, size);

    return 0;
}