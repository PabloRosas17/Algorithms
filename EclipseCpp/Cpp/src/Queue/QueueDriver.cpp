/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: implementation of queue data structure.
 */

#include "Queue.h"

Queue::Queue(int size){
	this->front = -1;
	this->rear = -1;
	this->MAX_SIZE = size;
	this->queue = new int[MAX_SIZE];
}

Queue::~Queue(){
	delete queue;
}

void Queue::enqueue(int e){
	if(full()){
		cout << "queue size is " << size() << " which is full, can not enqueue." << endl;
	} else{
		if(front == -1){ front = 0; }
		queue[++rear] = e;
		cout << "front: " << peek_front() << ", rear: " << peek_rear() << endl;
	}
}

void Queue::dequeue(){
	if(empty()){
		cout << "queue size is " << size() << " which is empty, can not dequeue." << endl;
		queue[front] = queue[rear] = 0;
	} else{
		queue[front++] = -1;
		cout << "front: " << peek_front() << ", rear: " << peek_rear() << endl;
	}
}

int Queue::peek_front(){
	return queue[front];
}

int Queue::peek_rear(){
	return queue[rear];
}

bool Queue::empty(){
	return front == rear;
}

bool Queue::full(){
	return rear == MAX_SIZE;
}

int Queue::size(){
	return Tools().number_of_array_elements(queue,MAX_SIZE);
}

void Queue::clear(){
	for(int i = 0; i < MAX_SIZE; i++){
		queue[i] = -1;
	}
	front = rear = -1;
}
