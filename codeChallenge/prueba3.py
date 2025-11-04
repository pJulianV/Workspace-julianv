## 


entrada = input("Ingrese zona (residencial, comercial, industril) con espacio numero de pisos: ")
entrada = entrada.split(" ")
entrada[1] = int(entrada[1])

tipo_zona = entrada[0]
tipo_zona = tipo_zona.lower()

pisos = entrada[1]

if tipo_zona == "residencial":
    if pisos == 1:
        print(0)
    elif pisos > 1 and pisos <6:
        print(1)
    elif pisos > 5 and pisos <11:
        print(2)
    elif pisos > 10 and pisos <16:
        print(3)
    elif pisos > 15 and pisos <21:
        print(4)
elif tipo_zona == "comercial":
    if pisos == 1:
        print(0)
    elif pisos > 1 and pisos <8:
        print(1)
    elif pisos > 7 and pisos <15:
        print(2)
    elif pisos > 14 and pisos <21:
        print(3)

elif tipo_zona == "industrial":
    if pisos == 1:
        print(0)
    elif pisos > 1 and pisos <5:
        print(1)
    elif pisos > 5 and pisos <9:
        print(2)
    elif pisos > 9 and pisos <13:
        print(3)
    elif pisos > 12 and pisos <17:
        print(4)
    elif pisos > 16 and pisos <21:
        print(5)