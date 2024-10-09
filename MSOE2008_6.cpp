#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    string str;
    cout << "Enter string: ";
    cin >> str;
    string phrase;
    cout << "Enter phrase: ";
    cin >> phrase;
    int count = 0;
    for (int i = 0; i <= str.length()-phrase.length(); i++) {
        if (str.substr(i, phrase.length()).compare(phrase) == 0) {
            count++;
        }
    }
    cout << "The phrase occurs " << count << " times within the string.";
}

/*
Enter string: ATATATA
Enter phrase: ATA
The phrase occurs 3 times within the string.
*/