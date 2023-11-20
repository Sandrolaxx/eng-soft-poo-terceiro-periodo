package Sandro_Matheus_Ramos.aula06;

public class AlunoNinja extends Ninja {
    
    private String nomeDoTime;

    private String nomeProfessor;

    public AlunoNinja(String nome, int idade, String nomeJutso, String nomeDoTime, String nomeProfessor) {
        super(nome, idade, nomeJutso);

        this.nomeDoTime = nomeDoTime;
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    void realizarJutso() {
        System.out.println("Aluno realizando jutso");
    } 

}
