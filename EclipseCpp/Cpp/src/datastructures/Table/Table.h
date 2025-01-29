#ifndef TABLE_H
#define TABLE_H

#include <vector>
#include <utility>
#include <iostream>

class Table {
private:
    std::vector<std::pair<int, int>> data;
public:
    Table(size_t size);
    void insert(int key, int value);
    void remove(int key);
    int search(int key) const;
};
#endif // TABLE_H