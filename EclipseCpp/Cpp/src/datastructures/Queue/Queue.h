/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: queue data structure.
 *
 * @name: Queue(int size)
 * @params: size as the queue size.
 * @description: constructor
 * @return: Queue
 *
 * @name: ~Queue()
 * @description: destructor
 * @return: ~Queue
 *
 * @name: enqueue(int element)
 * @params: element as the data being enqueued.
 * @description: adds an element to the queue.
 * @return: void
 *
 * @name: dequeue()
 * @description: removes an element from the queue.
 * @return: void
 *
 * @name: peek_front()
 * @description: displays the front of the queue.
 * @return: int
 *
 * @name: peek_rear()
 * @description: displays the rear of the queue.
 * @return: int
 *
 * @name: empty()
 * @description: determines if a queue is empty.
 * @return: bool
 *
 * @name: full()
 * @description: determines if a queue is full.
 * @return: bool
 *
 * @name: size()
 * @description: determines the size of the queue.
 * @return: int
 *
 * @name: clear()
 * @description: clears all the elements in the queue.
 * @return: void
 */

#include <iostream>

using std::cout;
using std::endl;

class Queue {
	public:
		Queue(int);
		~Queue();
		void enqueue(int);
		void dequeue();
		int peek_front();
		int peek_rear();
		bool empty();
		bool full();
		int size();
		void clear();
	private:
		int* queue;
		int front;
		int rear;
		int MAX_SIZE;
};
