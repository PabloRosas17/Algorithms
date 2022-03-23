/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: driver for binarysearchtree data structure.
 */

#include "BinarySearchTree.h"

int main(){
	cout<<"BinarySearchTree.cpp"<<endl;

	BinarySearchTree tree;

	for(int i = 0; i < 10; i++){
		tree.addNode(i);
		tree.show();
	}
}
