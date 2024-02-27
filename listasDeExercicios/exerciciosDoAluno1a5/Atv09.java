package exerciciosDoAluno1a5;
import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float principal, taxaJuros, montante;
        int anos;

        System.out.println("Digite o valor do principal:");
         principal = scanner.nextFloat();

        System.out.println("Digite a taxa de juros anual (ex: 0.05 para 5%):");
         taxaJuros = scanner.nextFloat(); 

        System.out.println("Digite o número de anos:");
         anos = scanner.nextInt();

         montante = principal * (float) Math.pow(1 + taxaJuros, anos);
         
         scanner.close();

        System.out.printf("O montante final é: %.2f\n", montante);
    }
}