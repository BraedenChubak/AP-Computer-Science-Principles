#include <stdio.h>
#include <vector>
#include <math.h>
#include <iostream>
using namespace std;

int main() {
    for (int i = -12; i < 17; i++) {
        int num = pow(i, 6);
        num -= 3 * pow(i, 5);
        num -= 93 * pow(i, 4);
        num += 87 * pow(i, 3);
        num += 1596 * pow(i, 2);
        num -= 1380 * i;
        num -= 2800;
        cout << i << "\t" << num << "\n";
    }
}
/*
-12     1897280
-11     982800
-10     453600
-9      173888
-8      45360
-7      0
-6      -6400
-5      0
-4      6048
-3      7280
-2      4320
-1      0
0       -2800
1       -2592
2       0
3       2240
4       0
5       -10800
6       -32032
7       -60480
8       -84240
9       -78400
10      0
11      217728
12      671840
13      1496880
14      2872800
15      5033600
16      8276688
*/