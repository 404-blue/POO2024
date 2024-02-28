package exerciciosDoAluno1_5;

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdProduto;
        float precoUnitario;

        System.out.println("Digite a quantidade: ");
        qtdProduto = scanner.nextInt();

        System.out.println("Digite o preco unitario: ");
        precoUnitario = scanner.nextFloat();

        float total = precoUnitario * qtdProduto;

        System.out.println("Total a ser pago: " + total);

        scanner.close();
    }
}