## jugar -> while s - > ingrsar - > random radiant- > - >judar puntaje

import random


jugar = "s"
jugador = 0
maquina = 0
while jugar.lower() == "s":
    
    eleccion = input("Eligir (piedra, papel, tijera): ")
    eleccion = eleccion.lower()
    j = random.randint(1,3)
    if j == 1:
        eleccion_maquina = "piedra"
        print("Maquina eligio piedra")
    elif j == 2:
        eleccion_maquina = "papel"
        print("Maquina eligio papel")
    elif j == 3:
        eleccion_maquina = "tijera"
        print("Maquina eligio tijera")

    if eleccion == "piedra":
        if eleccion_maquina == "piedra":
            print('Empate (no se acumulan puntos)')
        elif eleccion_maquina == "papel":
            print('Pierdes esta ronda')
            maquina = maquina +1
        elif eleccion_maquina == "tijera":
            print('!Ganas esta ronda¡')
            jugador = jugador + 1

    elif eleccion == "papel":
        if eleccion_maquina == "piedra":
            print('!Ganas esta ronda¡')
            jugador = jugador + 1
        elif eleccion_maquina == "papel":
            print('Empate (no se acumulan puntos)')            
        elif eleccion_maquina == "tijera":
            print('Pierdes esta ronda')
            maquina = maquina +1

    elif eleccion == "tijera":
        if eleccion_maquina == "piedra":
            print('Pierdes esta ronda')
            maquina = maquina +1
        elif eleccion_maquina == "papel":
            print('!Ganas esta ronda¡')  
            jugador = jugador + 1          
        elif eleccion_maquina == "tijera":
            print('Empate (no se acumulan puntos)')
    
    
    print(f"Marcador: Tu {jugador} - {maquina} Maquina\n")

    jugar = input("¿Jugar otra ronda? (s/n)")
    