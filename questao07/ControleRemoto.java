package questao07;

public class ControleRemoto {

    //Atributos
    private Televisao televisao;

    //Construtores
    public ControleRemoto(Televisao televisao){
        this.televisao = televisao;
    }

    //Metodos

    public void aumentarVolume(){
        televisao.setVolume(televisao.getVolume()+1);
    }
    public void diminuirVolume(){
        televisao.setVolume(televisao.getVolume()-1);
    }
    public void aumentarCanal(){
        televisao.setCanal(televisao.getCanal()+1);
    }
    public void diminuirCanal(){
        televisao.setCanal(televisao.getCanal()-1);
    }
    public void trocarCanal(int novoCanal){
        televisao.setCanal(novoCanal);
    }
    public int consultarCanal(){
        return televisao.getCanal();
    }
    public int consultarVolume(){
        return televisao.getVolume();
    }



}
