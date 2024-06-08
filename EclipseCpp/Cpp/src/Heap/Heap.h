/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: heap data structure.
 *
 * @name: Heap()
 * @description: constructor
 * @return: Heap
 *
 * @name: ~Heap()
 * @description: destructor
 * @return: ~Heap
 *
 * @name: parent(int key)
 * @params: index to determine the parent.
 * @description: find the parent in the heap.
 * @return: int
 *
 * @name: left(int key)
 * @params: index to determine the left.
 * @description: find the left in the heap.
 * @return: int
 *
 * @name: right(int key)
 * @params: index to determine the right.
 * @description: find the right in the heap.
 * @return: int
 *
 * @name: empty()
 * @description: is the heap empty.
 * @return: bool
 *
 * @name: full()
 * @description: is the heap full.
 * @return: bool
 *
 * @name: insert(int data)
 * @params: element to be added.
 * @description: adds an item to the heap.
 * @return: int
 *
 * @name: max()
 * @description: find the largest element.
 * @return: int
 *
 * @name: extract_max()
 * @description: removes the max element.
 * @return: void
 *
 * @name: max_heapify(int key)
 * @params: key as the index.
 * @description: heapify's a heap in max order.
 * @return: void
 *
 * @name: build_max_heap(int* a, int size)
 * @params: a as the array. size as the size.
 * @description: builds a max heap from an unsorted array.
 * @return: void
 *
 * @name: heap_sort(int* a,int size)
 * @params: a as the array. size as the max size of the heap.
 * @description: sorts an unsorted array and heapify's it.
 * @return: void
 *
 * @name: swap(int* a,int* b)
 * @params: a as then first element. b as then second element.
 * @description: swaps two elements.
 * @return: void
 *
 * @name: print()
 * @description: prints the heap.
 * @return: void
 *
 * @name: print(int* a, int size)
 * @params: a as the array. size as the max size of the heap.
 * @description: prints the array.
 * @return: void
 */

#include <iostream>
#include <cmath>

using std::cout;
using std::cin;
using std::endl;

class Heap {
	public:
		Heap(int);
		~Heap();
		int parent(int);
		int left(int);
		int right(int);
		bool empty();
		bool full();
		void insert(int);
		int max();
		void extract_max();
		void max_heapify(int*,int);
		void build_max_heap(int*,int);
		void heap_sort(int*,int);
		void swap(int*,int*);
		void print();
		void print(int*,int);
	private:
		int* heap;
		int size;
		int MAX_SIZE;
};
