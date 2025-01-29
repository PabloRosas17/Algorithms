/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of patterns.
 */

#include "Patterns.h"

void PatternsDriver::update(const std::string& mamsg) {
    std::cout << mamsg << std::endl;
}

void ObservingObject::addObserver(const std::shared_ptr<MaObserver>& observer) {
    maListOfObservers.push_back(observer);
}

void ObservingObject::removeObserver(const std::shared_ptr<MaObserver>& observer) {
    maListOfObservers.erase(
        std::remove(maListOfObservers.begin(), maListOfObservers.end(), observer),
        maListOfObservers.end()
    );
}

void ObservingObject::notifyObservers(const std::string& mamsg) {
    for (const auto& observer : maListOfObservers) {
        observer->update(mamsg);
    }
}
