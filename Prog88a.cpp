#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter first int: ";
    int num1;
    cin >> num1;
    cout << "Enter second int: ";
    int num2;
    cin >> num2;
    int sum = num1 + num2;
    int diff = num1 - num2;
    int product = num1 * num2;
    double average = sum / 2.0;
    int absdiff = abs(diff);
    int maximum = max(num1, num2);
    int minimum = min(num1, num2);
    cout << "Sum: " << sum;
    cout << "\nDifference: " << diff;
    cout << "\nProduct: " << product;
    cout << "\nAverage: " << average;
    cout << "\nDistance: " << absdiff;
    cout << "\nMaximum: " << maximum;
    cout << "\nMinimum: " << minimum;
}
/*
Enter first int: 13
Enter second int: 20
Sum: 33
Difference: -7
Product: 260
Average: 16.5
Distance: 7
Maximum: 20
Minimum: 13
*/