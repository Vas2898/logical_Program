class Logical:
    def div(self,no):
        di = 2
        count = 0

        while (no > di):
            if(no % di == 0):
                print(di)
                count +=1
            di += 1

        print("count"+str(count))
        if count == 0:
            print("Prime Number")
        else:
            print("Not Prime")
            
div = Logical()
number = int(input("Enter Number"))
div.div(number)
