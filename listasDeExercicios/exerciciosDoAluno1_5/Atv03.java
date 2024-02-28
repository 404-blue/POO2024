package exerciciosDoAluno1_5;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float reais, dolares;

        System.out.println("Digite o valor em reais a ser convertido: ");
        reais = scanner.nextFloat();

        dolares = reais / 5.05f;

        System.out.println("Valor correspondente: " + dolares + " dolares.");

        scanner.close();
    }
}