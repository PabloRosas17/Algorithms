
#include "LinkedList.h"

int main(){
	cout<<"STARTING LinkedListMain.cpp"<<endl;

	LinkedList list;

	for(int i = 0; i < 10; i++){
		list.addNode(i);
		list.show();
	}

	list.removeNode(-1);

	list.clear();

	for(int i = 0; i < 10; i++){
		list.addNode(i);
		list.show();
	}

	for(int i = 0; i < 10; i++){
		list.show();
		list.removeNode(i);
	}

	list.removeNode(-1);

	list.clear();

	cout<<"ENDING LinkedListMain.cpp"<<endl;

	return 0;
}
