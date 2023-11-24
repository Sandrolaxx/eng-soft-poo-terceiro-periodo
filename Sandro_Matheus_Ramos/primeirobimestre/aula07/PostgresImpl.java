package Sandro_Matheus_Ramos.aula07;

public class PostgresImpl implements IBancoDados {

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        return funcionario;
    }
    
    @Override
    public Funcionario atualizar(Funcionario funcionario) {
        return funcionario;
    }

    @Override
    public Funcionario buscarPorId(int id) {
        return new Funcionario("null", 23);
    }
    
}
