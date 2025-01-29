
#include <iostream>
#include "Set.h"

int main() {
    Set mySet(10);

    mySet.insert(3);
    mySet.insert(5);
    mySet.insert(7);

    std::cout << "Contains 3? " << (mySet.contains(3) ? "Yes" : "No") << std::endl;
    std::cout << "Contains 4? " << (mySet.contains(4) ? "Yes" : "No") << std::endl;

    mySet.print();

    mySet.remove(5);
    mySet.print();

    return 0;
}
