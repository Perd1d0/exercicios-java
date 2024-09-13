import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Criando uma instancia do scanner
    Scanner scanner = new Scanner(System.in);

    // Tamnnho do array
    System.out.print("Quantos números deseja dentro do array? ");
    int tamanho = scanner.nextInt();

    // Criando array
    int[] numeros = new int[tamanho];

    // Inserir os números no array
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = scanner.nextInt();
    }

    // Ordenando o array com sort
    Arrays.sort(numeros);

    // Exibindo os números do array
    System.out.println("Os seus números são:");
    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }
    scanner.close();
  }
}