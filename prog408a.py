# Import time, your sorting library, and your helper class
import time
import SortingAlgorithms

class Student:
    def __init__(self, i, s):
        self.score = s
        self.id = i

    def __lt__(self, other):
        return self.score < other.score


def main():
    try:
        data = []
        with open("data/prg408a.txt", 'r') as f:
            lines = f.readlines()
            for line in lines:
                i, s = line.split(' ')
                i = int(i)
                s = int(s)
                # make helper class objects and add to data
                curStudent = Student(i, s)
                data.append(curStudent)
        sort = SortingAlgorithms.SortingAlgorithms()
        dataBubble = data[:]
        start = time.perf_counter()
        sort.bubbleSort(dataBubble)
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Bubble Sort: " + str(total))

        dataSelect = data[:]
        start = time.perf_counter()
        sort.selectionSort(dataSelect)
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Selection Sort: " + str(total))

        dataInsert = data[:]
        start = time.perf_counter()
        sort.selectionSort(dataInsert)
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Insertion Sort: " + str(total))

        ...
    except Exception as e:
        print("Error: ", e)

    pass

if __name__ == "__main__":
    main()