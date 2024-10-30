#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

double f(double x) {
    double y = -0.09 * pow(x, 6);
    y += 1.6108 * pow(x, 5);
    y += -10.9167 * pow(x, 4);
    y += 34.7625 * pow(x, 3);
    y += -52.0433 * pow(x, 2);
    y += 31.1767 * pow(x, 1);
    y += -4;
    return y;
}

double fPrime(double x) {
    double y = 6 * -0.09 * pow(x, 5);
    y += 5 * 1.6108 * pow(x, 4);
    y += 4 * -10.9167 * pow(x, 3);
    y += 3 * 34.7625 * pow(x, 2);
    y += 2 * -52.0433 * pow(x, 1);
    y += 31.1767;
    return y;
}

int main() {
    cout << "Enter first guess for X: ";
    double x;
    cin >> x;
    cout << "Initial position: f(" << x << ") = " << f(x) << endl;
    while (abs(f(x)) > 0.001) {
        x -= f(x) / fPrime(x);
        cout << "Refined zero: f(" << x << ") = " << f(x) << endl;
    }
}

/*
Initial position: f(4) = -1.042
Refined zero: f(3.56235) = 0.239911
Refined zero: f(3.64288) = -0.00504826
Refined zero: f(3.64125) = -1.07053e-06
*/