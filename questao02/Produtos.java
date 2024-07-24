package questao02;

public class Produtos {

    //Atributos
    String nome;
    double preco;
    int qtd;

    //Construtor
    public Produtos(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    //Métodos

    public double calcularPreco() {
        return preco * qtd;
    }

    public void calculoDesconto() {
        double precoSemDesc = calcularPreco();

        if (qtd == 10){
            System.out.println(precoSemDesc);
        } else if (qtd > 10 && qtd <=20) {
            System.out.println(precoSemDesc - (calcularPreco() * 0.10));
        } else if (qtd > 21 && qtd <= 50) {
            System.out.println(precoSemDesc - (calcularPreco()*0.20));
        } else if  ( qtd > 50 ){
            System.out.println(precoSemDesc - (calcularPreco() * 0.25));
        }
    }


}

