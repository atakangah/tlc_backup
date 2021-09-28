#include <iostream>
#include <stdio.h>
#include <unistd.h>
#include <filesystem>

int main(int argc, const char *argv[]) {
	char path[1] {'/'};

	for (const auto & file : std::filesystem::directory_iterator(path))
		std::cout << file.path() << std::endl;

	return EXIT_SUCCESS;
}
