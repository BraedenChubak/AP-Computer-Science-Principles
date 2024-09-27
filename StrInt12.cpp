#include <stdio.h>
#include <string>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter a String: ";
    string str;
    getline(cin, str);
    int curIndex = 1;
    int numSpaces = 0;
    while (curIndex < str.length()) {
        if (str.substr(curIndex, 1).compare(" ") == 0) {
            numSpaces++;
        }
        curIndex++;
    }
    string splitStr[numSpaces+1];
    int lastIndex = 0;
    curIndex = 1;
    int count = 0;
    while (curIndex < str.length()) {
        if (str.substr(curIndex, 1).compare(" ") == 0) {
            splitStr[count] = str.substr(lastIndex, curIndex-lastIndex);
            count++;
            lastIndex = curIndex+1;
        }
        curIndex++;
    }
    splitStr[numSpaces] = str.substr(lastIndex, curIndex-lastIndex);
    for (int i = numSpaces; i >= 0; i--) {
        cout << splitStr[i] << " ";
    }
}
/*
Enter a String: hello there world you are amazing
amazing are you world there hello
*/