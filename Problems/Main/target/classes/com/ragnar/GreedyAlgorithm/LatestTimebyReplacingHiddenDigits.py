class Solution:
    def maximumTime(self, time: str) -> str:
        time = list(time)
        for i in range(len(time)):
            if time[i] == '?':

                if i == 0 and time[1] == '?':
                    time[i] = '2' 

                elif i == 0 and int(time[1]) <= 3:
                    time[i] = "2"
                elif i == 0 and int(time[1]) > 3:
                    time[i] = "1"

                elif i == 1 and int(time[0]) == 1:
                    time[i] = '9'
                elif i == 1 and int(time[0]) == 0:
                    time[i] = '9'

                elif i == 1 and int(time[0]) == 2:
                    time[i] = "3"

                if i == 4:
                    time[i] = '9'
                if i == 3:
                    time[i] = '5'
        return ''.join(time)
a = Solution()
time = "0?:3?"
print(a.maximumTime(time))