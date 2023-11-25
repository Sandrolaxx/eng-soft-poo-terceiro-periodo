package Sandro_Matheus_Ramos.aula06;

public class Ninja {

    private String nome;

    private int idade;

    private String aldeia;

    private String cla;

    private String equipamento;

    private String nomeJutso;

    public Ninja(String nome, int idade, String nomeJutso) {
        this.nome = nome;
        this.idade = idade;
        this.nomeJutso = nomeJutso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getCla() {
        return cla;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getNomeJutso() {
        return nomeJutso;
    }

    public void setNomeJutso(String nomeJutso) {
        this.nomeJutso = nomeJutso;
    }

    public Ninja() {
    }

    void apresentarse() {
        System.out.println("Olá sou o ninja ".concat(nome));
    }

    void realizarJutso() {
        System.out.println("Ninja ".concat(nome).concat(" realizando jutso ").concat(nomeJutso));
    }

    void fazerAniversario() {
        this.idade = this.idade + 1;
    }

}
