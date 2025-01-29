/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: stack data structure.
 *
 * @name: Stack(int size)
 * @params: size as the stack size.
 * @description: constructor
 * @return: Stack
 *
 * @name: Stack()
 * @description: destructor
 * @return: ~Stack
 *
 * @name: printFromTop()
 * @description: print the stack from the top.
 * @return: void
 *
 * @name: printFromBottom()
 * @description: print the stack from the bottom.
 * @return: void
 *
 * @name: push(char element)
 * @params: char as the element to be pushed.
 * @description: push a character to the stack.
 * @return: void
 *
 * @name: pop()
 * @description: pop a character from the stack.
 * @return: void
 *
 * @name: clear()
 * @description: clear all characters from the stack.
 * @return: void
 *
 * @name: empty()
 * @description: determine if the stack is empty.
 * @return: bool
 *
 * @name: full()
 * @description: determine if the stack is full.
 * @return: bool
 *
 * @name: size()
 * @description: determine the size of the stack.
 * @return: int
 */

#include <iostream>

using std::cout;
using std::endl;

class Stack {
	public:
		Stack(int);
		~Stack();
		void printFromTop();
		void printFromBottom();
		void push(char);
		void pop();
		void clear();
		bool empty();
		bool full();
		int size();
	private:
		char* stack;
		int top;
		int MAX_SIZE;
};
