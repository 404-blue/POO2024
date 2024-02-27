import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do seu circulo: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
