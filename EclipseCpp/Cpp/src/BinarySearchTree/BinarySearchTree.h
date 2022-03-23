/* @author: evolandlupiz
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

using std::cout;
using std::endl;

#include "BinarySearchTreeNode.h"

class BinarySearchTree {
	public:
		BinarySearchTree();
		~BinarySearchTree();
		bool empty();
		void addNode(int);
		void removeNode(int);
		void clear();
		void show();
	private:
		BinarySearchTreeNode *root;
		int size;
};
