package exerciciosDoAluno4_4;

import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para ser contada: ");
        String texto = scanner.nextLine();

        int numCaracteres = texto.length();

        String[] numPalavras = texto.split("\\s+");

        int totalPalavras = numPalavras.length;

        System.out.println("Numero de caracteres: " + numCaracteres + "\nNumero de palavras: " + totalPalavras);

        scanner.close();
    }
}