package Sandro_Matheus_Ramos.aula05;

public class Ninja {

    private String nome;

    private int idade;

    private String aldeia;

    private String cla;

    private String equipamento;

    private String nomeJutso;

    public Ninja(String nome, int idade, String aldeia, String cla, String equipamento, String nomeJutso) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.cla = cla;
        this.equipamento = equipamento;
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

    void apresentarse() {
        System.out.println("Sou um ninja".concat(nome).concat(" do clã ".concat(cla)));
    }

    void realizarJutso() {
        System.out.println(nome.concat(" realizando jutso ").concat(nomeJutso));
    }

    void fazerAniversario() {
        this.idade = idade + 1;
    }

    void realizarInvocacao() {
        System.out.println("Realizando invocação de um animal...");
    }
}
