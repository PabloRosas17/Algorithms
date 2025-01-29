
#include "BinarySearchTree.h"

int main(){	
	cout<<"BinarySearchTree.cpp"<<endl;
	
	BinarySearchTree evens_tree;
	for (int i = 0; i < 100; i++) {
		if (i % 2 == 0) {
			evens_tree.add(i);
		}
	}
	cout << "Show all Evens" << endl;
	evens_tree.show();
	cout << endl;
	evens_tree.min();
	evens_tree.max();
	evens_tree.remove(50);
	evens_tree.show();

	cout << endl << endl << endl;

	BinarySearchTree odds_tree;
	for (int i = 0; i < 100; i++) {
		if (i % 2 != 0) {
			odds_tree.add(i);
		}
	}
	cout << "Show all Odds" << endl;
	odds_tree.show();
	cout << endl;
	odds_tree.min();
	odds_tree.max();
	odds_tree.remove(49);
	odds_tree.show();

	odds_tree.clear();
	evens_tree.clear();
	return 0;
}
