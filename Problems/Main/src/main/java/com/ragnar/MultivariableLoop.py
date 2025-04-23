# for i, j, k in zip(range(1,50), range(99,50,-1), range(101,150)):
#     print(i,j,k)

# for(int i=0,j=100;i<=j;i++,j--){
# } for java
class Solution:
    def reverseDegree(self, s: str) -> int:
        letter = "zyxwvutsrqponmlkjihgfedcba"
        res = 0
        index = 1
        for i in range(len(s)):
            res += (letter.index(s[i])+1) * index
            index += 1
        return res
a= Solution()
print(a.reverseDegree("abc"))