/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: linkedlist node data structure.
 *
 * @name: LinkedListNode()
 * @description: constructor
 * @return: LinkedListNode
 */

struct LinkedListNode {
	LinkedListNode *next;
	int data;

	LinkedListNode(){
		this->next = nullptr;
		this->data = 0;
	}

	LinkedListNode(int key){
		this->next = nullptr;
		this->data = key;
	}
};
