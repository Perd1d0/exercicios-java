public class Filmes{
  //Atributos
  private String titulo;
  private int anoLancamento;
  private int duracao;

  //Construtor
  public Filmes(String titulo, int anoLancamento, int duracao){
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }
  //Metodos
  public String exibirInfo(){
    return "Titulo: " + titulo + ",Ano " + anoLancamento + ",Duração: " + duracao;
  }
}