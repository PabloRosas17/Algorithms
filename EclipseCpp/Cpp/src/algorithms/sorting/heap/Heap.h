#ifndef HEAP_H
#define HEAP_H
#include <iostream>
#include <vector>

class Heap {
private:
    std::vector<int> heap;
    int max_size;
    void heapify(int index);
    void buildHeap();

public:
    Heap(int max_size);
    void insert(int value);
    void sort();
    void printHeap() const;
};
#endif // HEAP_H