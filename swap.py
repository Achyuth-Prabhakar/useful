def swap (num1, num2):
    temp = num1
    num1 = num2
    num2 = temp
    print ("Inside function)")
    print (f"num1 = {num1}")
    print (f"num2 = {num2}")
    return num1,num2

n1 = 27
n2 = 32
print ("before swap")
print (f"n1 = {n1}")
print (f"n2 = {n2}")
n1, n2 = swap (n1,n2)
print ("After swap")
print (f"n1 = {n1}")
print (f"n2 = {n2}")
