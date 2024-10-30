#include <stdio.h>
#include <math.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <stdlib.h>
#include <string>
#include <vector>
using namespace std;

string makeLowercase(string str) {
    string result = "";
    for (char c : str) {
        result += tolower(c);
    }
    return result;
}

int questionAndAnswer(int qNum, int r, vector<vector<string>> QnA) {
    cout << "Question " << qNum << ": ";
    cout << QnA.at(r).at(0) << " ";
    string ans;
    cin >> ans;
    ans = makeLowercase(ans);
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

    string curLine;
    vector<vector<string>> QnA;
    int rowCount = 0;
    int colCount = 0;

    srand(time(NULL)); // initializes random seed

    while (getline(file, curLine)) {
        string q = curLine;
        string a;
        getline(file, a);
        vector<string> singleQNA;
        singleQNA.push_back(q);
        singleQNA.push_back(a);
        QnA.push_back(singleQNA);
    }

    const int QUESTION_COUNT = QnA.size();

    cout << "How many questions do you want to answer? (NO MORE THAN " << QUESTION_COUNT << "): ";
    int numQ;
    cin >> numQ;
    while (numQ > QUESTION_COUNT) {
        // the game never repeats a question so this loop ensures no out of bounds exceptions
        cout << "Too many questions, try again! ";
        cin >> numQ;
    }

    int score = 0;
    vector<int> usedQs;
    for (int i = 1; i <= numQ; i++) {
        int r = rand() % QUESTION_COUNT;
        bool duplicateFlag = true;
        int check;
        while (duplicateFlag) {
            check = 0;
            for (int i : usedQs) {
                if (r == i) {
                    check = 1;
                }
            }
            if (check == 0) {
                duplicateFlag = false;
            } else {
                r = rand() % QUESTION_COUNT;
            }
        }
        score += questionAndAnswer(i, r, QnA); // 1 if right, 0 if wrong
        usedQs.push_back(r);
    }
    cout << "Your total score is " << score << " out of " << numQ << endl;
}
/*
How many questions do you want to answer? (NO MORE THAN 20): 25
Too many questions, try again! 30
Too many questions, try again! 15
Question 1: What is a portable personal computer commonly called? Laptop
Correct!
Question 2: What country did the United States buy Louisiana from? France
Correct!
Question 3: What continent is India in? Asia
Correct!
Question 4: What is the largest country in the world? Russia
Correct!
Question 5: How many quarters are in $3.75? 15
Correct!
Question 6: What is the shortest month? fEbRuArY
Correct!
Question 7: What year did Super Mario 64 release? 1996
Correct!
Question 8: What fast food chain used to be known for their "$5 footlong"? subway
Correct!
Question 9: What language is this game programmed in? c++
Correct!
Question 10: Which Canadian province is most well-known for speaking French? quebec
Correct!
Question 11: What is the capital city of Wisconsin? Madison
Correct!
Question 12: What is another word for 12:00 AM? midnight
Correct!
Question 13: What is the maximum score someone can get on an AP test? 5
Correct!
Question 14: If 4x + 2y = 12 and x - y = -3, what is x equal to? 1
Correct!
Question 15: What kind of triangle has two sides of equal length? isosceles
Correct!
Your total score is 15 out of 15
*/