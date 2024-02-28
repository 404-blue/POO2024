package exerciciosDoAluno1a5;

import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, mediaFinal;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextFloat();

        mediaFinal = nota1 * 2 + nota2 * 3 + nota3 * 5;
        mediaFinal = mediaFinal / 10;

        System.out.printf("Media final: %.2f\n", mediaFinal);
        
        scanner.close();
    }
}