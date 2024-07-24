package questao3_4_5;

public class Agenda {

    // Atributos

    private String nome;
    private String endereco;
    private String numero;

    //Contrutor

    public Agenda (String nome, String endereco, String numero){
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    //Métodos


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
