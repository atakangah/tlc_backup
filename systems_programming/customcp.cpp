#include <iostream>
#include <stdio.h>
#include <unistd.h>

#define BUFFERSIZE 1024

bool makeCopy (char *fileName) {
	int srcFileDesc = open(fileName, O_RDONLY);
	if (srcFileDesc == -1) return false;

	int destFileDesc = open(fileName, O_WRONLY|O_CREAT);

	char buffer[BUFFSIZE];
	int readWriteSize;
	while ((readWriteSize = read(srcFileDesc, buffer, BUFFERSIZE) > 0)
			write(destFileDesc, buffer, readWriteSize);

	if (readWriteSize == 0) std::cout << "Failed to read file" << std::endl;
	
	return false;
}


int main(int argc, char *argv[]) {
	const int paramSize = sizeof(*argv)/sizeof(char);

	if (paramSize < 2) {
		std::cout << "Not enough parameters to perform action" << std::endl;
		return 1;
	}

	if (paramSize == 2) {
		const char *src[] = argv[1];
		const char *dest[] = argv[2];
	}

	return EXIT_SUCCESS;
}
