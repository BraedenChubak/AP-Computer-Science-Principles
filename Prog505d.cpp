#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

void hitRateDays(int hits[], int totals[]) {
    string days[7] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int totalHits = 0;
    for (int i = 0; i < 7; i++) {
        double rate = (double)hits[i] / (double)totals[i];
        cout << days[i] << ": " << rate << endl;
        totalHits += hits[i];
    }
    cout << "Total Hits: " << totalHits;
}

int main() {
    ifstream file;
    file.open("data/prog505d.txt");

    string curLine;
    int totalHitDays[7] = {0,0,0,0,0,0,0};
    int totalSwingDays[7] = {0,0,0,0,0,0,0};

    while (getline(file, curLine)) {
        string t = curLine;
        stringstream temp(curLine);
        vector<string> splitPerson;
        while (temp >> t) {
            splitPerson.push_back(t);
        }
        cout << splitPerson[0] << " " << splitPerson[1] << ": ";
        for (int i = 0; i < 7; i++) {
            int ind1 = 2+2*i;
            int ind2 = ind1+1;
            int hit = stoi(splitPerson[ind1]);
            int swing = stoi(splitPerson[ind2]);
            totalHitDays[i] += hit;
            totalSwingDays[i] += swing;
            double rate = (double)hit / swing;
            cout << rate << " ";
        }
        cout << endl;
    }
    hitRateDays(totalHitDays, totalSwingDays);
}
/*
Fred Sluggo: 0.5 0.25 0.333333 0.25 0 0 1 
Lydia Crusher: 0.666667 0.666667 0.8 0.4 0.25 1 0.25 
Braeden Boomer: 1 0.5 0.625 0.5 0.2 0.333333 0 
Noah Niller: 0.333333 0.571429 0.333333 0.75 0.5 0.333333 0.285714 
Ruben Romper: 0 0.333333 0.5 0.4 0.285714 0.375 0 
Lisa Longball: 1 0.5 0.714286 0.25 0.75 0.5 0.2 
Claire Corner: 0.25 0.666667 0.375 0.444444 0.8 0.333333 0.2 
Jared Just: 1 0.5 0.4 0.285714 0.125 1 0.333333 
Monday: 0.470588
Tuesday: 0.513514
Wednesday: 0.521739
Thursday: 0.395833
Friday: 0.355556
Saturday: 0.394737
Sunday: 0.324324
Total Hits: 113
*/