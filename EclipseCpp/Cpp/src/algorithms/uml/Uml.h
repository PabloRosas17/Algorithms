#ifndef UML_H
#define UML_H
#include <iostream>
#include <vector>
#include <memory>
#include <string>

using std::cout;
using std::endl;

// Abstract base class Menu
class Menu {
public:
    virtual ~Menu() = default;  // Virtual destructor for polymorphism
    virtual std::string getMenuName() const = 0;
};

// MenuItem derived from Menu
class MenuItem : public Menu {
private:
    std::string mMenuName;
public:
    MenuItem(const std::string& name);
    std::string getMenuName() const override;
};

// Interface for Order operations
class OrderIf {
public:
    virtual ~OrderIf() = default;
    virtual void addItem(std::shared_ptr<Menu> item) = 0;
    virtual void removeItem(std::shared_ptr<Menu> item) = 0;
    virtual std::vector<std::shared_ptr<Menu>> getOrderItemList() const = 0;
};

// Abstract class Order implementing OrderIf
class Order : public OrderIf {
protected:
    double mTotalPrice;
public:
    Order(double totalPrice = 0.0) : mTotalPrice(totalPrice) {}
    virtual ~Order() = default;
    virtual void addItem(std::shared_ptr<Menu> item) = 0;
    virtual void removeItem(std::shared_ptr<Menu> item) = 0;
    virtual std::vector<std::shared_ptr<Menu>> getOrderItemList() const = 0;
    virtual double getTotalPrice() const;
};


// PhoneOrder derived from Order
class PhoneOrder : public Order {
private:
    std::vector<std::shared_ptr<Menu>> mOrderItemList;
public:
    PhoneOrder();
    void addItem(std::shared_ptr<Menu> item) override;
    void removeItem(std::shared_ptr<Menu> item) override;
    std::vector<std::shared_ptr<Menu>> getOrderItemList() const override;
};

// OrderItem implementing OrderIf
class OrderItem : public OrderIf {
private:
    std::vector<std::shared_ptr<Menu>> mOrderItemList;
public:
    void addItem(std::shared_ptr<Menu> item) override;
    void removeItem(std::shared_ptr<Menu> item) override;
    std::vector<std::shared_ptr<Menu>> getOrderItemList() const override;
};

// UmlDriver responsible for handling orders
class UmlDriver {
private:
    std::vector<std::shared_ptr<Order>> mOrdersList;

public:
    void order();
};

#endif  // UML_H