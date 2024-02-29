package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Voce eh uma crianca");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Voce eh adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Voce eh adulto");
        } else {
            System.out.println("Voce eh idoso");
        }

        scanner.close();
    }
}