/* @author: pablorosas17
 * @date: 01/25/2025
 * @purpose: implementation of linear search.
 */

#include "TreeSort.h"

void TreeSort::treeSort(int data[], int size) {
    Node* root = nullptr;

    for (int i = 0; i < size; ++i) {
        insert(root, data[i]);
    }

    std::cout << "Sorted Order: ";
    inOrderTraversal(root);
    std::cout << std::endl;

    deleteTree(root);
}

void TreeSort::insert(Node*& root, int value) {
    if (root == nullptr) {
        root = new Node(value);
    }
    else if (value < root->value) {
        insert(root->left, value);
    }
    else {
        insert(root->right, value);
    }
}

void TreeSort::inOrderTraversal(Node* root) {
    if (root == nullptr) {
        return;
    }
    inOrderTraversal(root->left);       // Visit left subtree
    std::cout << root->value << " ";    // Print node value
    inOrderTraversal(root->right);      // Visit right subtree
}

void TreeSort::deleteTree(Node* root) {
    if (root == nullptr) {
        return;
    }
    deleteTree(root->left);  // Delete left subtree
    deleteTree(root->right); // Delete right subtree
    delete root;             // Delete current node
}
