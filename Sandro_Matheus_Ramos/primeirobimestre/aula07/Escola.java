package Sandro_Matheus_Ramos.aula07;

import java.util.Arrays;

public class Escola {
    
    private String nome;

    private Endereco endereco;

    private Professor[] professores;

    public Escola(String nome, Endereco endereco, Professor[] professores) {
        this.nome = nome;
        this.endereco = endereco;
        this.professores = professores;
    }

    @Override
    public String toString() {
        if (professores != null) {
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }

        System.out.println("Escola [nome=" + nome + ", endereco=" + endereco);

        return "";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
