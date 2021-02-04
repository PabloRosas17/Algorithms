/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: binarytree data structure.
 *
 * @name: BinaryTree()
 * @description: constructor
 * @return: BinaryTree
 *
 * @name: ~BinaryTree()
 * @description: destructor
 * @return: ~BinaryTree
 */

#include <iostream>

using std::cout;
using std::endl;

#include "BinaryTreeNode.h"

class BinaryTree {
	BinaryTree();
	~BinaryTree();
	public:
		void addNode();
		void removeNode();
	private:
		BinaryTreeNode *root;
};
