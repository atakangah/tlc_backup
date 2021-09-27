#include <iostream>
#include "mystring.h"


int main () {

	char src [5] = {'a','b','c','d','\0'};
	char dest [5] = {'z','e','s','t', '\0'}; 	

	char *final = my::strcat(src, dest);

	for (int i = 0; i < sizeof(final)/sizeof(char); i++) {
		std::cout << "char: " << final[i] << std::endl;
	}


	return 0;
}
