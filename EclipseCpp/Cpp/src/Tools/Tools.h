/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: common c++ tools.
 *
 * @name: Tools()
 * @description: constructor
 * @return: Tools
 *
 * @name: ~Tools()
 * @description: destructor
 * @return: ~Tools
 *
 * @name: number_of_array_elements(char* array, int size)
 * @params: char* as the array , int as the size.
 * @description: iterate through an array of a known size
 *   and count the number of valid elements.
 * @return: int
 *
 * @name: number_of_array_elements(int* array, int size)
 * @params: int* as the array , int as the size.
 * @description: iterate through an array of a known size
 *   and count the number of valid elements.
 * @return: int
 *
 * @name: number_of_array_elements(int* array, int size, int start)
 * @params: char* as the array , int as the size., int as the start.
 * @description: iterate through an array of a known size
 *   and count the number of valid elements.
 * @return: int
 *
 */

#include <iostream>

using std::cout;
using std::endl;

class Tools {
	public:
		Tools();
		~Tools();
		int number_of_array_elements(char*, int);
		int number_of_array_elements(int*, int);
		int number_of_array_elements(int* a, int size, int start);
	private:
};
