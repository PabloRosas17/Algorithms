/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: implementation of linkedlist data structure.
 */

#include "LinkedList.h"

LinkedList::LinkedList(){
	this->root = nullptr;
	this->size = 0;
}

LinkedList::~LinkedList(){
	LinkedListNode *it = root;
	LinkedListNode *next;
	while(it != nullptr){
		next = it->next;
		delete it;
		it = next;
	}
}

bool LinkedList::empty(){
	if(root == nullptr){
		cout << "root was null, empty list." << endl;
		return true;
	} else {
		return false;
	}
}

void LinkedList::addNode(int key){
	LinkedListNode *node = new LinkedListNode(key);
	if(root == nullptr){
		root = node;
	} else {
		LinkedListNode *temp = root;
		while(temp->next != nullptr){
			temp = temp->next;
		}
		temp->next = node;
	}
	size++;
    //cout<<"added element "<<key<<" and size is now"<<size<<"."<<endl;
}

void LinkedList::removeNode(int key){
	if(this->empty()){ return; }
	LinkedListNode *temp = root;
	LinkedListNode *before = nullptr;
    if(temp != nullptr && temp->data == key){
    	before = temp;
    	root = before->next;
        temp = nullptr;
        delete temp;
        delete before;
        size--;
        //cout<<"deleted element "<<key<<" and size is "<<size<<"."<<endl;
        return;
    }
    while(temp != nullptr){
    	before = temp;
    	temp = temp->next;
		if(temp != nullptr && temp->data == key){
			before->next = temp->next;
			temp->data = -1;
			temp = nullptr;
			delete temp;
			delete before;
			size--;
			//cout<<"successfully deleted element "<<key<<" and size is "<<size<<"."<<endl;
			return;
		}
    }
    cout<<"unsuccessful deleted element "<<key<<" and size is "<<size<<"."<<endl;
    delete temp;
}

void LinkedList::clear(){
	if(this->empty()){ return; }
	LinkedListNode *temp = root;
	while(temp != nullptr){
		root = nullptr;
		temp = temp->next;
		root = temp;
		size--;
	}
    cout<<"cleared all elements and size is "<<size<<"."<<endl;
}

void LinkedList::show(){
	if(this->empty()){ return; }
	LinkedListNode *temp = root;
	cout<<"NULL -> ";
	while (temp != nullptr){
		cout<<temp->data<<" -> ";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}
