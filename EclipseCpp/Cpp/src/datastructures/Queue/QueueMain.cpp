
#include "Queue.h"

int main(){
	cout<<"QueueMain.cpp"<<endl;

	int queue_size = 10;
	Queue queue(queue_size);

	for(int i = 0; i < queue_size; i++){
		queue.enqueue(i + '0');
		queue.peek_front();
		queue.peek_rear();
	}

	cout << "\n";

	for(int i = 0; i < queue_size; i++){
		queue.dequeue();
		queue.peek_front();
		queue.peek_rear();
	}

	cout << "\n";

	queue.clear();
}
