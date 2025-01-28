class QuickSort:
    @staticmethod
    def sort(A, low=0, high=None):
        if high is None:
            high = len(A)-1
        if low < high:
            pivot = QuickSort.partition(A, low, high)
            QuickSort.sort(A, low, pivot-1)
            QuickSort.sort(A, pivot+1, high)
        return A
    
    @staticmethod
    def partition(A, low, high):
        pivot = A[high]
        i = low-1
        for j in range(low, high):
            if A[j] <= pivot:
                i += 1
                QuickSort.swap(A, i, j)
        QuickSort.swap(A, i+1, high)
        return i+1

    @staticmethod
    def swap(A, i, j):
        temp = A[i]
        A[i] = A[j]
        A[j] = temp
        # A[i], A[j] = A[j], A[i]
