
#include <iostream>
#include "Table.h"

int main() {
    Table table(10);

    table.insert(0, 100);
    table.insert(3, 300);
    table.insert(7, 700);

    std::cout << "Value at key 3: " << table.search(3) << std::endl;
    std::cout << "Value at key 5: " << table.search(5) << std::endl;

    table.remove(3);
    std::cout << "Value at key 3 after removal: " << table.search(3) << std::endl;

    return 0;
}
