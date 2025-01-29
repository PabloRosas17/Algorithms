/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: implementation of binarysearchtree data structure.
 */

#include "BinarySearchTree.h"

bool BinarySearchTree::empty() const{
	return root == nullptr;
}

void BinarySearchTree::add(int key) {
	root = addNode(root, key);
}

void BinarySearchTree::remove(int key) {
	root = removeNode(root, key);
}

void BinarySearchTree::clear() {
	clearNode(root);
	root = nullptr;
	size = 0;
}

void BinarySearchTree::show() const {
	showNode(root);
}

void BinarySearchTree::min() const {
	BinarySearchTreeNode* current = root;
	while (current && current->left != nullptr) {
		current = current->left;
	}
	if (current == nullptr) {
		return;
	}
	cout << "min : " << current->data << endl;
}

void BinarySearchTree::max() const {
	BinarySearchTreeNode* current = root;
	while (current && current->right != nullptr) {
		current = current->right;
	}
	if (current == nullptr) {
		return;
	}
	cout << "max : " << current->data << endl;
}

BinarySearchTreeNode* BinarySearchTree::addNode(BinarySearchTreeNode *node, int key) {
	if (node == nullptr) {
		size++;
		return new BinarySearchTreeNode(key);
	}
	else if (node->data < key) {
		node->right = addNode(node->right, key);
	}
	else { //root->data >= key
		node->left = addNode(node->left, key);
	}
	return node;
}

BinarySearchTreeNode* BinarySearchTree::removeNode(BinarySearchTreeNode *node, int key) {
	if (node == nullptr) {
		return node;
	}
	else if (node->data < key) {
		node->right = removeNode(node->right, key);
	}
	else if (root->data > key) {
		node->left = removeNode(node->left, key);
	}
	else {
		if (node->left == nullptr) {
			BinarySearchTreeNode *temp = node->right;
			delete node;
			return temp;
		}
		else if (node->right == nullptr) {
			BinarySearchTreeNode *temp = node->left;
			delete node;
			return temp;
		}
		const BinarySearchTreeNode *temp = minNode(node->right);
		node->data = temp->data;
		node->right = removeNode(node->right, temp->data);
	}
	return node;
}

void BinarySearchTree::clearNode(BinarySearchTreeNode *node) {
	if (node == nullptr) {
		return;
	}
	clearNode(node->left);
	clearNode(node->right);
	delete node;
}

void BinarySearchTree::showNode(BinarySearchTreeNode *node) const {
	if (node != nullptr) {
		showNode(node->left);
		cout << " - " << node->data << " - ";
		showNode(node->right);
	}
}

BinarySearchTreeNode* BinarySearchTree::minNode(BinarySearchTreeNode *node) const {
	BinarySearchTreeNode* current = node;

	while (current && current->left != nullptr) {
		current = current->left;
	}

	return current;
}

BinarySearchTreeNode* BinarySearchTree::maxNode(BinarySearchTreeNode *node) const {
	BinarySearchTreeNode* current = node;

	while (current && current->right != nullptr) {
		current = current->right;
	}

	return current;
}
