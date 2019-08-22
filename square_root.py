# Find the square root of a given number


def squareRootof(num):
    L = 0
    R = num
    while R >= L:
        mid = L + (R-L) // 2
        if(mid**2 == num):
            return mid
        elif(mid**2 > num):
            R = mid - 1
        else:
            L = mid + 1
    return -1


print("Enter a number:")
num = int(input()) # eg: 25
sqr = squareRootof(num)
if(sqr != -1):
    print("Square root of", num, "is", sqr)
else:
    print("Square root is not available in", num)
