#include <stdio.h>
#include <vector>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    cout << "Number\tSquare\tSquare Root\tCube\tFourth Root\n";
    for (int i = 1; i < 21; i++) {
        int square = pow(i, 2);
        int cube = pow(i, 3);
        double sqRoot = pow(i, 1/2.0);
        double fourRoot = pow(i, 1/4.0);
        cout << i << "\t" << square << "\t" << sqRoot << "\t\t" << cube << "\t" << fourRoot << "\n"; 
    }
}
/*
Number  Square  Square Root     Cube    Fourth Root
1       1       1               1       1
2       4       1.41421         8       1.18921
3       9       1.73205         27      1.31607
4       16      2               64      1.41421
5       25      2.23607         125     1.49535
6       36      2.44949         216     1.56508
7       49      2.64575         343     1.62658
8       64      2.82843         512     1.68179
9       81      3               729     1.73205
10      100     3.16228         1000    1.77828
11      121     3.31662         1331    1.82116
12      144     3.4641          1728    1.86121
13      169     3.60555         2197    1.89883
14      196     3.74166         2744    1.93434
15      225     3.87298         3375    1.96799
16      256     4               4096    2
17      289     4.12311         4913    2.03054
18      324     4.24264         5832    2.05977
19      361     4.3589          6859    2.0878
20      400     4.47214         8000    2.11474
*/