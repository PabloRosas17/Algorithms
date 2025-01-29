
#include <iostream>
#include "TreeSort.h"

int main() {
    int data[] = { 64, 25, 12, 22, 11 };
    int size = sizeof(data) / sizeof(data[0]);

    TreeSort sorter;
    sorter.treeSort(data, size);

    return 0;
}
