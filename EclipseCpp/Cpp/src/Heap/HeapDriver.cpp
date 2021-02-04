/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: implementation of queue heap structure.
 */

#include "Heap.h"

Heap::Heap(int size) {
	this->MAX_SIZE = size;
	this->heap = new int[size]();
	this->size = 0;
}

Heap::~Heap() {
	delete heap;
}

int Heap::parent(int n){
	return (n-1)/2;
}

int Heap::left(int n){
	return 2*n+1;
}

int Heap::right(int n){
	return 2*n+2;
}

void Heap::insert(int ele){
	if(size >= MAX_SIZE){
		cout<<"Heap is full."<<endl;
		return;
	}
	heap[size++] = ele;
	this->increase_key(size - 1, ele);
	this->print();
}

int Heap::max(){
	return heap[0];
}

void Heap::extract_max(){
	heap[0] = heap[size--];
	this->max_heapify(this->heap,0);
}

void Heap::increase_key(int i,int key){
	//if(key < heap[i]){
	//	cout << "Key: " << key << " must be greater than current key: " << heap[i] << endl;
	//	return;
	//}
	//heap[i] = key;
	while (i != 0 && heap[parent(i)] < heap[i]) {
		swap(&heap[parent(i)], &heap[i]);
		i = parent(i);
	}
}

void Heap::max_heapify(int *a, int i){
	int p = i;
	int l = 2*i+1;
	int r = 2*i+2;
	if (l <= size && a[l] > a[p]){
		p = l;
	}
	if (r <= size && a[r] > a[p]){
		p = r;
	}
	if(p != i){
		this->swap(&a[i],&a[p]);
		this->max_heapify(a,p);
	}
}

void Heap::build_max_heap(int *a,int size){
	this->size = size;
	for(int i = (this->size--/2); i >= 0 ; i--){
		this->max_heapify(*&a,i);
	}
	for(int i = 0; i < size; i++){
		cout << "heap[" << i << "]: " << a[i] << endl;
	}
}

void Heap::heap_sort(int *a,int size){
//1. Build Max Heap from unordered array;
	this->size = size;
	for(int i = (this->size--/2); i >= 0 ; i--){
		this->max_heapify(*&a,i);
	}
//2. Find maximum element A[1];
//3. Swap elements A[n] and A[1]:
//now max element is at the end of the array!
//4. Discard node n from heap
//(by decrementing heap-size variable)
//5. New root may violate max heap property, but its
//children are max heaps. Run max_heapify to fix this.
//6. Go to Step 2 unless heap is empty.

	for(int i = 0; i < size; i++){
		cout << "heap[" << i << "]: " << a[i] << endl;
	}
}

void Heap::swap(int *x, int *y){
	int temp = *x;
	*x = *y;
	*y = temp;
}

void Heap::print(){
	for(int i = 0; i < size; i++){
		cout << "heap[" << i << "]: " << heap[i] << endl;
	}
}
