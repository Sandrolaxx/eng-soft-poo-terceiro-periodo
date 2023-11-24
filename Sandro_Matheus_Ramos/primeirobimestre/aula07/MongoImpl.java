package Sandro_Matheus_Ramos.aula07;

public class MongoImpl implements IBancoDados {

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        //Como persistir no mongo
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
