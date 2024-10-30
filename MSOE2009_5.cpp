#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

bool isPrime(int num) {
    if (num == 0 || num == 1) {
        return false;
    }
    for (int i = 2; i < num-1; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    cout << "Enter an integer: ";
    int num;
    cin >> num;
    if (isPrime(num)) {
        cout << "prime";
    } else {
        cout << "not prime";
    }
}
/*
Enter an integer: 7
prime
*/