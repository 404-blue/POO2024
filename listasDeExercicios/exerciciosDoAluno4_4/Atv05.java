package exerciciosDoAluno4_4;

import java.util.Scanner;

public class Atv05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavraUm = scanner.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra: ");
        String palavraDois = scanner.nextLine().toLowerCase();

        if (palavraUm.equals(palavraDois)) {
            System.out.println("As duas palavras são iguais.");
        } else {
            int compPalavraUm = palavraUm.length();
            int compPalavraDois = palavraDois.length();

            if (compPalavraUm > compPalavraDois) {
                System.out.println("A primeira palavra é maior.");
            } else if (compPalavraDois > compPalavraDois) {
                System.out.println("A segunda palavra é maior.");
            } else {
                System.out.println("As duas palavras possuem o mesmo tamanho.");
            }

            if (palavraUm.contains(palavraDois)) {
                System.out.println("A segunda palavra e uma sub-string da primeira.");
            } else {
                System.out.println("A segunda palavra nao e uma sub-string da primeira palavra.");
            }
        }

        scanner.close();
    }
}