#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

string letterGrade(double g) {
    if (g >= 90) { return "A"; }
    else if (g >= 80) { return "B"; }
    else if (g >= 70) { return "C"; }
    else if (g >= 60) { return "D"; }
    else return "F";
}

int main() {
    ifstream file;
    file.open("data/prog505b.txt");

    string curPerson;
    int countPeople;
    int curGrades[] = {0,0,0,0,0};
    string gradeList[] = {"A", "B", "C", "D", "F"};
    double avgTest[] = {0,0,0,0,0};
    int totalLetters[] = {0,0,0,0,0};

    while (getline(file, curPerson)) {
        countPeople++;
        string t = curPerson;
        vector<string> splitPerson;
        for (int i = 0; i < 6; i++) {
            splitPerson.push_back(curPerson);
            getline(file, curPerson);
        }
        splitPerson.push_back(curPerson);
        cout << splitPerson[0] << " " << splitPerson[1] << ":\t";
        double avgGrade = 0;
        for (int i = 0; i < 5; i++) {
            curGrades[i] = stoi(splitPerson[2+i]);
            avgTest[i] += curGrades[i];
            cout << curGrades[i] << " ";
            avgGrade += curGrades[i];
        }
        avgGrade /= 5.0;
        if (avgGrade >= 90) { totalLetters[0]++; }
        else if (avgGrade >= 80) { totalLetters[1]++; }
        else if (avgGrade >= 70) { totalLetters[2]++; }
        else if (avgGrade >= 60) { totalLetters[3]++; }
        else { totalLetters[4]++; }
        cout << "\t" << avgGrade << " " << letterGrade(avgGrade) << "\n";
    }
    for (int i = 0; i < 5; i++) {
        avgTest[i] /= (double)countPeople;
        cout << "Test " << i+1 << ":\t" << avgTest[i] << "\n";
    }
    for (int i = 0; i < 5; i++) {
        cout << gradeList[i] << "  " << totalLetters[i] << "\n";
    }
}
/*
Sam Lilly:      80 77 82 86 90  83 B
Fred Biggie:    70 72 88 90 93  82.6 B
Sally Awesome:  92 91 85 99 93  92 A
Test 1: 80.6667
Test 2: 80
Test 3: 85
Test 4: 91.6667
Test 5: 92
A  1
B  2
C  0
D  0
F  0
*/