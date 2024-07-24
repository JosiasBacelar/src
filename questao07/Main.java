package questao07;

public class Main {
    public static void main(String[] args){
        Televisao a = new Televisao(1,15);

        ControleRemoto b = new ControleRemoto(a);

        System.out.println("Antes das mudanças:" + a );
        b.aumentarCanal();
        b.aumentarVolume();
        System.out.println("Depois das mudanças:" + a);

        System.out.println("Consultar volunne: " + b.consultarVolume());
        System.out.println("Consultar canal: " + b.consultarCanal());

        b.trocarCanal(3);
        System.out.println("Depois que o canal foi trocado = " + a);

    }
}
