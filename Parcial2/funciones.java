import java.util.ArrayList;
public class funciones {
    public static boolean is_mutant(String[][] matrixDNA) {
        int count=horizontal(matrixDNA);
        count+=vertical(matrixDNA);
        count+=mainDiagonals(matrixDNA);
        count+=reverseDiagonals(matrixDNA);
        if (count>=2){
            return true;
        }else{
            return false;
        }
    }
    public boolean validate_dna(String dna) {
        return dna.matches("[ATCG]+") && dna.length() == 6;
    }
    public void complete_dna_matrix(String[][] matrix, String dna) {
        for (int i = 0; i < matrix.length; i++) {
            if (validate_dna(dna) && matrix[i][0] == null) {
                matrix[i] = dna.split("");
                System.out.println("ADN valido: " + dna);
                break;
            }
        }

    }
    public static int vertical(String[][] matrix) {
        ArrayList<String> vertical = new ArrayList<>();
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                vertical.add(matrix[i][j]);
            }
        }
        int count = 0;
        int consecutiveCount = 1;
        for (int i = 0; i < vertical.size() - 1; i++) {
            if (vertical.get(i).equals(vertical.get(i + 1))) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            if (consecutiveCount == 4) {
                count++;
            }
        }
        return count;
    }
    public static int horizontal(String[][] matrix) {
        ArrayList<String> horizontal = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                horizontal.add(matrix[i][j]);
            }
        }
        int count = 0;
        int consecutiveCount = 1;
        for (int i = 0; i < horizontal.size() - 1; i++) {
            if (horizontal.get(i).equals(horizontal.get(i + 1))) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            if (consecutiveCount == 4) {
                count++;
            }
        }
        return count;
    }
    public static int reverseDiagonals(String[][] matrix) {
        ArrayList<String> listReverseDiagonals = new ArrayList<>();

        int aux = 5;
        for (int i = 0; i < 6; i++) {
            listReverseDiagonals.add(matrix[i][aux]);
            aux--;
        }

        aux = 4;
        for (int i = 0; i < 5; i++) {
            listReverseDiagonals.add(matrix[i][aux]);
            aux--;
        }

        aux = 3;
        for (int i = 0; i < 4; i++) {
            listReverseDiagonals.add(matrix[i][aux]);
            aux--;
        }

        aux = 5;
        for (int i = 1; i < 6; i++) {
            listReverseDiagonals.add(matrix[i][aux]);
            aux--;
        }

        aux = 5;
        for (int i = 2; i < 6; i++) {
            listReverseDiagonals.add(matrix[i][aux]);
            aux--;
        }

    int count = 0;
    int consecutiveCount = 1;
    for (int i = 0; i < listReverseDiagonals.size() - 1; i++) {
        if (listReverseDiagonals.get(i).equals(listReverseDiagonals.get(i + 1))) {
            consecutiveCount++;
        } else {
            consecutiveCount = 1;
        }
        if (consecutiveCount == 4) {
            count++;
        }
    }
    return count;


    }
    public static int mainDiagonals(String[][] matrix) {
        ArrayList<String> listMainDiagonals = new ArrayList<>();

        for (int k = 0; k < 6; k++) {
            listMainDiagonals.add(matrix[k][k]);
        }

        for (int i = 0; i < 5; i++) {
            listMainDiagonals.add(matrix[i][i + 1]);
        }

        for (int i = 0; i < 4; i++) {
            listMainDiagonals.add(matrix[i][i + 2]);
        }

        for (int i = 1; i < 6; i++) {
            listMainDiagonals.add(matrix[i][i - 1]);
        }

        for (int i = 2; i < 6; i++) {
            listMainDiagonals.add(matrix[i][i - 2]);
        }

        int count = 0;
        int consecutiveCount = 1;
        for (int i = 0; i < listMainDiagonals.size() - 1; i++) {
            if (listMainDiagonals.get(i).equals(listMainDiagonals.get(i + 1))) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }
            if (consecutiveCount == 4) {
                count++;
            }
        }
        return count;
    }
    public static String quitSpaces(String dnaSpaces) {
        String dna = dnaSpaces.replaceAll("\\s", "");
        return dna;
    }
}