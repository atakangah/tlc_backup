#include <iostream>


namespace my {
	int strcmp(const char *l, const char *r);
	char *strcat(char *l, const char *r);
	char *strcpy(char *l, const char *r);
	int strlen(const char *s);
	char *toupper(char *s);

int strcmp(const char *l, const char *r) {

	const int size_l = sizeof(l)/sizeof(char);
	const int size_r = sizeof(r)/sizeof(char);

	if (size_l < size_r) return -1;

	if (size_l > size_r) return 1;

	else {

		for (int i = 0; i < size_l; i++) {
			if (l[i] != r[i]) return -1;
		}
	}

	return 0;

}


char *strcat(char *l, const char *r) {

	char *ref = l;
	char final[5] = {'d','e','a','t','\0'};
	/*
	int counter = 0;
	do {
		//std::cout << "count: " << counter;
		final[counter] = r[counter];
		counter++;
	} while (r[counter] != '\0');

	do {
		//std::cout << "count: " << counter;
		final[counter] = l[counter];
		counter++;
	} while (l[counter] != '\0');

	final[counter]='\0';
	*/

	return &final;
}


int strlen(const char *s) {
	return sizeof(s)/sizeof(char) - 1;	
}

}
