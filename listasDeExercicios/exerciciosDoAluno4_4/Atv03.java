package exerciciosDoAluno4_4;

import java.util.Scanner;

public class Atv03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultadoFinal = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            System.out.println("Digite a " + i + "° palavra");
            String palavra = scanner.nextLine();

            resultadoFinal.append(palavra);

            if (i < 4) {
                resultadoFinal.append(" ");
            }
        }

        System.out.println("Resultado: " + resultadoFinal.toString());

        scanner.close();
    }
}