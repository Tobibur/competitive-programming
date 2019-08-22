# Given a sorted array find a given value position.

def findPositionOf(x):
    L = 0
    R = array.__len__()

    while R >= L:
        mid = L + (R-L) // 2
        if(array[mid] == x):
            return mid
        else:
            if(array[mid] >= x):
                R = mid-1
            else:
                L = mid + 1
    return -1


array = [1, 3, 5, 6, 7, 9]
x = 7
position = findPositionOf(x)
print("X is in position",position)
