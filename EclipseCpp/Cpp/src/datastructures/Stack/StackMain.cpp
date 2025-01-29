
#include "Stack.h"

int main(){
	cout<<"StackMain.cpp"<<endl;

	int stack_size = 10;
	Stack stack(stack_size);

	for(int i = 0; i < stack_size; i++){
		stack.push(i + '0');
	}
	stack.printFromTop();

	cout << "\n";

	stack.printFromBottom();
	for(int i = 0; i < stack_size; i++){
		stack.pop();
	}

	cout << "\n";

	stack.clear();
}
