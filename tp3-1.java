
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class declaradores_operadores {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner objeto = new Scanner(System.in);

        // EJERCICIO 1
        System.out.println("INGRESA UN NÚMERO ENTERO");
        int number = objeto.nextInt();
        if (number%2==0){
            System.out.println("ES PAR");
        }else{
            System.out.println("NO ES PAR");
        }

        //EJERCICIO 2
        /*

        int a;
        System.out.println("INGRESE UN NÚMERO ENTERO:");
        a = objeto.nextInt();
        if(a %10 ==0){
            System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 10");
        }
        */

        //EJERCICIO 3
        /*

        String a;
        System.out.println("INGRESE UNA LETRA: ");
        a =  objeto.nextLine();
        if (a == a.toUpperCase(Locale.ROOT)){
            System.out.println("La letra ingresada está en mayúscula");

        }
        else{
            System.out.println("La letra ingresada está en minúscula");
        } */
        //EJERCICIO 4
        /*

        int a,b;
        System.out.println("INGRESA UN NÚMERO: ");
        a = objeto.nextInt();
        System.out.println("INGRESA OTRO NÚMERO: ");
        b = objeto.nextInt();
        if(a == b){
            System.out.println("LOS DOS NÚMEROS SON IGUALES");
        }
        */

        //EJERCICIO 5
        /*

        int a,b;
        System.out.println("INGRESE UN NÚMERO: ");
        a = objeto.nextInt();
        System.out.println("INGRESA OTRO NÚMERO");
        b = objeto.nextInt();
        if(a >b){System.out.println("EL NÚMERO " + a+ " ES EL MAYOR DE AMBOS");} else{if(b>a){System.out.println("EL NÚMERO " + b + " ES EL MAYOR DE AMBOS");}else {System.out.println("AMBOS NÚMEROS SON IGUALES");}}
        */

        //EJERCICIO 6
        /*

        System.out.println("INGRESE UN NÚMERO: ");
        int a = objeto.nextInt();
        System.out.println("INGRESE OTRO NÚMERO: ");
        int b = objeto.nextInt();
        if(a%10 == b %10){
            System.out.println("LA ÚLTIMA CIFRA DE LOS DOS NÚMEROS ES LA MISMA, LA CUAL ES:  "+ a%10);
        } */

        // EJERCICIO 7
        /*

        System.out.println("INGRESA UN NÚMERO PARA COMPROBAR SI ES MÚLTIPLO DE 3 Y DE 5: ");
        int a = objeto.nextInt();
        if (a%3==0 & a%5==0){
            System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 3 Y DE 5");
        }
        else {
            if (a % 3 == 0) {
                System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 3");}
            else{
                    if (a % 5 == 0) {
                        System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 5");
                    }
                }
            }
        */
        //EJERCICIO 8
        /*
        System.out.println("INGRESA UN NÚMERO PARA COMPROBAR SI ES MÚLTIPLO DE 3 Y DE 2: ");
        int a = objeto.nextInt();
        if (a%3==0 & a%2==0){
            System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 3 Y DE 2");
        }
        else {
            if (a % 3 == 0) {
                System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 3");}
            else{
                if (a % 2 == 0) {
                    System.out.println("EL NÚMERO INGRESADO ES MÚLTIPLO DE 2");
                }
            }
        }
        */
        //EJERCICIO 9
        /*9. Programa que lea dos caracteres y compruebe si son iguales.

        char caracterOne, caracterTwo;

        System.out.print("Ingrese la primer letra: ");
        caracterOne = obj.next().charAt(0);

        System.out.print("Ingrese la segunda letra: ");
        caracterTwo = obj.next().charAt(0);

        System.out.print(caracterOne == caracterTwo ? "Los caracteres son iguales" : "Los caracteres no son iguales"); */

        //EJERCICIO 10
        /*10. Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas

        char caracterOne, caracterTwo, caracterOneAux, caracterTwoAux;

        System.out.print("Ingrese la primer letra: ");
        caracterOne = obj.next().charAt(0);

        System.out.print("Ingrese la segunda letra: ");
        caracterTwo = obj.next().charAt(0);

        caracterOneAux = Character.toLowerCase(caracterOne);
        caracterTwoAux = Character.toLowerCase(caracterTwo);

        System.out.print(caracterOne == caracterOneAux && caracterTwo == caracterTwoAux ? "Ambos caracteres estan en minuscula" : "Ambos caracteres estan no estan en minuscula"); */

        //EJERCICIO 11
        /*11. Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

        char caracter;
        int numCaracter;

        System.out.print("Ingrese una primer letra: ");
        caracter = obj.next().charAt(0);

        numCaracter = (int) caracter;

        System.out.print(numCaracter > 47 && numCaracter < 58 ? "El char es un número" : "El char no es un número"); */

        //EJERCICIO 12
        /*12. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        int num1, num2;
        double division;

        System.out.print("Ingrese el primer número: ");
        num1 = obj.nextInt();

        do{
            System.out.print("Ingrese el segundo número: ");
            num2 = obj.nextInt();

            if(num2 == 0){
                System.out.println("Error el divisor no puede ser cero");
            }
        }while(num2 == 0);

        division = (double) num1/num2;
        System.out.printf("%d / %d = %.2f", num1, num2, division); */

        //EJERCICIO 13
        /*13. Programa java para comprobar si un año es bisiesto.

        int anio;

        System.out.print("Ingrese el año para saber si es biciesto o no: ");
        anio = obj.nextInt();

        System.out.print(((anio%100 != 0 && anio%4 == 0) || anio%400 == 0) ? "El año es biciesto" : "El año no es biciesto"); */

        //EJERCICIO 14
        /* 14. Programa java para comprobar si un número entero de tres cifras es capicúa.

        int number, aux, firstNumber = 0, lastNumber = 0, counter = 0;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            number = obj.nextInt();

            if(number <= 0 || number > 999){
                System.out.println("El número ingresado es incorrecto");
            }
        }while(number <= 0 || number > 999);

        while(number>0){
            aux = number % 10;
            number = number / 10;

            if(counter == 0) {
                firstNumber = aux;
            }
            else{
                lastNumber = aux;
            }
            counter += 1;
        }

        System.out.print(lastNumber == firstNumber ? "El número es capicua" : "El número no es capicua"); */

        //EJERCICIO 15
        /*15. Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente,
        y comprueba si la hora que indican es una hora válida.

        int H, M, S;

        System.out.print("Ingrese la hora: ");
        H  = obj.nextInt();

        System.out.print("Ingrese los minutos: ");
        M = obj.nextInt();

        System.out.print("Ingrese los segundos: ");
        S = obj.nextInt();

        if(H < 0 || H > 24){
            System.out.print("La hora ingresada es incorrecta");
        } else if (M < 0 || M > 60) {
            System.out.print("Los minutos ingresados son incorrectos");
        } else if (S < 0 || S > 60){
            System.out.print("Los minutos segundos son incorrectos");
        } else {
            System.out.print("El horario ingresado es correcto");
                } */

        //EJERCICIO 16
        /*
        System.out.println("INGRESE UN AÑO: ");
        int year = obj.nextInt();
        System.out.println("INGRESE UN MES DEL AÑO Y SE LE DIRÁ CUANTOS DÍAS TIENE: ");
        int mounth = obj.nextInt();

        if (mounth == 1 || mounth==3 || mounth==5 || mounth==7 || mounth ==8 || mounth== 10 || mounth==12 ){
            System.out.println("EL MES INGRESADO POSEE 31 DÍAS");
        }else{ if (mounth==4 || mounth== 6|| mounth == 9|| mounth==11) {
            System.out.println("EL MES INGRESADO POSEE 30 DÍAS");

        }else{
            if (mounth == 2 && (year%4 == 0 || (year%100==0 && year%400 ==0))) {

                System.out.println("EL MES INGRESADO, EN ESTE AÑO BISIESTO "+ year + ", TIENE 29 DÍAS");
            } else{if (mounth==2){
                System.out.println("EL MES INGRESADO TIENE 28 DÍAS");
            }else{
                System.out.println("MES INGRESADO NO VÁLIDO");
            }
            }}
            } */


        // Ejercicio 17
/*
        int nota;
        System.out.println("ingrese la nota obtenida");
            nota = entrada.nextInt();

            if (0 <= nota & nota < 5){
                System.out.println("Insuficiente");
            }
            else if (5 <= nota & nota < 6) {
                System.out.println("Suficiente");
            }
            else if (6 <= nota & nota < 7) {
                System.out.println("Bien");
            }
            else if (7 <= nota & nota < 9) {
                System.out.println("Notable");
            }
            else if (9 <= nota & nota < 10) {
                System.out.println("Sobresaliente");
            }
            else{
                System.out.println("Datos ingresados incorrectos");
            }


 *//*
        // Ejercicio 18

        int num = 1;

        while (num <= 100){
            System.out.println(num);
            num++;
        }

    *//*

        //Ejercicio 19

        int num = 1;

        do {
            System.out.println(num);
            num++;
        }while (num <= 100);
    *//*
        //Ejercicio 20

        for(int num = 1 ; num <=100; num++){
            System.out.println(num);
        }
    *//*
        //Ejercicio 21
        int num = 100;

        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    *//*
        //Ejercicio 22
        int num = 100;

        do {
            System.out.println(num);
            num--;
        }while (num >= 1);
    */
        //EJERCICIO 23
        /*int i;
        for( i=100; i>0; i--){
            System.out.println(i);
        }*/

        //EJERCICIO 24
        /*int n,i;
        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        //1) Estructura for
        for(i=1; i<(n+1); i++){
            System.out.println(i);
        }
        //2) Estructura While
        i=0;
        while(i<n){
            i+=1;
            System.out.println(i);
        }
        //3) Estructura Do-While
        i=0;
        do{
            i+=1;
            System.out.println(i);
        }while(i<n);*/

        //EJERCICIO 25
        /*int n,i;
        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        //1) Estructura for
        for(i=n;i>0;i--) {
            System.out.println(i);
        }
        //2) Estructura While
        i=n;
        while(i>0){
            System.out.println(i);
            i-=1;
        }
        //3) Estructura Do-While
        i=n;
        do{
            System.out.println(i);
            i-=1;
        }while(i>0);*/

        //EJERCICIO 26
        /*int num1,num2,i;
        boolean condicion;
        condicion= true;
        while(condicion){
            System.out.print("Ingrese un numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese un numero: ");
            num2 = sc.nextInt();
            if(num1<num2){
                condicion=false;
                for(i=num1;i<(num2+1);i++){
                 System.out.println(i);
                }
            }else if(num2<num1){
                condicion=false;
                for(i=num2;i<(num1+1);i++){
                    System.out.println(i);
                }
            }else{
                System.out.println("Los numeros son iguales.Vuelva a introducirlos");
            }
        }*/

        //EJERCICIO 27
        /*int a,b,i;
        boolean condicion;
        condicion=true;
        while(condicion) {
            System.out.println("Ingrese el valor de (a): ");
            a = sc.nextInt();
            System.out.println("Ingrese el valor de (b): ");
            b = sc.nextInt();
            if (a < b) {
                System.out.println("Los numeros pares que hay entre " + a + " y " + b + " son: ");
                for (i = a; i < (b + 1); i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + ",");
                    }
                }
                condicion=false;
            }else{
                System.out.println("Invalido, el valor de a debe ser menor que el valor de b");
            }
        }*/

        //EJERCICIO 28
        /*int n,m,i;
        boolean condicion;
        condicion=true;
        while(condicion){
            System.out.println("Ingrese el valor de (n): ");
            n = sc.nextInt();
            System.out.println("Ingrese el valor de (m): ");
            m = sc.nextInt();

            if(n<m){
                System.out.print("Los multiplos de "+ n+ " hasta "+m+" son:");
                for(i=n;i<(m+1);i++){
                    if (i%n==0){
                        System.out.print(i+",");
                    }
                }
                condicion=false;
            }else{
                System.out.println("El valor de n debe ser menor al de m.Vuelva a introducir los numeros.");
            }
        }*/


        //EJERCICIO 29;
        /*double km;
        int millas;
        boolean condicion;
        condicion=true;
        while(condicion){
            System.out.print("Ingrese la cantidad de millas (ingrese 0 para salir): ");
            millas = sc.nextInt();

            if(millas==0){
                System.out.print("Fin");
                condicion=false;
            }else{
                km=millas*1.6093;
                DecimalFormat df = new DecimalFormat("#.00");
                String km_formateado = df.format(km);
                System.out.println("La cantidad de "+millas+" millas,equivalen a "+km_formateado+" km");
            }
        }*/




    }








        }






