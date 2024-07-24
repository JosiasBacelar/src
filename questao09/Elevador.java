package questao09;

    //Atributos
    public class Elevador {
    private int andarAtual;
    private int totalAndares = 15;
    private int capacidade;
    private int pessoasPresentes;

    // Construtor
    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0; // Começa no térreo
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0; // Inicialmente vazio
    }

    //getters e setters para encapsular os atributos
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    //adicionar uma pessoa ao elevador

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar.");
        }
    }

    //remover uma pessoa do elevador

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio. Não é possível sair.");
        }
    }

    //subir um andar

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
        } else {
            System.out.println("Já estamos no último andar. Não é possível subir mais.");
        }
    }

    //descer um andar

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
        } else {
            System.out.println("Já estamos no térreo. Não é possível descer mais.");
        }
    }
}
