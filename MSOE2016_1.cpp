#include <stdio.h>
#include <vector>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter a Number: ";
    int num;
    cin >> num;
    int temp = num;
    int curFactor = 2;
    vector<int> primes;
    while (curFactor <= temp) {
        if (num % curFactor == 0) {
            num /= curFactor;
            primes.push_back(curFactor);
        } else {
            curFactor++;
        }
    }
    primes.push_back(curFactor);
    curFactor = primes.at(0);
    int factorCount = 0;
    int totient = 0;
    for (int i = 0; i < primes.size() - 1; i++) {
        if (primes.at(i) == curFactor) {
            factorCount++;
        } else {
            if (totient == 0) {
                totient = pow(curFactor, factorCount-1) * (curFactor-1);
            } else {
                totient *= pow(curFactor, factorCount-1) * (curFactor-1);
            }
            factorCount = 1;
            curFactor = primes.at(i);
        }
    }
    totient *= pow(curFactor, factorCount-1) * (curFactor-1);
    cout << "The totient of " << temp << " is " << totient;
}
/*
Enter a Number: 1500
The totient of 1500 is 400
*/