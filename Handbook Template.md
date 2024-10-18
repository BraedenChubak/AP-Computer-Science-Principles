<h1>Handbook on Programming in C++</h1>

**AP Computer Science Principles 2023-2024**

Braeden Chubak

<!-- This is a comment (which will not be displayed in the live file);
replace all "???" with your own text. -->




___





<h1>Table of Contents</h1>

- [1. Compiling and Running](#1-compiling-and-running)
- [2. Data Types](#2-data-types)
- [3. Console I/O](#3-console-io)
- [4. Arithmetic Operations](#4-arithmetic-operations)
- [5. Assignment Operations](#5-assignment-operations)
- [6. Comments](#6-comments)
- [7. Decision Structures](#7-decision-structures)
- [8. Conditional Operators](#8-conditional-operators)
- [9. Logic Operators](#9-logic-operators)
- [10. Advanced Decision Structures](#10-advanced-decision-structures)
- [11. String Methods](#11-string-methods)
- [12. Random Generation](#12-random-generation)
- [13. Looping Structures](#13-looping-structures)
- [14. Functions/Methods](#14-functionsmethods)
- [15. Elementary Data Structures](#15-elementary-data-structures)
  - [15.1 Arrays/Lists](#151-arrayslists)
  - [15.2 Matrices](#152-matrices)
- [References](#references)

<!-- 
- [16. Major Keywords](#16-major-keywords)
- [17. Error Handling](#17-error-handling)
- [18. Working with Files](#18-working-with-files)
- [19. Major Language Features](#19-major-language-features)
  - [19.1 Classes](#191-classes)
  - [19.2 Inheritance](#192-inheritance)
  - [19.3 Generic Typing (Templates)](#193-generic-typing-templates)
  - [19.4 Pointers](#194-pointers)
- [20. Importing Local Libraries](#20-importing-local-libraries)
- [21. Working with Time](#21-working-with-time)
- [22. Importing Libaries from Package managers](#22-importing-libaries-from-package-managers)
- [23. Bitwise Operators](#23-bitwise-operators)
- [24. Common Data Structures](#24-common-data-structures)
- [25. Advanced Language Features](#25-advanced-language-features)
-->




___





# 1. Compiling and Running

Compiling and running C++ programs actually use 2 different commands. You need to install GCC, but afterwards, you can run `g++ -o <FILENAME>.exe <FILENAME>.cpp && ./<FILENAME>.exe` to both compile and run the program in just one line





___





# 2. Data Types

C++ programs commonly use the following primitive types

- `int` (integer) A whole number, can be positive or negative (4 bytes)
  - Integers can be signed or unsigned
  - Integers can also be short, long, or long long
  - Only one of each group can be used for each int
- `char` (character) One ASCII character (1 byte)
  - Can also be used as a byte data type, since a char is always exactly 1 byte in size
- `float` A single decimal number (4 bytes with 6 bits of precision)
- `double` A single decimal number, but twice as large, has more than double the precision (8 bytes with 15 bits of precision)
- `bool` (boolean) Either `true` or `false`

Instead of `final`, C++ uses `const`, but it does the same thing, making a variable unchangeable and constant.

```cpp
signed long int a = -476;
const char b = "b";
double c = 4.7891;
bool d = false;
```

On top of these primitive types, C++ has the very important non-primitive data type of `String`, which can be set and created like a primitive variable.

```cpp
#include <string> // string library required
string hello = "Hello there!";
// NOT CAPITALIZED!
```





___





# 3. Console I/O

There are two main ways to do I/O in C++

You can use `<iostream>`, which gives you the functions `cin` and `cout`, which work somewhat similarly to Java's print function and Scanner (from System.in) respectively

```cpp
#include <iostream>
#include <string>
using namespace std;

int main() {
  string text = "";
  cout << "Enter your text: ";
  cin >> text;
  cout << "The text inputted was: " << text << "\n";

  return 0;
}
/*
Enter your text: hello
The text inputted was: hello
*/
```

The other way to do I/O in C++ is to use `<stdio.h>`, which gives you the functions `printf` and `scanf`, which work similarly to the functions of the same name from C.  scanf CANNOT scan C++ strings, as they require importing `<string>` and are not natively a part of C++.

```cpp
#include <stdio.h>

int main() {
    int integer;
    printf("Enter an integer: ");
    scanf("%d", &integer);
    printf("Your integer is: %d", integer);

    return 0;
}
/*
Enter an integer: 14
Your integer is: 14
*/
```





___





# 4. Arithmetic Operations

`+` - Addition

`-` - Subtraction

`*` - Multiplication

`/` - Division

`%` - Modulus

___

## 4.1 Type Casting

There are two types of type casting in C++, implicit and explicit.

Implicit type casting is making one variable of one type be set to the value of a variable of another type.  This is done just like how you would set the values of variables normally.

```cpp
double pi = 3.14159;
int piConverted = pi; // implicit type cast
```

Explicit type casting is when you use parentheses to set one variable of one type to the value of another variable of a different type.

```cpp
double pi = 3.14159;
int piConverted = (int)pi; // explicit type cast
```
## 4.2 Math Functions

The `max` and `min` functions are natively included in C++

```cpp
int maximum = max(12, 4);
int minimum = min(12, 4);
```

The `abs` function is also included

```cpp
int absval = abs(-6);
```

C++ also has a `<cmath>` library, which adds the following functions:

```cpp
#include <cmath>

int sqrt64 = sqrt(64);
int roundedPI = round(3.1415926);
double log2 = log(2);
int square8 = pow(8, 2);
```


# 5. Assignment Operations

- `x = y` sets x equal to y
- `x += y` sets x equal to x + y
- `x -= y` sets x equal to x - y
- `x *= y` sets x equal to x * y
- `x /= y` sets x equal to x / y
- `x %= y` sets x equal to x % y

## 5.1 Bitwise Assignment Operations

- `x |= y` sets x equal to x | y
- `x ^= y` sets x equal to x ^ y
- `x >>= y` sets x equal to x >> y
- `x <<= y` sets x equal to x << y





___





# 6. Comments

There are multiplt ways to make comments in C++.

```cpp
// This is a single-line comment.

/*
This is a
multi-line
comment
*/

/* Properly
 * formatted
 * block
 * comment
 * usually for metadata (author, date, etc.)
 */
```
## 6.1 Documentation Comments 

Documentation Comments are used to show how methods work inside the code of a class.

```cpp
/**
 * Adds two numbers and returns the result.
 * 
 * @param x The first number.
 * @param y The second number.
 * 
 * @return  The sum of x and y.
 */
int addWithDocumentation(int x, int y) {
    return x + y;
}
```


___





# 7. Decision Structures

```cpp
if
{

}
else if
{

}
else
{

}
```





___





# 8. Conditional Operators

- `==` - exactly equal to
- `!=` - not equal to
- `<` - greater than
- `<=` - greater than or equal to
- `>` - less than
- `>=` - greater than or equal to

Extra operator specifically for strings
- `str1.compare(str2)` - compares str1 to str2, returns 0 if they're the same, <0 if str1 is larger or higher value, and >0 if str2 is larger or higher value.





___





# 9. Logic Operators

Logic Operators are used alongside Conditional Operators to make more complex true and false statements.

```cpp
x && y - AND (x AND y)
x || y - OR (x OR y)
!x - NOT (NOT x)
```

___

# 10. Bitwise Operators

Bitwise Operators compare the bits of both inputs and output a new set of bits based off of which operator is used

```cpp
& - AND (7 = 111, 4 = 100, 7 & 4 = 4)
| - OR  (7 = 111, 4 = 100, 7 | 4 = 7)
^ - XOR (7 = 111, 4 = 100, 7 ^ 4 = 3 = 011)
~ - NOT (4 = 100, ~4 = 0 = 000)
<< - LEFT SHIFT (4 = 100, 4 << 2 = 16 = 10000)
>> - RIGHT SHIFT (16 = 10000, 16 >> 2 = 4 = 100)
```
___


# 11. Advanced Decision Structures

Switch statements are a concise way to program multiple `if-else` statements.

```cpp
switch(expression) {
  case A:
    // runs if case A == true
    break; // break so next cases are not checked
  case B:
    // runs if case B == true
    break;
  default:
    // runs if case A == false && case B == false
```

There is also the ternary operator, which is essentially an `if-else` statement on one line (the `if` and `else` can only be one line each)

```cpp
int a = (a > 5) ? 5 : a;
// If a > 5, set a to 5, else leave a unchanged
```

___





# 12. String Methods

```cpp
substr(start, length);
length();
```

___





# 13. Random Generation

Before using the random number generator, you will want to use the `srand` function, usually as `srand(time(0))` or `srand(time(NULL))`, to seed the random number generator.  If you don't, the random number generator will always output the same numbers in the same order.

```cpp
srand(time(NULL)); // time(NULL) is # of seconds passed since January 1970
(rand() % (max-min+1)) + min // returns int between max and min inclusive
```

___





# 14. Looping Structures

There is the basic `for` loop, which works just like Java `for` loops.

```cpp
for (int i = 1; i <= 5; i++) {
  cout << i << " ";
}
// prints "1 2 3 4 5 "
```

There are also `for-each` loops, which also work work just like the Java loop of the same name.

```cpp
int arr[] = {1, 2, 3, 4, 5};
for (int i : arr) {
  cout << i << " ";
}
// prints "1 2 3 4 5 "
```

There is also the `while` loop, which also works just like the Java `while` loops.

```cpp
int i = 1;
while (i <= 5) {
  cout << i << " ";
  i++;
}
// prints "1 2 3 4 5 "
```





___





# 15. Functions/Methods

???





___





# 16. Elementary Data Structures

???





## 16.1 Arrays/Lists

???






## 16.2 Matrices

???





___





<!-- 
EVERYTHING BELOW IS OPTIONAL; 
UNCOMMENT BY REMOVING THE ARROW TAGS SURROUNDING
(i.e., delete the "< !--" and "-- >" tags)

CHANGE THE SECTION NUMBERS AS DESIRED
-->

<!-- # 17. Major Keywords

???





___ -->





<!-- # 18. Error Handling

???





___ -->





<!-- # 19. Working with Files

???





___ -->





<!-- # 20. Major Language Features

???







## 20.1 Classes

???





## 20.2 Inheritance

???





## 20.3 Generic Typing (Templates)

???





## 20.4 Pointers

???





___ -->





<!-- # 21. Importing Local Libraries

???





___ -->





<!-- # 22. Working with Time

???





___ -->





<!-- # 23. Importing Libaries from Package managers

???





___ -->





<!-- # 24. Bitwise Operators

???





___ -->





<!-- # 25. Common Data Structures

???





___ -->





<!-- # 26. Advanced Language Features

???





___ -->





# References

* [Markdown Cheatsheet](https://gist.github.com/jonschlinkert/5854601)
* [description](http://example.com)

