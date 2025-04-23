from collections import Counter

s = "aaabbbcaccdd"

count = Counter(s)
print("".join(f"{char}{count[char]}" for char in count))