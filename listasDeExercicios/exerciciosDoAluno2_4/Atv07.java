package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Digite a nota da primeira avaliacao:");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a nota da segunda avaliacao:");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2f;

        if (media > 5) {
            System.out.println("Voce foi aprovado!");
        } else {
            System.out.println("Voce foi reprovado.");
        }

        System.out.printf("Media final: %.1f\n", media);
        
        scanner.close();
    }
}