#ifndef BS_H
#define BS_H
#include <vector>

/** @desc find data in an array using binary search */
/** @analysis O(log(n)) why?
 *      data contains N nodes as the input,
 *      divide by splitting the left and right
 *      conquer by intensive recursive work as searches on N/2 nodes until key */
class BinarySearch {
public:
    void performSearch(const std::vector<int>& data, int key);

private:
    int search(const std::vector<int>& data, int key, int start, int end);
    bool isSorted(const std::vector<int>& data);
};
#endif // BS_H