package questao01;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Josias","123.456.789-10", "86 999164-114","M",23);

        System.out.println(cliente1);
        
        cliente1.verificarMaiorIdade();

    }
}
