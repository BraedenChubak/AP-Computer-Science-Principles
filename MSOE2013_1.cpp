#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter R1: ";
    double r1;
    cin >> r1;
    cout << "Enter R2: ";
    double r2;
    cin >> r2;
    cout << "Enter R3: ";
    double r3;
    cin >> r3;
    cout << "Enter Voltage: ";
    double v;
    cin >> v;
    double i1 = v / r1;
    double i2 = v / r2;
    double i3 = v / r3;
    double iTotal = i1 + i2 + i3;
    double rTotal = v / iTotal;
    cout << "Parallel Resistance is: " << rTotal;
}
/*
Enter R1: 500
Enter R2: 1000
Enter R3: 2500
Enter Voltage: 5
Parallel Resistance is: 294.118
*/