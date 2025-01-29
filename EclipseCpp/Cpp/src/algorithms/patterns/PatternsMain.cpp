
#include "Patterns.h"

int main() {
    cout << "* * * * * Observer pattern. * * * * *" << endl;
    ObservingObject observingObject;
    auto patternsDriver = std::make_shared<PatternsDriver>();
    observingObject.addObserver(patternsDriver);
    observingObject.notifyObservers("I am a message passed through the observer and will succeed.");
    observingObject.removeObserver(patternsDriver);

    return 0;
}