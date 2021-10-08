#include <iostream>

int main() {
	enum {RED, YELLOW, AMBER=YELLOW, GREEN};

	for (int i = RED; i <= GREEN; i++) {
		std::cout << i << std::endl;
	}

	return 0;
}
