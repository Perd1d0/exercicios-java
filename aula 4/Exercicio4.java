import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int meuInt = 10;
    double meuDouble = meuInt;

    System.out.println("Valor do meuInt: " + meuInt);
    System.out.println("Valor do meuDouble: " + meuDouble);

    // Casting explicito

    double outroDouble = 10.99;
    int outroInt = (int) outroDouble;

    System.out.println("Valor do outroDouble: " + outroDouble);
    System.out.println("Valor do outroInt: " + outroInt);

    entrada.close();
  }
}
