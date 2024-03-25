package exerciciosDoAluno3_5;

import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor inteiro:");
        valor = scanner.nextInt();

        for (int i = 0; i <= valor; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}