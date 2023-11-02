def enter_dna(matrix):
        #Verificamos si la matriz es 6x6
        if len(matrix) < 6:
            #Le pedimos al usuario que ingrese el ADN
            dna= input("Ingrese el ADN: ").upper()
            #Funcion para quitar espacios en en ADN ingresado
            dna= quit_spaces(dna)
            #Llamamos a las dos funciones que verifican si el ADN es valido
            if validate_letter_dna(dna) and validate_size_dna(dna):
                print(f"ADN valido: {dna}")
                #Si el ADN es valido lo añadimos a la matriz
                matrix.append(dna)
                print("--------------------------------")
            else:
                #Si el ADN es invalido, pedimos que lo ingrese nuevamente
                print("ADN invalido.Ingrese otro ADN")
                print("--------------------------------")
        else:
            #Finalizamos si la matriz es 6x6
            print("La matriz ya contiene 6 cadenas ")
            return

#Funcion para quitar espacios en el String ingresado
def quit_spaces(dna_spaces):
    letters = dna_spaces.split() 
    dna = "".join(letters)
    return dna

#Funcion para ver si las letras ingresadas en el String son validas
def validate_letter_dna(dna):
    condition = True
    for i in dna:
        if i not in "ATCG":
            condition = False
            break
    return condition

#Funcion para ver si el String tiene 6 letras
def validate_size_dna(dna):
    return len(dna) == 6

