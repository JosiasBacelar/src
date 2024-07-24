package questao10;

public class Main {
    public static void main(String[] args) {

        Calculadora minhaCalculadora = new Calculadora(2, 5, 0);

        double soma = minhaCalculadora.somar();
        double subtracao = minhaCalculadora.diminuir();
        double divisao = minhaCalculadora.dividir();
        double multiplicacao = minhaCalculadora.multiplicar();


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
