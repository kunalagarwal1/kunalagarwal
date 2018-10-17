
ch=raw_input()
def vowel(ch):
    if (ch=='a' or ch=='A' or ch=='e' or ch=='E'or ch=='i' or ch=='I'
    or ch=='o' or ch=='O' or ch=='u' or ch=='U'):
        print("Vowel")
    elif(ch>'a' and ch<='z'):
        print("consonent");
    else:
        print("invalid");
vowel(ch)

