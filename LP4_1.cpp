#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter number of copies: ";
    int copies;
    cin >> copies;
    double price;
    if (copies < 0) {
        cout << "Please input a positive number!";
        return 0;
    } else if (copies < 100) {
        price = 0.3 * copies;
    } else if (copies < 500) {
        price = 0.28 * copies;
    } else if (copies < 750) {
        price = 0.27 * copies;
    } else if (copies < 1000) {
        price = 0.26 * copies;
    } else {
        price = 0.25 * copies;
    }
    cout << "Price per copies is: " << (price / copies);
    cout << "\nTotal Price is: " << price;
}
/*
Enter number of copies: 1001
Price per copies is: 0.25
Total Price is: 250.25
*/