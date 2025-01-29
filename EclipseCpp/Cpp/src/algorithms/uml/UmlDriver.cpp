#include "Uml.h"
#include <algorithm>

// MenuItem constructor
MenuItem::MenuItem(const std::string& name) : mMenuName(name) {}

// MenuItem getter
std::string MenuItem::getMenuName() const {
    return mMenuName;
}

// Order's getTotalPrice
double Order::getTotalPrice() const {
    return mTotalPrice;
}

// PhoneOrder constructor
PhoneOrder::PhoneOrder() : Order(0.0) {}

// PhoneOrder methods
void PhoneOrder::addItem(std::shared_ptr<Menu> item) {
    mOrderItemList.push_back(item);
}

void PhoneOrder::removeItem(std::shared_ptr<Menu> item) {
    mOrderItemList.erase(
        std::remove(mOrderItemList.begin(), mOrderItemList.end(), item),
        mOrderItemList.end()
    );
}

std::vector<std::shared_ptr<Menu>> PhoneOrder::getOrderItemList() const {
    return mOrderItemList;
}

// OrderItem methods
void OrderItem::addItem(std::shared_ptr<Menu> item) {
    mOrderItemList.push_back(item);
}

void OrderItem::removeItem(std::shared_ptr<Menu> item) {
    mOrderItemList.erase(
        std::remove(mOrderItemList.begin(), mOrderItemList.end(), item),
        mOrderItemList.end()
    );
}

std::vector<std::shared_ptr<Menu>> OrderItem::getOrderItemList() const {
    return mOrderItemList;
}

// UmlDriver's order method
void UmlDriver::order() {
    for (int i = 0; i < 3; ++i) {
        auto order = std::make_shared<PhoneOrder>();
        auto menuItem = std::make_shared<MenuItem>("MenuItem#" + std::to_string(i));
        order->addItem(menuItem);
        mOrdersList.push_back(order);
    }

    // Iterate through orders and print items
    for (const auto& order : mOrdersList) {
        for (const auto& item : order->getOrderItemList()) {
            std::cout << "Item: " << item->getMenuName() << std::endl;
        }
    }
}
