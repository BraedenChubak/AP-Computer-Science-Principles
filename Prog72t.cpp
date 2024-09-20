#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Enter time 1: ";
    int t1;
    cin >> t1;
    cout << "Enter time 2: ";
    int t2;
    cin >> t2;
    if (t1 > t2) {
        t2 += 2400;
    }
    int t1h = t1 / 100;
    int t2h = t2 / 100;
    int t1m = t1 % 100;
    int t2m = t2 % 100;
    if (t1m > t2m) {
        t2m += 60;
        t2h--; // forgot this, but it converts an hour into minutes instead of just adding the minutes
    }
    int hours = t2h - t1h;
    int minutes = t2m - t1m;
    cout << hours << " hours and " << minutes << " minutes.";
}
/*
Enter time 1: 900
Enter time 2: 1730
8 hours and 30 minutes.
*/
// Run Again
/*
Enter time 1: 1730
Enter time 2: 900
15 hours and 30 minutes.
*/