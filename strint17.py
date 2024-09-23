def frequent_char(s):
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    nums = [0] * 26

    for char in s:
        index = alphabet.index(char)
        nums[index] += 1

    max_count = max(nums)
    max_char_index = nums.index(max_count)
    return alphabet[max_char_index]


if __name__ == "__main__":
    mystr = input("Enter a string: ").lower()
    print(frequent_char(mystr))

'''
Enter a string: aaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbccccccccceeeedddddddddd
b
'''