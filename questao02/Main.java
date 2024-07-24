package questao02;

public class Main {
    public static void main(String[] args) {

        Produtos p = new Produtos("Garrafa",5, 11);

        System.out.println(p);
        p.calcularPreco();
        p.calculoDesconto();
    }
}
