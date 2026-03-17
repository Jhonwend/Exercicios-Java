import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double Media, nota1, nota2, nota3;

        System.out.print("Digite a nota 1: ");
         nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

        Media = (nota1 + nota2 + nota3) / 3;




        System.out.printf("Média: %.2f", Media);
        scanner.close();
            }
}