
#include "LS.h"
#include <vector>

int main() {
    LinearSearch ls;

    std::vector<int> data = { 3, 5, 7, 9, 11 };
    int keyToFind = 7;

    ls.performSearch(data, keyToFind);
    int missingKey = 4;
    ls.performSearch(data, missingKey);

    return 0;
}
