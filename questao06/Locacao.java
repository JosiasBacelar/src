package questao06;

public class Locacao {

    //Atributos

  private String nome;
  private String categoria;
  private double valor = 4.00;

    //Construtores
public Locacao(String nome, String categoria){
    this.nome = nome;
    this.categoria = categoria;
}

    // Metodos


    public double calcularValor() {
        switch (categoria.toLowerCase()){
            case "infatil":
                return valor + 2.00;
            case "lancamento":
                return valor + 3.00;
            case "promocao":
                return  valor - 2.00;
            default:
                return valor;

        }


    }

    @Override
    public String toString() {
        return "Locacao{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + calcularValor() +
                '}';
    }
}
