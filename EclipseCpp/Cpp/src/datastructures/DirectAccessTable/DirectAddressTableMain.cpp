
#include "DirectAddressTable.h"

int main() {
    try {
        DirectAddressTable table(5);

        Table entry1(2, 42);
        Table entry2(4, 99);

        table.insert(entry1);
        table.insert(entry2);

        std::cout << "Search key 2: " << table.search(2) << std::endl;
        std::cout << "Search key 4: " << table.search(4) << std::endl;

        table.remove(2);
        std::cout << "Search key 2 after remove: " << table.search(2) << std::endl;
    }
    catch (const std::exception& e) {
        std::cerr << "Error: " << e.what() << std::endl;
    }

    return 0;
}
