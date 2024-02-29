package exerciciosDoAluno2_4;

import java.util.Scanner;

public class Atv09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mes, estacao;

        System.out.println("Digite o nome de um mes: (ex. janeiro, fevereiro, etc)");
        mes = scanner.toString().toLowerCase();

        switch (mes) {
            case "junho":
            case "julho":
            case "agosto":
                estacao = "Inverno";
                break;

            case "dezembro":
            case "janeiro":
            case "fevereiro":
                estacao = "Verao";
                break;

            case "março":
            case "abril":
            case "maio":
                estacao = "Outono";
                break;

            case "setembro":
            case "outubro":
            case "novembro":
                estacao = "Primavera";
                break;

            default:
                estacao = "Mês inválido";
                break;
        }

        System.out.println("O mês de " + mes + " pertence à estação " + estacao + ".");

        scanner.close();
    }
}
