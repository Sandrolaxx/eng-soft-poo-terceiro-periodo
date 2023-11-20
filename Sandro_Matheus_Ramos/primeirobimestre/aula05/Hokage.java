package Sandro_Matheus_Ramos.aula05;

public class Hokage extends Ninja {

    private int tempoMandato;

    public Hokage(String nome, int idade, String aldeia, String cla,
            String equipamento, String nomeJutso, int tempoMandato) {
        super(nome, idade, aldeia, cla, equipamento, nomeJutso);
        this.tempoMandato = tempoMandato;
    }

    public int getTempoMandato() {
        return tempoMandato;
    }

    public void setTempoMandato(int tempoMandato) {
        this.tempoMandato = tempoMandato;
    }

    @Override
    void realizarInvocacao() {
        System.out.println("Realizando invicação de um animal com muito shakara! Sapão bala\u1F438");
    }

}
