class MergeSort:
    @staticmethod
    def sort(arr):
        if len(arr) > 1:
            mid = len(arr) // 2
            l = arr[:mid]
            r = arr[mid:]
            MergeSort.sort(l)
            MergeSort.sort(r)
            MergeSort.merge(arr, l, r)

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