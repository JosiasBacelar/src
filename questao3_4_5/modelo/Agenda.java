package questao3_4_5.modelo;

public class Agenda {

    //Atributos
    private String nome;
    private Contato contato;

    //Construtor

    public Agenda(String nome, Contato contato){
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", contato=" + contato +
                '}';
    }
}


