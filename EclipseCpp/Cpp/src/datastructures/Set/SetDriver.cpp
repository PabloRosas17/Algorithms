/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of set.
 */

#include "Set.h"

Set::Set(size_t size) : elements(size, false) {}

void Set::insert(int value) {
    if (value >= 0 && value < elements.size()) {
        elements[value] = true;
    }
    else {
        std::cerr << "Value out of bounds: " << value << std::endl;
    }
}

void Set::remove(int value) {
    if (value >= 0 && value < elements.size()) {
        elements[value] = false;
    }
    else {
        std::cerr << "Value out of bounds: " << value << std::endl;
    }
}

bool Set::contains(int value) const {
    if (value >= 0 && value < elements.size()) {
        return elements[value];
    }
    else {
        std::cerr << "Value out of bounds: " << value << std::endl;
        return false;
    }
}

void Set::print() const {
    std::cout << "Set elements: ";
    for (size_t i = 0; i < elements.size(); ++i) {
        if (elements[i]) {
            std::cout << i << " ";
        }
    }
    std::cout << std::endl;
}
