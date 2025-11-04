import random

# TODO Simulador Basi de lanzamient de dado 
'''
Creas un programa que pregunte al usuario cuantas veces desea lanzar un dado de 6 caras y luego muestre el resultado de cada uno de esos lanzamientos en la pantalla.         

Requisitos 
1 TODOX Preguntas al usuario: El programa debe solicitar al usuario que introduzca un niumero entero, que corresponda  a la cantidad de veces que se lanzara el dado

2- TODO Simular los lanzamientos : utiliza un bucle para repetir la accion de lanzar e ldado el numero  de veces que el usuario indico

3. Mostrar cada resultado Dentro del buble , en  cada repeticion, el programa debe: 
Generar un numero aleatorio entre 1 - 16
Mostrar inmediatamente elresultado de ese lanzamiento en pantalla.
'''

def lanzar(cantidad):
    pivot = 1
    results = []
    while pivot < cantidad+1:

        j = random.randint(1,6)
        print(f"Lanzamiento {pivot}: Ha salido un {j}")
        results.append(j)
        pivot = pivot + 1 


cantidad_lanzamientos = int(input("Ingrese cantidad de lanzamientos: "))

lanzar(cantidad_lanzamientos)