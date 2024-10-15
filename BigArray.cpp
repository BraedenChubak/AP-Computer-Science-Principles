#include <stdio.h>
#include <math.h>
#include <iostream>
#include <limits.h>
#include <random>
using namespace std;

int main() {
    int arr[20];
    srand(time(0));

    for (int i = 0; i < 19; i++) {
        arr[i] = (rand() % 71) + 20;
        cout << arr[i] << " ";
    }
    cout << "\n";

    arr[19] = 0; // just for no null exceptions, unsure if necessary

    for (int i : arr) {
        cout << i << " ";
    }
    cout << "\n";

    cout << arr[(sizeof(arr)/sizeof(arr[0])/2)] << "\n";

    double avg = arr[0] + arr[sizeof(arr)/sizeof(arr[0])/2] + arr[sizeof(arr)/sizeof(arr[0])];
    cout << "Average is " << avg << "\n";

    int min = INT_MAX;
    int minIndex = -1;
    int max = INT_MIN;
    int maxIndex = -1;
    for (int i = 0; i < 19; i++) {
        if (arr[i] > max) {
            max = arr[i];
            maxIndex = i;
        }
        if (arr[i] < min) {
            min = arr[i];
            minIndex = i;
        }
    }

    cout << "The largest num is " << max << " and the smallest is " << min << "\n";
    int temp = arr[min];
    arr[min] = arr[max];
    arr[max] = temp;

    for (int i : arr) {
        cout << i << " ";
    }
    cout << "\n";

    for (int i = sizeof(arr)/sizeof(arr[0]); i < sizeof(arr)/sizeof(arr[0])/2; i--) {
        arr[i] = arr[i-1];
    }
    arr[sizeof(arr)/sizeof(arr[0])/2] = (rand() % 10) + 1;

    for (int i = 0; i < 20; i++) {
        arr[i] += 10;
    }
    for (int i : arr) {
        cout << i << " ";
    }
    cout << "\n";

    cout << arr[2] << "\n";
    arr[2] = 5;

    for (int i : arr) {
        if (i >= 50 && i < 60) {
            cout << i << " ";
        }
    }
    cout << "\n";

    for (int i : arr) {
        if (i % 4 == 0) {
            cout << i << " ";
        }
    }
    cout << "\n";
}