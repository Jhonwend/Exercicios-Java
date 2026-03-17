import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double COTACAO = 4.95;
        double dolar, reais;

        System.out.print("Digite o valor em dólar: ");
        dolar = scanner.nextDouble();

        reais = dolar * COTACAO;

        System.out.print("Valor convertido: R$ " + reais);
        scanner.close();
    }
}