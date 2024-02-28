package exerciciosDoAluno1_5;

import java.util.Scanner;

public class Atv06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float salario, vendas, comissao, comissaoExtra;

		System.out.println("Digite valor do salario fixo: ");
		salario = scanner.nextFloat();

		System.out.println("Digite total de vendas: ");
		vendas = scanner.nextFloat();

		if (vendas <= 1500) {
			comissao = vendas * 0.03f;
		} else {
			comissao = 1500 * 0.03f;
			comissaoExtra = vendas - 1500;
			comissaoExtra = comissaoExtra * 0.05f;
			comissao = comissao + comissaoExtra;
		}

		salario = salario + comissao;

		System.out.println("Salario total: " + salario);
        
        scanner.close();
	}
}

