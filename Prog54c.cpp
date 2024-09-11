#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    const double PI = 3.14159;
    cout << "Enter the radius: ";
    double r;
    cin >> r;
    double circum = 2 * PI * r;
    double area = PI * pow(r, 2);
    cout << "Circumference: " << circum << "\n";
    cout << "Area: " << area;
}

/*
Enter the radius: 3.712
Circumference: 23.3232
Area: 43.2878
*/