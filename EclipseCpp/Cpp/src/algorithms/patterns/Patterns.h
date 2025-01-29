#ifndef PATTERNS_H
#define PATTERNS_H

#include <iostream>
#include <vector>
#include <memory>
#include <string>
#include <algorithm>

using std::cout;
using std::endl;

class MaObserver {
public:
    virtual ~MaObserver() = default;
    virtual void update(const std::string& mamsg) = 0;
};

class PatternsDriver : public MaObserver {
public:
    void update(const std::string& mamsg) override;
};

class ObservingObject {
private:
    std::vector<std::shared_ptr<MaObserver>> maListOfObservers;
public:
    void addObserver(const std::shared_ptr<MaObserver>& observer);
    void removeObserver(const std::shared_ptr<MaObserver>& observer);
    void notifyObservers(const std::string& mamsg);
};
#endif // PATTERNS_H