class SearchAlgorithms:
    def linearSearch(self, arr, target):
        for x in range(len(arr)):
            if target == arr[x]:
                return x
        return -1

    def binarySearch(self, arr, target):
        low = 0
        high = len(arr)

        while low <= high:
            mid = int((low + high) / 2)
            if arr[mid] == target:
                return mid
            elif arr[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        
        return -1


