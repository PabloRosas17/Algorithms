/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "HeapSort.h"

void HeapSort::heapSort(int data[], int size) {
    Heap heap(size);

    for (int i = 0; i < size; ++i) {
        heap.insert(data[i]);
    }

    heap.sort();
}
