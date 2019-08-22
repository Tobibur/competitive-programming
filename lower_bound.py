# Find in a sorted array the lower bound of a number 'x' i.e first value >= 'x'
# eg. the lower bound of 4 in [2, 3, 5, 6, 9, 14] is 5

array = [2, 3, 5, 6, 9, 14]


def lowerBoundof(x):
    L = 0
    R = array.__len__()
    ans = -1
    while(L <= R):
        mid = L + (R-L) // 2
        if array[mid] >= x:
            ans = array[mid]
            R = mid - 1
        else:
            L = mid + 1
    return ans


num = 8
lower_bound = lowerBoundof(num)
print("Lower bound of", num, "is", lower_bound)
