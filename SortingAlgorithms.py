class SortingAlgorithms:

    def bubbleSort(self, arr):
        for i in range(len(arr)):
            for j in range(len(arr)-i-1):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]

    def selectionSort(self, arr):
        for i in range(len(arr)-1):
            minIndex = i
            for j in range(i+1, len(arr)):
                if arr[j] < arr[minIndex]:
                    minIndex = j
            arr[i], arr[minIndex] = arr[minIndex], arr[i]

    def insertionSort(self, arr):
        for i in range(1, len(arr)):
            key = arr[i]
            j = i - 1
            while j >= 0 and arr[j] > key:
                arr[j+1] = arr[j]
                j -= 1
            arr[j+1] = key

    @staticmethod
    def quicksort(A, low=0, high=None):
        if high is None:
            high = len(A)-1
        if low < high:
            pivot = SortingAlgorithms.partition(A, low, high)
            SortingAlgorithms.sort(A, low, pivot-1)
            SortingAlgorithms.sort(A, pivot+1, high)
        return A
    
    @staticmethod
    def partition(A, low, high):
        pivot = A[high]
        i = low-1
        for j in range(low, high):
            if A[j] <= pivot:
                i += 1
                SortingAlgorithms.swap(A, i, j)
        SortingAlgorithms.swap(A, i+1, high)
        return i+1

    @staticmethod
    def swap(A, i, j):
        temp = A[i]
        A[i] = A[j]
        A[j] = temp
        # A[i], A[j] = A[j], A[i]

    @staticmethod
    def merge_sort(arr):
        if len(arr) > 1:
            mid = len(arr) // 2
            l = arr[:mid]
            r = arr[mid:]
            SortingAlgorithms.merge_sort(l)
            SortingAlgorithms.merge_sort(r)
            SortingAlgorithms.merge(arr, l, r)

    @staticmethod
    def merge(arr, l, r):
        i = 0
        j = 0
        k = 0
        while i < len(l) and j < len(r):
            if l[i] < r[j]:
                arr[k] = l[i]
                i += 1
            else:
                arr[k] = r[j]
                j += 1
            k += 1
        while i < len(l):
            arr[k] = l[i]
            i += 1
            k += 1
        while j < len(r):
            arr[k] = r[j]
            j += 1
            k += 1

        