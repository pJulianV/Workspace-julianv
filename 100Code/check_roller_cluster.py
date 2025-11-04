height  = float(input("What is your height (cm)? "))



if height > 120:
    weight = float(input("What is your height (kg)?"))
    if weight < 200 :
        age = int (input("What is your age"))
        if age < 12:
            print("You pay $5 ")
            bill = 5
        elif age < 18:
            print("You pay $10 ")
            bill = 10
        else: 
            print("You pay $15 ")
            bill = 15
        photo= input("Do you want photo ?(it cost 3 ) yes (type y) or no (type m))")
        if photo.lower() == "y":
            bill = bill + 3

        print(f'You final bill is {bill}')
        
    else:
        print("Come back when your weight is normal")    
else:
    print("Too short, come back when you're taller")