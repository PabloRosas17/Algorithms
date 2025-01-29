/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of direct access table.
 */

#include "DirectAddressTable.h"
#include <sstream>

Table::Table(int k, int v) : key(k), value(v) {}

DirectAddressTable::DirectAddressTable(int size) : table(size, nullptr) {}

void DirectAddressTable::validateKey(int key) const {
    if (key < 0 || key >= table.size()) {
        std::ostringstream oss;
        oss << "Key " << key << " is out of bounds.";
        throw std::out_of_range(oss.str());
    }
}

int DirectAddressTable::search(int key) const {
    validateKey(key);
    return table[key] ? table[key]->key : -1;
}

void DirectAddressTable::insert(const Table& entry) {
    validateKey(entry.key);
    table[entry.key] = std::make_shared<Table>(entry);
}

void DirectAddressTable::remove(int key) {
    validateKey(key);
    table[key] = nullptr;
}
