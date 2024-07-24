package questao3_4_5.modelo;

public class Contato {

    //Atributos
    private String tipo;
    private String numero;

    //Contrutores

    public Contato(String tipo, String numero){
        this.tipo = tipo;
        this.numero = numero;
    }

    //Metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "tipo='" + tipo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
