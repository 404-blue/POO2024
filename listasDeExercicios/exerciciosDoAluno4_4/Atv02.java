package exerciciosDoAluno4_4;

import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite uma palavra presente na frase: ");
        String palavraPresente = scanner.nextLine();

        int indice = frase.indexOf(palavraPresente);

        if (indice != -1) {
            System.out.println("A palavra '" + palavraPresente + "' comeca apos o " + indice + "° caractere.");
        } else {
            System.out.println("A palavra '" + palavraPresente + "' não foi encontrada.");
        }

        scanner.close();
    }
}