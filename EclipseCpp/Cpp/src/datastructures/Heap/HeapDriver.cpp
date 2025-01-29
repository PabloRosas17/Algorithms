/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: implementation of queue heap structure.
 */

#include "Heap.h"

Heap::Heap(int size){
	this->MAX_SIZE = size;
	this->heap = new int[size]();
	this->size = 0;
}

Heap::~Heap(){
	delete heap;
}

int Heap::parent(int key){
	return (key-1)/2;
}

int Heap::left(int key){
	return (2*key)+1;
}

int Heap::right(int key){
	return (2*key)+2;
}

bool Heap::empty(){
	return this->size == 0;
}

bool Heap::full(){
	return this->size == MAX_SIZE;
}

void Heap::insert(int data){
	if(full()){
		cout<<"Heap is full."<<endl;
		return;
	}
	heap[size++] = data;
	int t = size-1;
	while (t != 0 && heap[parent(t)] < heap[t]) {
		int temp = heap[t];
		heap[t] = heap[parent(t)];
		heap[parent(t)] = temp;
		t = parent(t);
	}
}

int Heap::max(){
	return heap[0];
}

void Heap::extract_max(){
	heap[0] = heap[size--];
	this->max_heapify(this->heap,0);
}

void Heap::max_heapify(int *a, int key){
	int p = key;
	int l = 2*key+1;
	int r = 2*key+2;
	if (l <= size && a[l] > a[p]){
		p = l;
	}
	if (r <= size && a[r] > a[p]){
		p = r;
	}
	if(p != key){
		this->swap(&a[key],&a[p]);
		this->max_heapify(*&a,p);
	}
}

void Heap::build_max_heap(int *a,int size){
	this->size = size-1;
	for(int i = (this->size--/2); i >= 0 ; i--){
		this->max_heapify(*&a,i);
	}
}

void Heap::heap_sort(int *a,int size){
	this->build_max_heap(a,size);
	for(int i = size; size >= 0; i--){
		int temp = heap[0];
		heap[0] = heap[i];
		heap[i] = temp;
		size--;
		max_heapify(this->heap,0);
	}
}

void Heap::swap(int *x, int *y){
	int temp = *x;
	*x = *y;
	*y = temp;
}


void Heap::print(){
	if(empty()){
		cout<<"Heap is empty."<<endl;
		return;
	}
	for(int i = 0; i < size; i++){
		cout << "heap[" << i << "]: " << heap[i] << endl;
	}
}

void Heap::print(int *a, int size){
	for(int i = 0; i < size; i++){
		cout << "heap[" << i << "]: " << a[i] << endl;
	}
}

