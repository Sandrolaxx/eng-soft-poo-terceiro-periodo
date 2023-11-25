package Sandro_Matheus_Ramos.aula07;

public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void realizarCalculoSalario() {
        throw new UnsupportedOperationException("Unimplemented method 'realizarCalculoSalario'");
    }
}
