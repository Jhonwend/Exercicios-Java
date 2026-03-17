import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia, combustivel, consumomedio;

        System.out.print("Digite a distância percorrrida (Km): ");
        distancia = scanner.nextDouble();

        System.out.print("Digite o combústivel gasto (Litros): ");
        combustivel = scanner.nextDouble();

        consumomedio = distancia / combustivel;

        System.out.printf("Consumo Médio: %.1f km/l%n", consumomedio);
        scanner.close();
    }
}