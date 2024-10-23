#include <stdio.h>
#include <math.h>
#include <iostream>
using namespace std;

int func(int books) {
    if (books <= 3) {
        return 10 * books;
    } else if (books <= 6) {
        return (10 * 3) + (15 * (books-3));
    } else {
        return (10 * 3) + (15 * 3) + (20 * (books - 6));
    }
}

int main() {
    
}