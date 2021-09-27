#include <iostream>
#include <algorithm>
#include <cmath>
#include <map>



int calcMedian(int *numbs) {
	const int arrSize = sizeof(numbs)/sizeof(numbs[0]);
	std::sort(numbs, numbs + arrSize);
	return numbs[(int)floor(arrSize/2)];
}


int calcMode(int *numbs) {
	std::map<int, int> numbsMap;
	const int arrSize = sizeof(numbs)/sizeof(numbs[0]);

	std::cout << "size: " << arrSize << std::endl;

	// Initialize all to 0
	for (int i = 0; i < arrSize; i++) {
		numbsMap[numbs[i]] = 0;
	}

	// Count frequencies
	for (int i = 0; i < arrSize; i++) {
		numbsMap[numbs[i]]+=1; 
	}

	// Get and return mode
	int mode = numbs[0];
	for (int i = 0; i < arrSize; i++) {
		std::cout << "it: " << numbsMap[numbs[i]] << std::endl;
		if (numbsMap[numbs[i]] > numbsMap[mode]) 
			mode = numbs[i];
	}

	return mode;

}

int calcMean(int *numbs) {
	return 0;
}


int main() {
	int numbs[5];
	int counter = 0;

	while(counter < sizeof(numbs)/sizeof(numbs[0])) {
		std::cout << "Enter value: ";
		std::cin >> numbs[counter];
		++counter;
	}

	std::cout << "Mean: " << calcMean(numbs) << std::endl;
	std::cout << "returned size: " << sizeof(numbs)/sizeof(numbs[0]) << std::endl;
	std::cout << "Median: " << calcMedian(numbs) << std::endl;
	std::cout << "Mode: " << calcMode(numbs) << std::endl;


	return 0;
}
