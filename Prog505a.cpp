#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>
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
    ifstream file;
    file.open("data/prog505a.txt");

    string curPerson;
    string topPerson;
    int book;
    int topPoints = 0;
    double totalPoints = 0;
    int peopleCount = 0;

    cout << "Name\t\tBooks\tPoints\n";
    while (getline(file, curPerson)) {
        string t = curPerson;
        stringstream temp(curPerson);
        vector<string> splitPerson;
        while (temp >> t) {
            splitPerson.push_back(t);
        }
        cout << splitPerson[0] << " " << splitPerson[1] << "\t";
        book = stoi(splitPerson[2]);
        cout << book << "\t" << func(book) << "\n";
        totalPoints += func(book);
        peopleCount++;
        if (func(book) > topPoints) {
            topPoints = func(book);
            topPerson = splitPerson[0] + " " + splitPerson[1];
        }
    }
    double avg = totalPoints / peopleCount;
    cout << "The average number of points per person is " << avg;
    cout << "\nThe winner is: " << topPerson;
}