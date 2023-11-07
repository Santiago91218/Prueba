import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        String op="";
        while(!op.equals("4")){
            System.out.println(" ");
            System.out.println("Con que desea operar 1)Arrays 2)Matrices 3)Salir");
            op=sc.next();
            switch (op){
                case "1":
                    Integer [] array_number;
                    int n;
                    System.out.println("De que tamaño quiere que sea el array? ");
                    n=sc.nextInt();
                    array_number = new Integer[n];

                    for (int i=0; i<n;i++) {
                        System.out.println("Ingrese un numero");
                        array_number[i] = sc.nextInt();
                    }
                    System.out.println("Eliga una opcion 1)Ordenar array 2)Operaciones ");
                    String opcion_arrays=sc.next();

                    if(opcion_arrays.equals("1")){
                        Ordenar_Array(array_number);
                    }else if (opcion_arrays.equals("2")){
                        Operaciones_Array(array_number,n);
                    }else{
                        System.out.println("Opcion invalida");
                    }
                    break;
                case "2":
                    int fila,colum;
                    System.out.println("Ingrese las filas de la matriz ");
                    fila=sc.nextInt();
                    System.out.println("Ingrese las columnas de la matriz ");
                    colum=sc.nextInt();

                    Integer [][] matriz_numeros = new Integer[fila][colum];

                    for(int i=0;i< fila;i++){
                        for(int j=0;j<colum;j++){
                            System.out.println("Ingrese un numero: ");
                            matriz_numeros[i][j]=sc.nextInt();
                        }
                    }
                    Operaciones_matriz(matriz_numeros,fila,colum);
                    break;
                case "3":
                    System.out.println("Saliendo...");

            }
        }
    }
    public static void Ordenar_Array(Integer array[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Eliga una opcion 1)Ascendente 2)Descendente ");
        String opcion=sc.next();

        if(opcion.equals("1")){
            System.out.println("Array ingresado: ");
            for (int i=0; i<array.length;i++){
                System.out.print(array[i] +", ");
            }
            System.out.println(" ");
            Arrays.sort(array);
            System.out.println("Array ordenado(Ascendente):");
            for(Integer number:array){
                System.out.print(number +", ");
            }
        } else if(opcion.equals("2")){
            System.out.println("Array ingresado: ");
            for (int i=0; i< array.length;i++){
                System.out.print(array[i] +", ");
            }
            System.out.println(" ");
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println("Array ordenado(Descendente):");
            for(Integer number:array){
                System.out.print(number +", ");
            }
        }

    }
    public static void Operaciones_Array(Integer array_one[],Integer n){
        Scanner sc =new Scanner(System.in);
        Integer [] array_two=new Integer[n];
        System.out.println("Para realizar operaciones debe ingresar otro Array");

        for (int i=0;i< array_one.length;i++){
            System.out.println("Ingrese un numero ");
            array_two[i]=sc.nextInt();
        }

        System.out.println("Eliga una opcion 1)Sumar 2)Restar 3)Multiplicar 4)Dividir");
        String opcion_arrays= sc.next();

        switch (opcion_arrays){
            case "1":
                Integer [] array_sum=new Integer[n];
                for (int i=0;i< array_one.length;i++){
                    array_sum[i]=array_one[i]+array_two[i];
                }
                System.out.println("Array 1: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_one[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array 2: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_two[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array con la suma(en la misma posicion): ");
                for (int num:array_sum){
                    System.out.print(num +", ");
                }
                System.out.println(" ");
                break;
            case "2":
                Integer [] array_rest=new Integer[n];
                for (int i=0;i< array_one.length;i++){
                    array_rest[i]=array_one[i]-array_two[i];
                }
                System.out.println("Array 1: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_one[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array 2: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_two[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array con la resta(en la misma posicion): ");
                for (int num:array_rest){
                    System.out.print(num +", ");
                }
                System.out.println(" ");
                break;
            case "3":
                Integer [] array_mult=new Integer[n];
                for (int i=0;i< array_one.length;i++){
                    array_mult[i]=array_one[i]*array_two[i];
                }
                System.out.println("Array 1: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_one[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array 2: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_two[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array con la multiplicacion(en la misma posicion): ");
                for (int num:array_mult){
                    System.out.print(num +", ");
                }
                System.out.println(" ");
                break;
            case "4":
                Double [] array_div=new Double[n];
                for (int i=0;i< array_one.length;i++){
                    array_div[i]=(double)array_one[i]/array_two[i];
                }
                System.out.println("Array 1: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_one[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array 2: ");
                for (int i=0;i< array_one.length;i++){
                    System.out.print(array_two[i] +", ");
                }
                System.out.println(" ");
                System.out.println("Array con la division(en la misma posicion): ");
                for (double num:array_div){
                    System.out.print(num +", ");
                }
                System.out.println(" ");
                break;
            default:
                System.out.println("No valido.Reintentelo");
        }
    }
    public static void Operaciones_matriz(Integer [][] matriz_one,Integer f,Integer c){
        Scanner sc =new Scanner(System.in);

        Integer [][] matriz_two=new Integer[f][c];
        System.out.println("Para realizar operaciones debe ingresar otra Matriz");
        for(int i=0;i< f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Ingrese un numero: ");
                matriz_two[i][j]=sc.nextInt();
            }
        }
        System.out.println("Eliga una opcion 1)Sumar 2)Restar 3)Multiplicar 4)Dividir");
        String opcion_matriz= sc.next();
        switch (opcion_matriz){
            case "1":
                Integer [][] matriz_suma=new Integer[f][c];
                for (int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        matriz_suma[i][j]=matriz_one[i][j]+matriz_two[i][j];
                    }
                }

                System.out.println("Matriz 1: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_one[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz 2: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_two[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz con la suma(en la misma posicion): ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_suma[i][j]+ " ");
                    }
                    System.out.println(" ");
                }

                break;
            case "2":
                Integer [][] matriz_rest=new Integer[f][c];
                for (int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        matriz_rest[i][j]=matriz_one[i][j]-matriz_two[i][j];
                    }
                }

                System.out.println("Matriz 1: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_one[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz 2: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_two[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz con la resta(en la misma posicion): ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_rest[i][j]+ " ");
                    }
                    System.out.println(" ");
                }

                break;
            case "3":
                Integer [][] matriz_mult=new Integer[f][c];
                for (int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        matriz_mult[i][j]=matriz_one[i][j]*matriz_two[i][j];
                    }
                }

                System.out.println("Matriz 1: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_one[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz 2: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_two[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz con la multiplicacion(en la misma posicion): ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_mult[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                break;
            case "4":
                Double [][] matriz_div=new Double[f][c];
                for (int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        matriz_div[i][j]=(double)matriz_one[i][j]/matriz_two[i][j];
                    }
                }

                System.out.println("Matriz 1: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_one[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz 2: ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_two[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                System.out.println("Matriz con la division(en la misma posicion): ");
                for(int i=0;i< f;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(matriz_div[i][j]+ " ");
                    }
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("No valido.Reintentelo");
        }



































    }
}