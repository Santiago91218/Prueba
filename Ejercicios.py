#1 Crea una variable llamada y asígnale un número entero de tu elección.
numero1=100

#2 crea una variable llamada "numero2" asignándole un número decimal de tu elección.
numero2=25.5

#3 Crear una variable llamada "suma" y almacena la suma de "numero1" y "numero2".
suma=numero1+numero2
print(f"El resultado de la suma es {suma}")

#4Ahora crear tres variables más. Una para resta, otra para multiplicación y otra para división. Imprime estas variables
resta=numero1-numero2
multiplicacion=numero1*numero2
division=numero1/numero2
print(f"resultado de la resta entre {numero1} y {numero2} es: {resta}")
print(f"resultado de la multiplicacion entre {numero1} y {numero2} es: {multiplicacion}")
print(f"resultado de la division entre {numero1} y {numero2} es: {division}")

#5 Crea una variable llamada "nombre" y asígnale tu nombre como valor
nombre="Santiago"

#6 Crea una variable llamada "precio" y asígnale un valor decimal que represente el precio de un artículo ficticio.
precio=4999.9

#7Ahora, sin borrar la variable anterior, crea una variable llamada "descuento" y asígnale un valor decimal
descuento=0.25

#8 Ahora, intenta calcular el precio final aplicando el descuento al precio original 
precio_final=precio*(1-descuento)
print(f"El precio final es: {precio_final}")

#9Crea una variable llamada "cadena" y asignale un texto
cadena="Hola Mundo"

#10 Sin borrar la variable "cadena", crea una nueva variable llamada "longitud". En ella, vas a almacenar la longitud en caracteres de la cadena 
longitud=len(cadena)

#11 Crea otra vez la variable llamada "precio" y dale un valor decimal, el que sea y conviértelo en número entero.
precio=150.37
precio=int(precio)

#12 Crea dos variables. Una se va a llamar "nombre" y la segunda "apellido" concaténalas en una tercera variable llamada "nombre_completo"
nombre="Santiago"
apellido="Comeglio"
nombre_completo=nombre+ " " + apellido
print(nombre_completo)

#13 Escribe tu edad en una variable. Increméntala en 5 y luego disminúyela en 10.
edad=18
print (f"Variable original: {edad}")
edad+=5
print (f"Variable sumandole 5: {edad}")
edad-=10
print (f"Variable restandole 10: {edad}")

#14 Crea una variable llamada "altura" que contenga con decimales, tu altura en metros y centímetros. Por ejemplo: 1.83. Multiplícala por 4 y luego divídela en 3.
altura=1.70
print (f"Variable original: {altura}")
altura*=4
print (f"Variable multiplicando x 4: {altura}")
altura/=3
print (f"Variable dividiendo por 3: {altura}")

#15 Crea una variable que contenga tu nombre completamente en mayúsculas. Después transfórmalo todo en minúsculas
nombre_completo2="SANTIAGO COMEGLIO"
print(nombre_completo2.lower())

#16 con la variable con el nombre en mayúsculas, aplica un método parecido para que se transforme todo en minúsculas excepto la primera letra
print(nombre_completo2.capitalize())