string1 = "gasdasdadas"

# for i in range(0, len(string1)):
#     print(i)

i = 1
string1
s_index = string1.index("s")
l2 = string1[s_index:]
l3 = string1[s_index:-1]
l4 = string1[s_index:-2]
neg_index = -(len(string1) - i) 



# print(neg_index, string1[neg_index])
# print(i, string1[i])
# print(string1[neg_index])
# print(l2)
# print(l3)
# print(l4)



my_string = "Hello, world! This is a test."

# Extract characters from index 7 (inclusive) up to index 12 (exclusive)
substring1 = my_string[7:12]
print(substring1)

# Extract characters from the beginning up to index 5 (exclusive)
substring2 = my_string[:5]
print(substring2)

# Extract characters from index 15 (inclusive) to the end
substring3 = my_string[15:]
print(substring3)

# Extract characters using negative indices
# -1 refers to the last character, -6 refers to the sixth-to-last character
substring4 = my_string[-6:-1]
print(substring4)