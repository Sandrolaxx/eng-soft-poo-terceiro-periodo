package Sandro_Matheus_Ramos.aula06;

public class Hokage extends Ninja {
    
    private int tempoCargo;

    public Hokage(String nome, int idade, String nomeJutso, int tempoCargo) {
        super(nome, idade, nomeJutso);
        this.tempoCargo = tempoCargo;
    }

    @Override
    void realizarJutso() {
        System.out.println("Hokage realizando jutso");
    } 

}
