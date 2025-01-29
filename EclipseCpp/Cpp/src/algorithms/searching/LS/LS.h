#ifndef LS_H
#define LS_H
#include <iostream>
#include <vector>

/** @desc find data in an array using linear search */
/** @analysis O(n) why?
 *      data contains N nodes as the input,
 *      intensive work will be done by having to visit N nodes until key */
class LinearSearch {
public:
    void performSearch(const std::vector<int>& data, int key);

private:
    void searchIteratively(const std::vector<int>& data, int key);
    void searchRecursively(const std::vector<int>& data, int key);
    int recurse(const std::vector<int>& data, int key, int left, int right);
};

#endif // LS_H
