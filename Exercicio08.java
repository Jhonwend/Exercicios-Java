import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Celsius, fahrenheit, kelvin;

        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = scanner.nextDouble();

        fahrenheit = (Celsius * 9.0/5) + 32;

        kelvin = Celsius + 273.15;

        System.out.printf("Fahrenheit: %.1f °f%n", fahrenheit);
        System.out.printf("Kelvin: %.2f k%n", kelvin);
        scanner.close();
    }
}