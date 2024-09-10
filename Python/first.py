#Expression execution
a,b=2,3
print(a+b*b) #11

a,b="2",3
txt="@"
print((a+txt)*3)
 
# Taking input from user and printing it
name = input("Name :")
age = int(input("Age :"))
print("my name is",name ,"and i am",age,"years old")

# Conditional statements
marks = int(input("Marks:"))
if(marks >= 90):
    print("Grade A")
elif(marks <=90 and marks >=70):
    print("Grade B")
elif(marks <=70 and marks >=50):
    print("Grade C")
else: 
    print("Fail")

# Ternary Operator/Single line if
attendance = int(input("Your attendance ="))
attend = "U r able" if attendance == 75 else "U r not able."
print(attend)