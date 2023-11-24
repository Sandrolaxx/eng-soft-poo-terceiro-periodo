public class Conta {
    private String nome;
    private String documento;
    private String telefone;
    private String email;
    private String senha;

    private double saldo;

    // Construtor da classe
    public Conta(String nome, String documento, String telefone, String email, String senha, double saldo) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;

        this.saldo = saldo ;
    }

    // Método para exibir informações da conta
    public void exibirConta() {
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Saldo: " + saldo);
    }

    // Método para verificar o login
    public boolean fazerLogin(String documento, String senha) {
        return this.documento.equals(documento) && this.senha.equals(senha);
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para creditar a conta com um valor
    public void creditarConta(double valor) {
        saldo += valor;
    }

        // Método para pagar boleto da conta com um valor
    public void pagarBoleto(double valor) {
        saldo -= valor;
    }
}
