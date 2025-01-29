
#include "BS.h"

int main() {
    BinarySearch bs;

    std::vector<int> sortedData = { 1, 3, 5, 7, 9, 11, 13 };
    int keyToFind = 7;

    // Test with sorted data
    bs.performSearch(sortedData, keyToFind);

    // Test with unsorted data
    std::vector<int> unsortedData = { 3, 1, 4, 2 };
    bs.performSearch(unsortedData, 4);

    return 0;
}
