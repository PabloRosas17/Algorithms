/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: implementation of linkedlist data structure.
 */

#include "LinkedList.h"

LinkedList::LinkedList(){
	this->root = NULL;
	this->size = 0;
}

LinkedList::~LinkedList(){
	LinkedListNode *it = root;
	LinkedListNode *next;
	while(it != NULL){
		next = it->next;
		delete it;
		it = next;
	}
}

bool LinkedList::empty(){
	if(root == NULL){
		cout << "root was null, empty list." << endl;
		return true;
	} else {
		return false;
	}
}

void LinkedList::addNode(int key){
	LinkedListNode *node = new LinkedListNode(key);
	if(root == NULL){
		root = node;
	} else {
		LinkedListNode *temp = root;
		while(temp->next != NULL){
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
	LinkedListNode *before = NULL;
    if(temp != NULL && temp->data == key){
    	before = temp;
    	root = before->next;
        temp = NULL;
        delete temp;
        delete before;
        size--;
        //cout<<"deleted element "<<key<<" and size is "<<size<<"."<<endl;
        return;
    }
    while(temp != NULL){
    	before = temp;
    	temp = temp->next;
		if(temp != NULL && temp->data == key){
			before->next = temp->next;
			temp->data = -1;
			temp = NULL;
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
	while(temp != NULL){
		root = NULL;
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
	while (temp != NULL){
		cout<<temp->data<<" -> ";
		temp = temp->next;
	}
	cout<<"NULL"<<endl;
}
