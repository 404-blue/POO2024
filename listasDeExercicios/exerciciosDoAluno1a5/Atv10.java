package exerciciosDoAluno1a5;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        if (idade > 18) {
            System.out.println("Parabens, você eh maior de idade!");
        }else{
            System.out.println("Você possui menos de 18 anos, entao ainda não pode votar ou tirar habilitação.");
        }

        scanner.close();
    }
}
