package exerciciosDoAluno4_4;

import java.util.Scanner;

public class Atv04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cpf utilizando pontos e hifen: ex. 000.000.000-00");
        String cpf = scanner.nextLine();

        String cpfFormatado = cpf.replaceAll("[.-]", "");

        System.out.println("\nCpf formatado: " + cpfFormatado);

        scanner.close();
    }
}