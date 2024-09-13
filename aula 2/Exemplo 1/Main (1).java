import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Instanciando o objeto Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos números você deseja inserir? ");
    int tamanho = scanner.nextInt();

    // Criando um array para armazenar os numeros
    int[] numeros = new int[tamanho];

    // Preenchendo o array
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = scanner.nextInt();
    }

    // Exebindo os números
    System.out.println("Os números digitados foram: ");
    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }
    scanner.close();
  }
}