import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Digite a base (em cm): ");
        base = scanner.nextDouble();

        System.out.print("Digite a altura (em cm): ");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.printf("Área do retângulo: %.1fcm²", area);
        scanner.close();
    }
}