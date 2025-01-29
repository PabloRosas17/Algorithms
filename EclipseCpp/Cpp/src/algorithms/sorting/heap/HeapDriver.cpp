/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "Heap.h"

Heap::Heap(int max_size) : max_size(max_size) {
    heap.push_back(0); // heap[0] is unused for convenience (1-based index)
}

void Heap::insert(int value) {
    if (heap.size() - 1 < max_size) {
        heap.push_back(value);
        int current = heap.size() - 1;

        // Heapify up
        while (current > 1 && heap[current] > heap[current / 2]) {
            std::swap(heap[current], heap[current / 2]);
            current = current / 2;
        }
    }
    else {
        std::cout << "Heap is full, cannot insert " << value << std::endl;
    }
}

void Heap::heapify(int index) {
    int left = 2 * index;
    int right = 2 * index + 1;
    int largest = index;

    if (left < heap.size() && heap[left] > heap[largest]) {
        largest = left;
    }
    if (right < heap.size() && heap[right] > heap[largest]) {
        largest = right;
    }
    if (largest != index) {
        std::swap(heap[index], heap[largest]);
        heapify(largest);
    }
}

void Heap::buildHeap() {
    for (int i = heap.size() / 2; i >= 1; --i) {
        heapify(i);
    }
}

void Heap::sort() {
    buildHeap();
    for (int i = heap.size() - 1; i > 1; --i) {
        std::swap(heap[1], heap[i]);
        heapify(1);
    }

    std::cout << "Sorted array: ";
    for (int i = 1; i < heap.size(); ++i) {
        std::cout << heap[i] << " ";
    }
    std::cout << std::endl;
}

void Heap::printHeap() const {
    for (int i = 1; i < heap.size(); ++i) {
        std::cout << heap[i] << " ";
    }
    std::cout << std::endl;
}
