class SearchAlgorithms:
    def linearSearch(arr, target):
        for x in range(len(arr)):
            if target == arr[x]:
                return x
        return -1

    def binarySearch(arr, target):
        int low = 0
        int high = len(arr)

        while low <= high:
            int mid = (low + high) / 2
            if arr[mid] == x:
                return mid
            elif arr[mid] < x:
                low = mid + 1
            else:
                high = mid - 1
        
        return -1


