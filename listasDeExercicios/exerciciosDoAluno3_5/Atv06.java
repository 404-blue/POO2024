package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.println("Quantos alunos a sala possui?");
        int alunos = scanner.nextInt();

        for (int i = 1; i <= alunos; i++) {
            System.out.println("Digite o a nota do " + i + "° alunos:");
            int notas = scanner.nextInt();

            total = total + notas;
        }

        float media = total / alunos;

        System.out.printf("Media: %.2f\n", media);

        scanner.close();
    }
}