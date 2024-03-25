package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valores;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° valor:");
            valores = scanner.nextInt();
            if (valores < 0) {
                negativos = negativos + 1;
            }

            if (i == 10) {
                System.out.println(negativos + " numeros sao negativos");
            }
        }

        scanner.close();
    }
}