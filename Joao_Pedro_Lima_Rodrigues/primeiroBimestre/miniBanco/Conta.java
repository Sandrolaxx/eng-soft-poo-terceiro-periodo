package Joao_Pedro_Lima_Rodrigues.miniBanco;

public class Conta {

    private String documento;
    private String nome;
    private Double saldo;
    private String telefone;
    private String email;
    private String senha;

    public Conta(String documento, String senha, String nome, String telefone, String email) {
        this.documento = documento;
        this.senha = senha;
        this.saldo = 0d;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void creditarSaldo(Double valor){
        this.saldo = saldo + valor;
    }

    public void debitarSaldo(Double valor){
        this.saldo = saldo - valor;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [documento=" + documento + ", senha=" + senha + "]";
    }

}
