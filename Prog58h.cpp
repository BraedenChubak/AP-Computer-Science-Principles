#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Principal: $";
    double p;
    cin >> p;
    cout << "Interest Rate: ";
    double i;
    cin >> i;
    i = i / 100;
    cout << "Number of times Compounded per Year: ";
    int y;
    cin >> y;
    cout << "Number of Days to be Saved: ";
    int d;
    cin >> d;

    double a = p * pow((1 + i/y), (y*d/365));
    cout << "The interest earned is: $" << (a - p);
    cout << "\nThe total amount in savings is: $" << a;
}
/*
Principal: $5000
Interest Rate: 11.5
Number of times Compounded per Year: 365
Number of Days to be Saved: 900
The interest earned is: $1638.96
The total amount in savings is: $6638.96
*/