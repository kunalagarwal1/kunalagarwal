year=input()
def leapyear(year):
    if(year%400==0):
        print("Yes")
    elif(year%100!=0 and year%4==0):
        print("yes")
    else:
        print("no")
leapyear(year)
    
