package exerciciosDoAluno1a5;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3;
        
        float media;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        media = valor1 + valor2 + valor3; 
        media = media / 3;
        
        System.out.printf("Media final: %.2f\n", media);

        scanner.close();
    }
}