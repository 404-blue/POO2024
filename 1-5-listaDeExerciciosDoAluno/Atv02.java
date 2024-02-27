import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = scanner.nextInt();

        System.out.println("Digite o valor do primeiro lado: ");
        lado2 = scanner.nextInt();

        System.out.println("Digite o valor do primeiro lado: ");
        lado3 = scanner.nextInt();

        int perimetro = lado1 + lado2 + lado3;

        System.out.println("Perimetro do triangulo: " + perimetro);

        scanner.close();
    }
}
