n=input()
def odd(n):
    if n%2==0:
        print("Even")
    elif n%2!=0 and n>0:
        print("Odd")
    else:
        print("Invalid")
odd(n)
