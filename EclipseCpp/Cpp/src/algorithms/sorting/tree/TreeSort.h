#ifndef TREESORT_H
#define TREESORT_H
#include <iostream>

/** @desc organize the elements by using tree sort */
/** @analysis O(n*log(n)) or O(n^2) why?
 *      a balanced tree will have a height of log(n) nodes,
 *      an unbalanced tree will have a height of n nodes,
 *      at a minimum we will visit the height of the tree,
 *      traversing the tree we will visit m nodes as we insert,
 *      where m is log(n) nodes or n nodes,
 *      which stimulates a resolution of O(n*log(n)) or O(n^2),
 *      ∴ insert+sort=O(n * (log(n)or(n)) ) */
class TreeSort {
    public:
        TreeSort() = default;
        void treeSort(int data[], int size);

    private:
        struct Node {
            int value;
            Node* left;
            Node* right;
            Node(int val) : value(val), left(nullptr), right(nullptr) {}
        };
        void insert(Node*& root, int value);
        void inOrderTraversal(Node* root);
        void deleteTree(Node* root);
};
#endif // TREESORT_H