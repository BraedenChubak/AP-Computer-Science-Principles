#include <stdio.h>
#include <string>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    string bigStr;
    cout << "Enter bigger string: ";
    cin >> bigStr;
    string smallStr;
    cout << "Enter smaller string: ";
    cin >> smallStr;
    for (int i = 0; i <= bigStr.length()-smallStr.length(); i++) {
        if (bigStr.substr(i, smallStr.length()).compare(smallStr) == 0) {
            cout << "The smaller string is in the bigger string at index " << i;
            return 0;
        }
    }
    cout << "The smaller string is NOT in the bigger string";
}
/*
Enter bigger string: beautifulmorning
Enter smaller string: lmo
The smaller string is in the bigger string at index 8
*/