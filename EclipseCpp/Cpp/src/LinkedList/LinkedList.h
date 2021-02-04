/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: linkedlist data structure.
 *
 * @name: LinkedList()
 * @description: constructor
 * @return: LinkedList
 *
 * @name: ~LinkedList()
 * @description: destructor
 * @return: ~LinkedList
 */

#include <iostream>

using std::cout;
using std::endl;

#include "LinkedListNode.h"

class LinkedList {
	LinkedList();
	~LinkedList();
	public:
		void addNode();
		void removeNode();
	private:
		LinkedListNode *root;
};
