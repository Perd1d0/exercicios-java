import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Criando um objeto scanner para ler o teclado
    Scanner scanner = new Scanner(System.in);
    
    //Solicitando o nome do usuário
    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();

    //Solicitando o nome do usuário
    System.out.println("Digite sua idade: ");
    String idade = scanner.nextLine();


    //Exibindo o que o usuário digitou no teclado
    System.out.println("Olá: " + nome);

    //Exibindo o que o usuário digitou no teclado
    System.out.println("Olá: " + nome + " Sua idade é: " + idade);

    //Fechando o scanner
    scanner.close();
  }
}