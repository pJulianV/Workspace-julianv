print("welcome")

bill_value = float(input("What was the total bill?: " ))
tip_porcentage = int(input("How much tip would you like to give?(10, 12 or 15): " ))

split = int(input("How many people to split the bill?: " ))


total_tip =  bill_value / 100 * tip_porcentage

total_each = (bill_value + total_tip ) / split
final_amount = round(total_each, 2)
total = print(f"Each person should pay: ${final_amount}")


# largeNumber
# print(123_332_123_761)


# print("Number of letter" + str(len(input("Ingresa tu nombre"))))