/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of hash table.
 */

#include "HashTable.h"

HashTable::HashTable(size_t buckets) : bucketCount(buckets), table(buckets) {}

size_t HashTable::hashFunction(int key) const {
    return key % bucketCount;
}

void HashTable::insert(int key, int value) {
    size_t bucketIndex = hashFunction(key);
    for (auto& pair : table[bucketIndex]) {
        if (pair.first == key) {
            pair.second = value;
            return;
        }
    }
    table[bucketIndex].emplace_back(key, value);
}

void HashTable::remove(int key) {
    size_t bucketIndex = hashFunction(key);
    auto& bucket = table[bucketIndex];
    for (auto it = bucket.begin(); it != bucket.end(); ++it) {
        if (it->first == key) {
            bucket.erase(it);
            return;
        }
    }
}

int HashTable::search(int key, bool& found) const {
    size_t bucketIndex = hashFunction(key);
    const auto& bucket = table[bucketIndex];
    for (const auto& pair : bucket) {
        if (pair.first == key) {
            found = true;
            return pair.second;
        }
    }
    found = false;
    return -1;
}

void HashTable::print() const {
    for (size_t i = 0; i < table.size(); ++i) {
        std::cout << "Bucket " << i << ": ";
        for (const auto& pair : table[i]) {
            std::cout << "[" << pair.first << ": " << pair.second << "] ";
        }
        std::cout << std::endl;
    }
}
