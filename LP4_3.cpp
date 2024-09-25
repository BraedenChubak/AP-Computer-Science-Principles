#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter number of eggs: ";
    int eggs;
    cin >> eggs;
    int dozen = eggs / 12;
    int extra = eggs % 12;
    double price;
    if (dozen < 4) { price = 0.5 * dozen + (0.5 / 12 * extra); }
    else if (dozen < 6) { price = 0.45 * dozen + (0.45 / 12 * extra); }
    else if (dozen < 11) { price = 0.4 * dozen + (0.4 / 12 * extra); }
    else { price = 0.35 * dozen + (0.35 / 12 * extra); }
    cout << "The price of that many eggs is: $" << price;
}
/*
Enter number of eggs: 18
The price of that many eggs is: $0.75
*/