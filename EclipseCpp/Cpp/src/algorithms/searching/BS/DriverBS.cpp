/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of binary search.
 */

#include "BS.h"

#include <iostream>
#include <algorithm>

void BinarySearch::performSearch(const std::vector<int>& data, int key) {
    if (!isSorted(data)) {
        std::cout << "Binary search requires the data to be sorted." << std::endl;
        return;
    }
    int index = search(data, key, 0, data.size() - 1);
    if (index == -1) {
        std::cout << "Binary search did not find the data: " << key << "." << std::endl;
    }
    else {
        std::cout << "Binary search found data: " << data[index] << " at index: " << index << "." << std::endl;
    }
}

int BinarySearch::search(const std::vector<int>& data, int key, int start, int end) {
    if (start > end) return -1;
    int middle = start + (end - start) / 2;
    if (key == data[middle]) return middle;
    if (key < data[middle]) return search(data, key, start, middle - 1);
    return search(data, key, middle + 1, end);
}

bool BinarySearch::isSorted(const std::vector<int>& data) {
    return std::is_sorted(data.begin(), data.end());
}
