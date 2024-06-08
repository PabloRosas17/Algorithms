/* @author: pablorosas17
 * @date: 03/23/2020
 * @purpose: driver for tools auxilary.
 */

#include "Tools.h"

int main(){
	cout<<"ToolsMain.cpp"<<endl;

    char a[] = "a";
    char *ptr_a = a;

    int b = 0;
    int *ptr_b = &b;

    int b_start = 0;

	Tools tools;

    tools.number_of_array_elements(a,sizeof(a));
    tools.number_of_array_elements(ptr_a,sizeof(ptr_a));

    tools.number_of_array_elements(ptr_b,sizeof(b));

    tools.number_of_array_elements(ptr_b,sizeof(b),b_start);
}
