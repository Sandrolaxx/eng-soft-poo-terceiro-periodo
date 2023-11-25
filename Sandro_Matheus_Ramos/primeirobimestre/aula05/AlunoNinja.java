package Sandro_Matheus_Ramos.aula05;

public class AlunoNinja extends Ninja {

    private String nomeTime;

    private String nomeProfessor;

    public AlunoNinja(String nome, int idade, String aldeia, String cla,
            String equipamento, String nomeJutso, String nomeTime, String nomeProfessor) {
        super(nome, idade, aldeia, cla, equipamento, nomeJutso);
        this.nomeTime = nomeTime;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    void apresentarse() {
        String apresentacao = "Sou o aluno ninja ".concat(this.getNome())
                .concat(" do clã ").concat(this.getCla())
                .concat(" membro do time ").concat(this.nomeTime);

        System.out.println(apresentacao);
    }

    @Override
    void realizarInvocacao() {
        System.out.println("Realizando invocação de um doguinho\u1F436");
    }

}
