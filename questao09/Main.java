    package questao09;

public class Main {
    public static void main(String[] args){
        Elevador a = new Elevador(15, 4);

        System.out.println("Andar atual:" + a.getAndarAtual() + "de " + a.getTotalAndares() + "andares");
        System.out.println("Total de pessoas:" + a.getPessoasPresentes());

    }
}
