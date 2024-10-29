#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <stdlib.h>
#include <string>
#include <vector>
using namespace std;

int questionAndAnswer(int qNum, int qCount, vector<vector<string>> QnA) {
    cout << "Question " << qNum << ": ";
    int r = rand() % qCount;
    cout << QnA.at(r).at(0) << " ";
    string ans;
    cin >> ans;
    if (ans.compare(QnA.at(r).at(1)) == 0) {
        cout << "Correct!\n";
        return 1;
    } else {
        cout << "Incorrect!\n";
        return 0;
    }
}

int main() {
    ifstream file;
    file.open("data/QuizGameQnA.txt");

    const int QUESTION_COUNT = 20;
    string curLine;
    vector<vector<string>> QnA(QUESTION_COUNT, vector<string>(2, ""));
    int rowCount = 0;
    int colCount = 0;

    srand(time(NULL)); // initializes random seed

    while (getline(file, curLine)) {
        string t = curLine;
        QnA.at(rowCount).at(colCount) = t;
        colCount++;
        if (colCount > 1) {
            colCount = 0;
            rowCount++;
        }
    }

    cout << "How many questions do you want to answer? ";
    int numQ;
    cin >> numQ;

    int score = 0;
    for (int i = 1; i <= numQ; i++) {
        score += questionAndAnswer(i, QUESTION_COUNT, QnA); // 1 if right, 0 if wrong
    }
    cout << "Your total score is " << score << " out of " << numQ << endl;
}
/*
How many questions do you want to answer? 8
Question 1: Which country has the city of Warsaw? Poland
Correct!
Question 2: What year did Super Mario 64 release? 1996
Correct!
Question 3: What is the maximum score someone can get on an AP test? 5
Correct!
Question 4: What is the capital city of Wisconsin? Madison
Correct!
Question 5: What is the capital city of Wisconsin? Phoenix
Incorrect!
Question 6: How many quarters are in $3.75? 15
Correct!
Question 7: What is the capital city of Wisconsin? Madison
Correct!
Question 8: What year did Super Mario 64 release? 1996
Correct!
Your total score is 7 out of 8
*/