#ifndef SET_H
#define SET_H

#include <vector>
#include <iostream>

class Set {
private:
    std::vector<bool> elements;
public:
    Set(size_t size);
    void insert(int value);
    void remove(int value);
    bool contains(int value) const;
    void print() const;
};

#endif // SET_H