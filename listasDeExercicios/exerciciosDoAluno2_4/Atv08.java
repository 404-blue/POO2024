package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMes;

        System.out.println("Digite o mes: (ex. 1 – janeiro, 2 – fevereiro, etc.) ");
        numMes = scanner.nextInt();

        scanner.close();

        int[] mes30 = { 4, 6, 9, 11 };
        int[] mes31 = { 1, 3, 5, 7, 8, 10, 12 };

        for (int mes : mes30)
            if (numMes == mes) {
                System.out.println("Esse mes possui 30 dias.");
                return;
            }

        for (int mes : mes31)
            if (numMes == mes) {
                System.out.println("Esse mes possui 31 dias.");
                return;
            }

        if (numMes == 2) {
            System.out.println("No ano de 2024, esse mes possui 29 dias.");
        }
    }
}