#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

int main() {
    int a = 29;
    int b = 15;
    int bitAND = a & b;
    cout << "a & b: " << bitAND << endl;
    int bitOR = a | b;
    cout << "a | b: " << bitOR << endl;
    int bitXOR = a ^ b;
    cout << "a ^ b: " << bitXOR << endl;
    int bitNOT = ~a;
    cout << "~a: " << bitNOT << endl;
    int bitLEFT = a << 2;
    cout << "a << 2: " << bitLEFT << endl;
    int bitRIGHT = b >> 2;
    cout << "b >> 2: " << bitRIGHT << endl;

    int x = 0b11001010;
    x = x & 0b11110111;
    cout << endl << "Cleared 4th bit of y: " << x << endl;
    x = 0b11001010;
    x = x | 0b00000100;
    cout << "Set 2nd bit of y: " << x << endl;
    x = 0b11001010;
    x = x ^ 0b01000000;
    cout << "Toggled 6th bit of y: " << x << endl;
    x = 0b11001010;
    x = x & 0b00111000;
    x = x >> 3;
    cout << "Extracted 2nd to 4th bit of y: " << x << endl;

    int m = 5;
    int n = 9;
    n = n << 8;
    int packed = m + n;
    cout << endl << "Packed value: " << packed << endl;
    m = packed & 0b0000000011111111;
    n = packed & 0b1111111100000000;
    n = n >> 8;
    cout << "Original m: " << m << endl;
    cout << "Original n: " << n << endl;
    int y = 75;
    int bit1 = y & 0b00000010;
    bit1 = bit1 >> 1;
    int bit4 = y & 0b00010000;
    bit4 = bit4 >> 4;
    if (bit1 == 1) {
        y = y | 0b00010000;
    } else {
        y = y & 0b11101111;
    }
    if (bit4 == 1) {
        y = y | 0b00000010;
    } else {
        y = y & 0b11111101;
    }
    cout << "Flipped bits 1 and 4 of y: " << y << endl;
}

/*
a & b: 13
a | b: 31
a ^ b: 18
~a: -30
a << 2: 116
b >> 2: 3

Cleared 4th bit of y: 194
Set 2nd bit of y: 206
Toggled 6th bit of y: 138
Extracted 2nd to 4th bit of y: 1

Packed value: 2309
Original m: 5
Original n: 9
Flipped bits 1 and 4 of y: 89
*/