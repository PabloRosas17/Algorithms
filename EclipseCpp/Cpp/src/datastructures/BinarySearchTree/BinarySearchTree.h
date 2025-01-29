/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: binarysearchtree data structure.
 *
 * @name: BinarySearchTree()
 * @description: constructor
 * @return: BinarySearchTree
 *
 * @name: ~BinarySearchTree()
 * @description: destructor
 * @return: ~BinarySearchTree
 *
 * @name: empty()
 * @description: is the tree empty.
 * @return: bool
 *
 * @name: addNode(int data)
 * @param: data as the element to be added.
 * @description: adds a node to the BinarySearchTree.
 * @return: void
 *
 * @name: removeNode(int data)
 * @param: data as the element to be removed.
 * @description: removes a node to the BinarySearchTree.
 * @return: void
 *
 * @name: clear()
 * @description: removes all nodes from the BinarySearchTree.
 * @return: void
 *
 * @name: show()
 * @description: display all the elements.
 * @return: void
 *
 */

#include <iostream>

#include "BinarySearchTreeNode.h"

using std::cout;
using std::endl;

class BinarySearchTree {
	public:
		BinarySearchTree() : root(nullptr) {};
		virtual ~BinarySearchTree() = default;
		bool empty() const;
		void add(int);
		void remove(int);
		void clear();
		void show() const;
		void min() const;
		void max() const;
	private:
		BinarySearchTreeNode* addNode(BinarySearchTreeNode*,int);
		BinarySearchTreeNode* removeNode(BinarySearchTreeNode*,int);
		void clearNode(BinarySearchTreeNode*);
		void showNode(BinarySearchTreeNode*) const;
		BinarySearchTreeNode* minNode(BinarySearchTreeNode*) const;
		BinarySearchTreeNode* maxNode(BinarySearchTreeNode*) const;
		BinarySearchTreeNode *root;
		int size = 0;
};
