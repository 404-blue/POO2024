package exerciciosDoAluno1a5;

import java.util.Scanner;

public class Atv05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float horas, valorHora, horasExtras, salarioTotal;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = scanner.nextFloat();

        System.out.println("Digite valor pago por hora trabalhadas: ");
        valorHora = scanner.nextFloat();

        horasExtras = horas - 160;
        horasExtras = horasExtras * 0.5f * valorHora;

        salarioTotal = valorHora * horas;
        salarioTotal = salarioTotal + horasExtras;

        System.out.println("Salario total (mais, caso tenha, horas extras): " + salarioTotal);
        
        scanner.close();
    }
}
