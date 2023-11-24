package Sandro_Matheus_Ramos.aula07;

public interface IBancoDados {
    
    public Funcionario salvar(Funcionario funcionario);

    public Funcionario atualizar(Funcionario funcionario);
    
    public Funcionario buscarPorId(int id);

}
