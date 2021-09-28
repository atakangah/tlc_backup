#include <iostream>
#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>

#define BUFFERSIZE 1024


bool makeCopy (char *fileName, char *fileName2) {
	int srcFileDesc = open(fileName, O_RDONLY);
	if (srcFileDesc == -1) return false;

	int destFileDesc = open(fileName2, O_WRONLY|O_CREAT, 0755);
	if (srcFileDesc == -1) return false;

	char buffer[BUFFERSIZE];
	int readWriteSize;
	while ((readWriteSize = read(srcFileDesc, buffer, BUFFERSIZE)) > 0)
			write(destFileDesc, buffer, readWriteSize);

	if (readWriteSize == -1) {
		std::cout << "Failed to read file" << std::endl;
		return false;
	}
	return true;
}


int main(int argc, char *argv[]) {
	if (argc < 3) {
		std::cout << "Not enough parameters to perform action" << std::endl;
		return 1;
	}

	if (argc == 3) {

		bool copyRes = makeCopy(argv[1], argv[2]);
		if (copyRes == true) std::cout << "File copied successfully" << std::endl;
		else std::cout << "File copy operation failed. Maybe source file does not exist" << std::endl;
	}

	return EXIT_SUCCESS;
}
