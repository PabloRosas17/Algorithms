/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: binarysearchtree node data structure.
 *
 * @name: BinarySearchTree()
 * @description: constructor
 * @return: BinarySearchTree
 */

struct BinarySearchTreeNode {
	public:
		explicit BinarySearchTreeNode(const int data) : data(data), left(nullptr), right(nullptr) {}
		BinarySearchTreeNode *left;
		BinarySearchTreeNode *right;
		int data;
};
