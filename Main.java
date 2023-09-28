import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //bucle FOR mostrar numeros numero par de a hasta b
        /*int i,a,b;
        System.out.print("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        b = sc.nextInt();
        System.out.println("Los numero pares entre "+a+" y "+ b+ " son: ");
        for (i=a;i<(b+1);i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        //Calculadora While
        /*boolean condicion;
        condicion=true;
        while(condicion){
            System.out.print("Ingrese un numero: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese otro numero: ");
            int num2 = sc.nextInt();
            System.out.println("Eliga una operacion (ingrese el numero de la operacion): 1)Sumar 2)Restar 3)Multiplicar 4)Dividir ");
            int eleccion = sc.nextInt();

            if(eleccion==1){
                System.out.println("Elegiste la operacion: Suma");
                int sum=num1+num2;
                System.out.println("La suma entre "+ num1 + " y "+ num2+ " es: "+ sum);
            }else if(eleccion==2){
                System.out.println("Elegiste la operacion: Resta");
                int resta=num1-num2;
                System.out.println("La resta entre "+ num1 + " y "+ num2+ " es: "+ resta);
            }else if(eleccion==3){
                System.out.println("Elegiste la operacion: Multiplicacion");
                int multp=num1*num2;
                System.out.println("La multiplicaion entre "+ num1 + " y "+ num2+ " es: "+ multp);
            } else if (eleccion==4){
                System.out.println("Elegiste la operacion: Division");
                double div= (double) num1 /num2;
                System.out.println("La division entre "+ num1 + " y "+ num2+ " es: "+ div);
            }else{
                System.out.println("La opcion ingresada no es valida.");
            }

            System.out.println("Desea realizar otra operacion?(ingrese el numero de la opcion): 1)Si 2)No ");
            int op = sc.nextInt();
            if(op==1){
                System.out.println("Has elegido la opcion 1");
            }else if(op==2) {
                System.out.println("Has elegido la opcion 2.Fin de la ejecucion");
                condicion=false;
            }else{
                System.out.println("La opcion ingresada no es correcta");
                condicion=false;
            }
        }*/






        //Ciclo Do-While mostrar numero par mas grande y numero impar mas chico hasta que se ingrese 0
        /*int num,par,impar;
        par=0;
        impar=Integer.MAX_VALUE;
        do{
            System.out.println("Ingrese un numero(pulse 0 para terminar): ");
            num = sc.nextInt();

            if(num%2==0){
                if(par<num){
                    par=num;
                }
            }else{
                if(impar>num){
                    impar=num;
                }
            }
        }while(num!=0);
        System.out.println("El numero par mas grande fue: "+par);
        System.out.println("El numero impar mas chico fue: "+impar);*/
    }
}