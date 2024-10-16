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


    cout << arr[(sizeof(arr)/sizeof(arr[0])/2)] << "\n";

    double avg = arr[0] + arr[10] + arr[19];
    avg /= 3;
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
    int temp1 = arr[min];
    arr[min] = arr[max];
    arr[max] = temp1;

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

    bool is60 = false;
    for (int i : arr) {
        if (i == 60) {
            is60 = true;
        }
    }
    if (is60) {
        cout << "There IS a 60 in the list\n";
    } else {
        cout << "There IS NOT a 60 in the list\n";
    }

    bool palindrome = true;
    for (int i = 0; i < sizeof(arr)/sizeof(arr[0])/2; i++) {
        if (arr[i] == arr[sizeof(arr)/sizeof(arr[0])-i]) {
            palindrome = false;
        }
    }
    

    if (palindrome) {
        cout << "The list IS the same back to front as it is front to back\n";
    } else {
        cout << "The list IS NOT the same back to front as it is front to back\n";
    }

    avg = 0;
    for (int i : arr) {
        avg += i;
    }
    avg /= sizeof(arr)/sizeof(arr[0]);
    int aboveAvg = 0;
    for (int i : arr) {
        if (i > avg) {
            aboveAvg++;
        }
    }
    cout << "The number of nums above the average: " << aboveAvg << "\n";

    int evenCount = 0;
    for (int i : arr) {
        if (i % 2 == 0) {
            evenCount++;
        }
    }
    cout << "The number of even nums is " << evenCount << "\n";

    int revArr[20];
    for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
        revArr[i] = arr[19-i];
    }
    for (int i : revArr) {
        cout << i << " ";
    }
    cout << "\n";

    int temp = arr[19];
    for (int i = sizeof(arr)/sizeof(arr[0])-1; i >= 0; i--) {
        arr[i+1] = arr[i];
    }
    arr[0] = temp;
    for (int i : arr) {
        cout << i << " ";
    }
    cout << "\n";

    int sum = 0;
    for (int i : arr) {
        int realI = i;
        while (realI >= 10) {
            sum += realI / 10;
            realI /= 10;
        }
        sum += realI;
    }
    cout << "The sum of all the digits in the array is " << sum;
    return 0;
}
/*
46 53 57 22 55 57 73 78 58 33 49 79 85 40 86 40 27 61 42 
49
Average is 31.6667
The largest num is 86 and the smallest is 22
46 53 57 22 55 57 73 78 58 33 49 79 85 40 86 40 27 61 42 0 
56 63 67 32 65 67 83 88 68 43 15 89 95 50 96 50 37 71 52 10 
67
56 50 50 52 
56 32 88 68 96 52 
There IS NOT a 60 in the list
The list IS the same back to front as it is front to back
The number of nums above the average: 10
The number of even nums is 9
10 52 71 37 50 96 50 95 89 15 43 68 88 83 67 65 32 5 63 56 
10 56 63 5 32 65 67 83 88 68 43 15 89 95 50 96 50 37 71 52 
*/