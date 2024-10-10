#include <stdio.h>
#include <math.h>
#include <iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int main() {
    string roman;
    cout << "Enter Roman Numeral: ";
    cin >> roman;

    char romanArr[roman.length()+1];
    strcpy(romanArr, roman.c_str());

    int total = 0;

    // I, V, X, L, C, D, M
    for (int i = 0; i < roman.length(); i++) {
        switch (romanArr[i]) {
            case 'I':
                if (romanArr[i+1] == 'V' || romanArr[i+1] == 'X') {
                    total--;
                } else {
                    total++;
                }
                break;
            case 'V':
                total += 5;
                break;
            case 'X':
                if (romanArr[i+1] == 'L' || romanArr[i+1] == 'C') {
                    total -= 10;
                } else {
                    total += 10;
                }
                break;
            case 'L':
                total += 50;
                break;
            case 'C':
                if (romanArr[i+1] == 'D' || romanArr[i+1] == 'M') {
                    total -= 100;
                } else {
                    total += 100;
                }
                break;
            case 'D':
                total += 500;
                break;
            case 'M':
                total += 1000;
                break;
        }
    }
    cout << "The number is " << total;

/*
Enter Roman Numeral: MCDXLIV
The number is 1444
*/