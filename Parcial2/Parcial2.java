import java.util.Scanner;
public class Parcial2 {
    public static void main(String[] args) {
        funciones fun = new funciones();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Desea ingresar un ADN? (ingrese el numero de la opcion): \n"
                    + "1) Si \n"
                    + "2) No \n");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                String[][] matrix_dna = new String[6][6];
                int DNA_entered = 0;
                while (DNA_entered < 6) {
                    System.out.println("--------------------------------");
                    System.out.println("Condiciones que debe tener el ADN ingresado: \n"
                            + "-Letras Permitidas: A,T,C,G                    \n"
                            + "-Ingresar 6 letras                             \n");
                    System.out.println("Ingrese el ADN: ");
                    String enter_dna = scanner.nextLine().toUpperCase();
                    enter_dna=fun.quitSpaces(enter_dna);
                    if (fun.validate_dna(enter_dna)) {
                        fun.complete_dna_matrix(matrix_dna, enter_dna);
                        DNA_entered++;
                    } else {
                        System.out.println("ADN invalido. Ingrese otro ADN");
                    }

                    if (DNA_entered == 6) {
                        System.out.println(fun.is_mutant(matrix_dna));
                        break;
                    }
                }
            } else if (option.equals("2")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion incorrecta. Intentelo de nuevo");
            }
        }
    }
}
