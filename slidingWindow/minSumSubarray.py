
def arrSum(arr):
    return sum(arr)


def minSumSubarray(arr,k):
    n = len(arr)
    start = 0
    finish = 0 
    currSum = 0
    maxSum = -1000

    while(finish < n):
        #when window size is hit
        window_size = finish - start + 1 
        if(window_size==k):
            currSum = arrSum(arr[start:finish+1])
            if maxSum < currSum:
                maxSum = currSum 

            start+=1

        finish += 1

    return maxSum

arr = [10, -5, 6, 3, 8, 1]
k = 3
print(minSumSubarray(arr,k))
#17