/* @author: evolandlupiz
 * @date: 03/23/2020
 * @purpose: implementation of common c++ tools.
 */

#include "Tools.h"

Tools::Tools(){}

Tools::~Tools(){}

int Tools::number_of_array_elements(char* a, int size){
	int cnt = 0;
	for(int i = 0; i < size; i++){
		if(a[i] == '\0' || a[i] < 0x21 || a[i] > 0x7E){ break; }
		cnt++;
	}
	return cnt;
}

int Tools::number_of_array_elements(int* a, int size){
	int cnt = 0;
	for(int i = 0; i < size; i++){
		if(a[i] == '\0' || a[i] < 0x21 || a[i] > 0x7E){ break; }
		cnt++;
	}
	return cnt;
}

int Tools::number_of_array_elements(int* a, int size, int start){
	int cnt = 0;
	for(int i = start; i < size; i++){
		if(a[i] == '\0' || a[i] < 0x21 || a[i] > 0x7E){ break; }
		cnt++;
	}
	return cnt;
}
