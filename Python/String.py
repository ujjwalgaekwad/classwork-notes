# Defining strings
string1 = "Hello"
string2 = "World"

# Concatenation
concat_string = string1 + " " + string2  # "Hello World"

# Repetition
repeated_string = string1 * 3  # "HelloHelloHello"

# Indexing
first_char = string1[0]  # "H"

# Slicing
substring = string1[1:4]  # "ell"

# Length
length_of_string = len(string1)  # 5

# Upper and Lower case
uppercase = string1.upper()  # "HELLO"
lowercase = string2.lower()  # "world"

# Strip
whitespace_string = "   Python   "
stripped_string = whitespace_string.strip()  # "Python"

# Find and Replace
find_index = concat_string.find("World")  # 6
replaced_string = concat_string.replace("World", "Python")  # "Hello Python"

