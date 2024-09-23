#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter kg of package: ";
    int kg;
    cin >> kg;
    cout << "Enter length of package in cm: ";
    int len;
    cin >> len;
    cout << "Enter width of package in cm: ";
    int wid;
    cin >> wid;
    cout << "Enter height of package in cm: ";
    int hgt;
    cin >> hgt;
    if (kg > 26) {
        if (len * wid * hgt > 100000) {
            cout << "Too heavy and too large";
        } else {
            cout << "Too heavy";
        }
    } else if (len * wid * hgt > 100000) {
            cout << "Too large";
    } else {
        cout << "Package is good to ship!";
    }
}
/*
Enter kg of package: 31
Enter length of package in cm: 32
Enter width of package in cm: 21
Enter height of package in cm: 19
Too heavy
*/