import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Multiplicando 2 números
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    // Calculo
    int resultadoDaMultiplicacao = num1 * num2;
    int resultadoDaDivisao = num1 / num2;

    // Saída
    System.out.println("O resultado da multiplicação é " + resultadoDaMultiplicacao + " e o resultado da divisão é "
        + resultadoDaDivisao);

    // Fechando o scanner
    scanner.close();
  }
}