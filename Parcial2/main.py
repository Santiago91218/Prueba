#Importamos Funciones
import Funciones
#Declaracion de variables
matrix_dna=[]
condition=False

while condition==False:
    #Condiciones que debe tener el ADN ingresado
    print("Condiciones que debe tener el ADN ingresado: \n"
        "-Letras Permitidas: A,T,C,G                    \n"
        "-Ingresar 6 letras                             \n")
    
    #Llamamos a la funcion para ingresar ADN
    Funciones.enter_dna(matrix_dna)

    #Condicion que verifica si la matriz es 6x6
    if len(matrix_dna) == 6:
        condition = True

print(f"Matriz de ADN ingresada: {matrix_dna}")