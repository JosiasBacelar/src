package questao10;

public class Calculadora {

    //Atributos
    private double numero1 = 2;
    private double numero2 = 5;
    private double resultado;

    //Contrutores
    public Calculadora(double numero1, double numero2, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    //Metodos


    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public double somar(){
        return resultado = (numero1 + numero2);
    }
    public double diminuir(){
        return resultado = (numero1 - numero2);
    }
    public double dividir(){
        return resultado = (numero1 / numero2);
    }
    public double multiplicar(){
        return (numero1 * numero2);
    }

    }
