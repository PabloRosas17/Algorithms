/* @author: evolandlupiz
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
		this->next = NULL;
		this->data = 0;
	}

	LinkedListNode(int key){
		this->next = NULL;
		this->data = key;
	}
};
