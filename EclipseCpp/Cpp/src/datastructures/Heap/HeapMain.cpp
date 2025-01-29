
#include "Heap.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

using std::cout;
using std::endl;

int main(){
	cout<<"HeapMain.cpp"<<endl;

	int heap_size = 10;
	Heap heap(heap_size);

	srand(time(nullptr));
	for(int i = 0; i < heap_size; i++){
		int r = rand() % 25 + 1;
		heap.insert(r);
	}
	heap.print();

	cout << "\n";

	int *a = new int[heap_size]{30,20,10,50,40,5,2,7,3,1};
	heap.build_max_heap(*&a,heap_size);
	heap.print(a,heap_size);
	delete a;

	cout << "\n";

	int *b = new int[heap_size]{30,20,10,50,40,5,2,7,3,1};
	heap.heap_sort(*&b,heap_size);
	heap.print(b,heap_size);
	delete b;

	cout << "\n";

	int c;
	cout << "Enter a number to insert into the heap (-1 to exit)" << endl;
	while(c != -1){
		cout << "Enter: ";
		cin >> c;
		cout << endl;
		heap.insert(c);
		heap.extract_max();
		heap.print();
		cout << " * * * * * * " << endl;
		cout << "max: " << heap.max() << endl;
	}
}
