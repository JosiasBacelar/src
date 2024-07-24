package questao3_4_5.visao;

import questao3_4_5.modelo.Agenda;
import questao3_4_5.modelo.Contato;

public class Main {
    public static void main(String[] args) {
        Contato a = new Contato("Telefone","86 99916-4114");

        Agenda b = new Agenda("Joao", a);

        System.out.println(b);

    }
}
