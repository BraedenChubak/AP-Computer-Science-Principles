#include <stdio.h>
#include <vector>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    int num;
    int steps = 0;
    cout << "Enter a number: ";
    cin >> num;
    while (num != 1) {
        if (num % 2 == 0) {
            cout << num << " is even, so I take half = " << (num / 2) << "\n";
            num /= 2;
            steps++;
        } else {
            cout << num << " is odd, so I take 3n+1 = " << (3 * num + 1) << "\n";
            num = 3 * num + 1;
            steps++;
        }
    }
    cout << "The process took " << steps << " steps to reach 1.";
}
/*
Enter a number: 17
17 is odd, so I take 3n+1 = 52
52 is even, so I take half = 26
26 is even, so I take half = 13
13 is odd, so I take 3n+1 = 40
40 is even, so I take half = 20
20 is even, so I take half = 10
10 is even, so I take half = 5
5 is odd, so I take 3n+1 = 16
16 is even, so I take half = 8
8 is even, so I take half = 4
4 is even, so I take half = 2
2 is even, so I take half = 1
The process took 12 steps to reach 1.
*/