
#include <iostream>
#include "HashTable.h"

int main() {
    HashTable hashTable(5);

    hashTable.insert(1, 100);
    hashTable.insert(6, 200);
    hashTable.insert(11, 300);

    std::cout << "Hash Table after insertion:" << std::endl;
    hashTable.print();

    bool found;
    std::cout << "Search for key 6: ";
    int value = hashTable.search(6, found);
    if (found) {
        std::cout << "Found value " << value << std::endl;
    }
    else {
        std::cout << "Key not found" << std::endl;
    }

    std::cout << "Search for key 3: ";
    value = hashTable.search(3, found);
    if (found) {
        std::cout << "Found value " << value << std::endl;
    }
    else {
        std::cout << "Key not found" << std::endl;
    }

    hashTable.remove(6);
    std::cout << "Hash Table after removing key 6:" << std::endl;
    hashTable.print();

    return 0;
}
