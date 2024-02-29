package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        float precoFinal;

        System.out.println("Digite a quantidade de macas:");
        quantidade = scanner.nextInt();

        if (quantidade > 11) {
            precoFinal = quantidade * 1.00f;
        } else {
            precoFinal = quantidade * 1.30f;
        }

        System.out.printf("Total: R$%.2f\n", precoFinal);
    
        scanner.close();    
    }
}