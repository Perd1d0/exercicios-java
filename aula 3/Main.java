
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("O senhor dos Aneis", 2001, 178);
    Filmes filme2 = new Filmes("1917", 2023, 138);
    Filmes filme3 = new Filmes("Rebel", 2023, 152);
    
    System.out.println(filme1.exibirInfo());
     System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
  }

 
}