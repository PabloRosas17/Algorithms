/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of table.
 */

#include "Table.h"

Table::Table(size_t size) : data(size, { -1, -1 }) {}

void Table::insert(int key, int value) {
    if (key >= 0 && key < data.size()) {
        data[key] = { key, value };
    }
    else {
        std::cerr << "Key out of bounds: " << key << std::endl;
    }
}

void Table::remove(int key) {
    if (key >= 0 && key < data.size()) {
        data[key] = { -1, -1 };
    }
    else {
        std::cerr << "Key out of bounds: " << key << std::endl;
    }
}

int Table::search(int key) const {
    if (key >= 0 && key < data.size() && data[key].first != -1) {
        return data[key].second;
    }
    return -1;
}
