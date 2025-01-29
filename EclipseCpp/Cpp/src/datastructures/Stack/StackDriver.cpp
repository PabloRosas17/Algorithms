/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: implementation of stack data structure.
 */

#include "Stack.h"

Stack::Stack(int size){
	this->top = -1;
	this->MAX_SIZE = size;
	this->stack = new char[MAX_SIZE]();

}

Stack::~Stack(){
	delete stack;
}

void Stack::printFromTop(){
	for(int i = 0; i < this->size(); i++){
		cout << "i: " << i << " , stack[i]: " << stack[i] << "\n";
	}
}

void Stack::printFromBottom(){
	for(int i = this->size()-1; i >= 0; i--){
		cout << "i: " << i << " , stack[i]: " << stack[i] << "\n";
	}
}

void Stack::push(char c){
	if(full()){
		cout << "stack size is " << size() << " which is full." << endl;
	} else {
		char element = c;
		cout << "push: " << element << endl;
		stack[++top] = c;
	}
}

void Stack::pop(){
	if(empty()){
		cout << "stack size is " << size() << " which is empty." << endl;
	} else {
		char element = stack[top];
		cout << "pop: " << element << endl;
		stack[top--] = '\0';
	}
}

void Stack::clear(){
	for(int i = 0; i < MAX_SIZE; i++){
		stack[top--] = -1;
	}
}

bool Stack::empty(){
	return this->top == -1;
}

bool Stack::full(){
	return this->top + 1 == MAX_SIZE;
}

int Stack::size(){
	int cnt = 0;
	for (int i = 0; i < MAX_SIZE; i++) {
		if (stack[i] == '\0' || stack[i] < 0x21 || stack[i] > 0x7E) { break; }
		cnt++;
	}
	return cnt;
}
