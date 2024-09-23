import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativas = 0;
    int chute;
    boolean acertou = false;

    System.out.println("""
        𝓝ㄩ́爪🝗尺ㄖ 丂🝗⼕尺🝗七ㄖ
                         """);

    while (!acertou) {
      // Solicitando um número para o Usuario
      System.out.println("Digite um número entre 1 e 100");
      chute = scanner.nextInt();
      tentativas++;
      // Veruficando se o chute é maior ou menor que o número secreto
      if (chute == numeroSecreto) {
        System.out.println("""
            ________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            _¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶
            ¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶
            ¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________¶¶¶
            ¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶¶
            ¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶
            _¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶____¶¶¶
            _¶¶¶¶___¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶__¶¶¶¶
            ___¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶
            ____¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶
            ______¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶
            _______________¶¶¶¶¶¶¶¶¶¶¶¶
            _________________¶¶¶¶¶¶¶¶
            ___________________¶¶¶¶
            ___________________¶¶¶¶
            ___________________¶¶¶¶
            ___________________¶¶¶¶
            _______________¶¶¶¶¶¶¶¶¶¶¶¶
            ____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ____________¶¶¶____________¶¶¶
            ____________¶¶¶____________¶¶¶
            ____________¶¶¶____________¶¶¶
            ____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            ____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            __________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶
            _________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶

            """);
        System.out.println("Parabéns Você acertou o número secreto em: " + tentativas + " tentativas");
        acertou = true;
      } else if (chute > numeroSecreto) {
        System.out.println("O número secreto é menor! Tente novamente");
      } else {
        System.out.println("O número secreto é maior! Tente novamente");
      }
    }
    scanner.close();
  }
}