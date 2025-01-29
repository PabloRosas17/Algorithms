#ifndef DIRECT_ADDRESS_TABLE_H
#define DIRECT_ADDRESS_TABLE_H

#include <iostream>
#include <vector>
#include <memory>
#include <stdexcept>

struct Table {
    int key;
    int value;

    Table(int k, int v);
};

class DirectAddressTable {
private:
    std::vector<std::shared_ptr<Table>> table;
    void validateKey(int key) const;

public:
    explicit DirectAddressTable(int size);
    int search(int key) const;
    void insert(const Table& entry);
    void remove(int key);
};

#endif // DIRECT_ADDRESS_TABLE_H