#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

double f(double x) {
    static const double pi = atan(1.0) * 4.0;
    return exp(-x*x/2)/sqrt(2*pi);
}

int main() {
    double a;
    cout << "Enter a: ";
    cin >> a;
    double b;
    cout << "Enter b (must be LARGER than a): ";
    cin >> b;
    double n;
    cout << "Enter n: ";
    cin >> n;
    double h = (b-a) / n;
    double totalArea = 0;
    for (int i = 0; i < n; i++) {
        totalArea += h * (f(a + i*h));
    }
    cout << "The Riemann Sum is " << totalArea;
}
/*
Enter a: 0
Enter b (must be LARGER than a): 4
Enter n: 8
The Riemann Sum is 0.59966
*/