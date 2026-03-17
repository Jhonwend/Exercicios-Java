import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distancia, velocidade, tempohoras;

        System.out.print("Digite a distancia: ");
        distancia = scanner.nextDouble();

        System.out.print("Digite a velocidade: ");
        velocidade = scanner.nextDouble();

        tempohoras = distancia / velocidade;

        int horas = (int) tempohoras;
        int minutos = (int) Math.round((tempohoras - horas) * 60 );

        System.out.printf("Tempo estimado: %d horas e %d minutos%n", horas, minutos);

        scanner.close();
    }
}