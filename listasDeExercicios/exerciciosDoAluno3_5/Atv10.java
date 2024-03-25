package exerciciosDoAluno3_5;

import java.util.Scanner;
import java.util.Random;

public class Atv10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int pontuacaoJogador = 0;
        int pontuacaoSistema = 0;

        System.out.println("Bem-vindo ao jogo de par ou impar!");

        do {
            System.out.println("Escolha par ou impar: ");
            String escolhaDoJogador = scanner.nextLine().toLowerCase();

            System.out.println("Escolha um numero de 0 a 10: ");
            int numeroDoJogador = Integer.parseInt(scanner.nextLine());

            int numeroDoSistema = random.nextInt(11);
            int soma = numeroDoJogador + numeroDoSistema;
            String resultado = (soma % 2 == 0) ? "par" : "impar";

            if (escolhaDoJogador.equals(resultado)) {
                System.err.println("\nVoce ganhou essa rodada!");
                pontuacaoJogador++;
            } else {
                System.out.println("\nVoce perdeu essa rodada.");
                pontuacaoSistema++;
            }

            System.out.println("Pontuação do jogador: " + pontuacaoJogador);
            System.out.println("Pontuacao do sistema: " + pontuacaoSistema);

            System.out.println("\nDeseja continuar jogando? (Digite 'sim' para continuar)");
        } while (scanner.nextLine().equalsIgnoreCase("sim"));

        System.out.println("\nO jogo acabou. Pontuacao final:");
        System.out.println("Jogador: " + pontuacaoJogador);
        System.out.println("Sistema: " + pontuacaoSistema);

        if (pontuacaoJogador > pontuacaoSistema) {
            System.out.println("\nVoce ganhou!");
        } else if (pontuacaoSistema > pontuacaoJogador) {
            System.out.println("\nEu venci!");
        } else {
            System.out.println("\nEmpatamos! Foi um bom jogo.");
        }

        scanner.close();
    }
}