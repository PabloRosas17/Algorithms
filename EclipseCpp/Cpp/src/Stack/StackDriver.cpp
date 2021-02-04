/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: implementation of stack data structure.
 */

#include "Stacks.h"

Stacks::Stacks(int size){
	this->top = -1;
	this->MAX_SIZE = size;
	this->stack = new char[MAX_SIZE]();

}

Stacks::~Stacks(){
	delete stack;
}

void Stacks::printFromTop(){
	for(int i = 0; i < this->size(); i++){
		cout << "i: " << i << " , stack[i]: " << stack[i] << "\n";
	}
}

void Stacks::printFromBottom(){
	for(int i = this->size()-1; i >= 0; i--){
		cout << "i: " << i << " , stack[i]: " << stack[i] << "\n";
	}
}

void Stacks::push(char c){
	if(full()){
		cout << "stack size is " << size() << " which is full." << endl;
	} else {
		char element = c;
		cout << "push: " << element << endl;
		stack[++top] = c;
	}
}

void Stacks::pop(){
	if(empty()){
		cout << "stack size is " << size() << " which is empty." << endl;
	} else {
		char element = stack[top];
		cout << "pop: " << element << endl;
		stack[top--] = '\0';
	}
}

void Stacks::clear(){
	for(int i = 0; i < MAX_SIZE; i++){
		stack[top--] = -1;
	}
}

bool Stacks::empty(){
	return this->top == -1;
}

bool Stacks::full(){
	return this->top + 1 == MAX_SIZE;
}

int Stacks::size(){
	return Tools().number_of_array_elements(stack,MAX_SIZE);
}
