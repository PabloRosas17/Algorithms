#ifndef HASHTABLE_H
#define HASHTABLE_H

#include <vector>
#include <list>
#include <utility>
#include <iostream>

class HashTable {
private:
    std::vector<std::list<std::pair<int, int>>> table;
    size_t bucketCount;
    size_t hashFunction(int key) const;
public:
    HashTable(size_t buckets);
    void insert(int key, int value);
    void remove(int key);
    int search(int key, bool& found) const;
    void print() const;
};

#endif // HASHTABLE_H
