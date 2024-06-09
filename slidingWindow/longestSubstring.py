#distinct no. of element:
#it will return the number of unique elements in the string,
def howManyDistinctElement(str):
    return len(set(str))

def longestSubstring(str,k):
    start = 0
    finish = 0
    n = len(str)
    longestSubstring = ""
    while(finish<n):
        #when I will hit the size of window
        subStr = str[start:finish+1]
        if(howManyDistinctElement(subStr)<=k):
            if(len(longestSubstring)<len(subStr)):
                longestSubstring=subStr
        else:
            start+=1

        finish+=1
    return longestSubstring

#For k = 2, o/p is ‘bdbdbbd’
# For k = 3, o/p is ‘bcbdbdbbdcd’
# For k = 5, o/p is ‘abcbdbdbbdcdabd’

str = "abcbdbdbac"
k = 3
# print(longestSubstring(str,k))
print('bcbdbdb'==longestSubstring(str,k))