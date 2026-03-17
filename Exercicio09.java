import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Preço, pago, trouco;

        System.out.print("Digite o valor pago: ");
        pago = scanner.nextDouble();

        System.out.print("Digite o Preço: ");
        Preço = scanner.nextDouble();

        trouco = pago - Preço;

        System.out.printf("Trouco: %.2f", trouco);
            scanner.close();
    }
}