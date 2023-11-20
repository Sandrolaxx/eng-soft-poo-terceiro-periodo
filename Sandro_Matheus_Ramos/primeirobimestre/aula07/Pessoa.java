package Sandro_Matheus_Ramos.aula07;

public abstract class Pessoa {
    
    private String nome;

    private int idade;

    public abstract void realizarCalculoSalario();

    public void mostrarDados() {
        System.out.println("Meu nome é " + nome + " com idade " + idade);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

}
