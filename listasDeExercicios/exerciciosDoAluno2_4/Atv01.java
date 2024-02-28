package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("Esse numero eh positivo.");
        } else if (numero < 0) {
            System.out.println("Esse numero eh negativo.");
        } else {
            System.out.println("Zero eh um numero neutro, nem positivo, nem negativo.");
        }

        scanner.close();
    }
}
