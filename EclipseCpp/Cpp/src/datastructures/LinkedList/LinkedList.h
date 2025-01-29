/* @author: pablorosas17
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
 *
 * @name: empty()
 * @description: is the list empty.
 * @return: bool
 *
 * @name: addNode(int data)
 * @param: data as the element to be added.
 * @description: adds a node to the LinkedList.
 * @return: void
 *
 * @name: removeNode(int data)
 * @param: data as the element to be removed.
 * @description: removes a node to the LinkedList.
 * @return: void
 *
 * @name: clear()
 * @description: removes all nodes from the LinkedList.
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

#include "LinkedListNode.h"

class LinkedList {
	public:
		LinkedList();
		~LinkedList();
		bool empty();
		void addNode(int);
		void removeNode(int);
		void clear();
		void show();
	private:
		LinkedListNode *root;
		int size;
};
