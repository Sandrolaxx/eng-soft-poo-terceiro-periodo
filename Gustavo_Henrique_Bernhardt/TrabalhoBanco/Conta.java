public class Conta {

    private String documento;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private Double saldo;

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public Conta(String documento, String nome, String telefone, String email, String senha) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.0; // Inicialmente, a conta não tem saldo.
    }

    public void realizarEntrada(Double valor) {
        this.saldo += valor;
    }

    public void realizarSaida(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta [documento=" + documento + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
                + ", senha=" + senha + ", saldo=" + saldo + "]";
    }
}
