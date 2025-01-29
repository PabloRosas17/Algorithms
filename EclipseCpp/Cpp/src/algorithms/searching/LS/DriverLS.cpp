/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "LS.h"

void LinearSearch::performSearch(const std::vector<int>& data, int key) {
    searchIteratively(data, key);
    searchRecursively(data, key);
}

void LinearSearch::searchIteratively(const std::vector<int>& data, int key) {
    bool found = false;
    for (size_t i = 0; i < data.size(); ++i) {
        if (data[i] == key) {
            std::cout << key << " is found at index " << i << std::endl;
            found = true;
            break;
        }
    }
    if (!found) {
        std::cout << key << " is not found" << std::endl;
    }
}

void LinearSearch::searchRecursively(const std::vector<int>& data, int key) {
    int index = recurse(data, key, 0, data.size() - 1);
    if (index != -1 && data[index] == key) {
        std::cout << key << " is found at index " << index << std::endl;
    }
    else {
        std::cout << key << " is not found" << std::endl;
    }
}

int LinearSearch::recurse(const std::vector<int>& data, int key, int left, int right) {
    if (left > right) return -1;
    if (data[left] == key) return left;
    return recurse(data, key, left + 1, right);
}
