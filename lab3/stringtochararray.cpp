#include <iostream>
#include <cstring>


int main() {
	std::string input;
	char inputconv;

	std::cout << "Enter input: ";
	std::getline(std::cin, input);

	const char *cstr = input.c_str();

	for (char c = 0; cstr[c] != '\0'; c++) {
		std::cout << cstr[c];
	}

	std::cout << std::endl;

	return 0;
}
