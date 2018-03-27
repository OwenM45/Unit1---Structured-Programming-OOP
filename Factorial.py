while True:
    
    #get juser Input
    uInput = input("Enter the number you want to process: ")

    #loop through the number
    def findFactorial(num,r):
        if (num > 0):
            r += r*(num - 1)
            num -= 1
            findFactorial(num,r)
        else:
            #print result
            print(str(r))

    #set the user input as the number to find the factorial of
    findFactorial(int(uInput),1)
        






