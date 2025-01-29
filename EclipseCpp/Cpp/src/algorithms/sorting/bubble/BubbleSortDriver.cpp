/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "BubbleSort.h"

void BubbleSort::bubbleSort(int data[], int size) {
    for (int i = size - 1; i >= 0; --i) {
        for (int j = 0; j < i; ++j) {
            if (data[j] > data[j + 1]) {
                // Swap data[j] and data[j+1]
                int temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }
        }
    }

    for (int i = 0; i < size; ++i) {
        std::cout << "-" << data[i] << " ";
    }
    std::cout << std::endl;
}
