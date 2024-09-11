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
String hello = "Hello there!";
```





___





# 3. Console I/O

There are two main ways to do I/O in C++

You can use `<iostream>`, which gives you the functions `cin` and `cout`, which work somewhat similarly to Java's print function and Scanner respectively

```cpp
#include <iostream>

String text = "";
cout << "Enter your text: ";
cin >> text;
cout << "The text inputted was: " << text;
```

The other way to do I/O in C++ is to use `<stdio.h>`, which gives you the functions `printf` and `scanf`, which work similarly to the functions of the same name from C.







___





# 4. Arithmetic Operations

???





___





# 5. Assignment Operations

???





___





# 6. Comments

???





___





# 7. Decision Structures

???





___





# 8. Conditional Operators

???





___





# 9. Logic Operators

???





___





# 10. Advanced Decision Structures

???





___





# 11. String Methods

???





___





# 12. Random Generation

???





___





# 13. Looping Structures

???





___





# 14. Functions/Methods

???





___





# 15. Elementary Data Structures

???





## 15.1 Arrays/Lists

???






## 15.2 Matrices

???





___





<!-- 
EVERYTHING BELOW IS OPTIONAL; 
UNCOMMENT BY REMOVING THE ARROW TAGS SURROUNDING
(i.e., delete the "< !--" and "-- >" tags)

CHANGE THE SECTION NUMBERS AS DESIRED
-->

<!-- # 16. Major Keywords

???





___ -->





<!-- # 17. Error Handling

???





___ -->





<!-- # 18. Working with Files

???





___ -->





<!-- # 19. Major Language Features

???







## 19.1 Classes

???





## 19.2 Inheritance

???





## 19.3 Generic Typing (Templates)

???





## 19.4 Pointers

???





___ -->





<!-- # 20. Importing Local Libraries

???





___ -->





<!-- # 21. Working with Time

???





___ -->





<!-- # 22. Importing Libaries from Package managers

???





___ -->





<!-- # 23. Bitwise Operators

???





___ -->





<!-- # 24. Common Data Structures

???





___ -->





<!-- # 25. Advanced Language Features

???





___ -->





# References

* [Markdown Cheatsheet](https://gist.github.com/jonschlinkert/5854601)
* [description](http://example.com)

