# import time and searching library
import time
import SearchAlgorithms
import SortingAlgorithms

def main():
    try:
        data = []
        with open("data/prog408b.dat", 'r') as f:
            data = [int(line) for line in f]
        # TODO: your code here
        search = SearchAlgorithms.SearchAlgorithms()
        sort = SortingAlgorithms.SortingAlgorithms()
        target = int(input("Enter int to search for: "))

        start = time.perf_counter()
        print("Linear Search (unsorted): target found at index " + str(search.linearSearch(data, target)))
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Search time: " + str(total))

        sortedData = data[:]
        sort.insertionSort(sortedData)

        start = time.perf_counter()
        print("Linear Search (sorted): target found at index " + str(search.linearSearch(sortedData, target)))
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Search time: " + str(total))

        start = time.perf_counter()
        print("Binary Search: target found at index " + str(search.binarySearch(sortedData, target)))
        end = time.perf_counter()
        total = end - start;
        total = round(total, 8)
        print("Search time: " + str(total))

        ...
    except Exception as e:
        print("Error: ", e)

    pass

if __name__ == "__main__":
    main()