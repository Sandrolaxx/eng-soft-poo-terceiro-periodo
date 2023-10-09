public class Conta {
    private String documento;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private double saldo;

    public Conta(String documento, String nome, String telefone, String email, String senha) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public String getDocumento() {
        return documento;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditarSaldo(double valor) {
        saldo += valor;
    }

    public boolean pagarBoleto(String linhaDigitavel) {
        if (linhaDigitavel.length() == 48 && saldo >= calcularValorBoleto(linhaDigitavel)) {
            double valorBoleto = calcularValorBoleto(linhaDigitavel);
            saldo -= valorBoleto;
            return true;
        }
        return false;
    }

    private double calcularValorBoleto(String linhaDigitavel) {
        
        String valorBoletoStr = linhaDigitavel.substring(37, 45);

        try {
           
            double valorBoleto = Double.parseDouble(valorBoletoStr);
            return valorBoleto;
        } catch (NumberFormatException e) {
          
            return 0.0;
        }
    }
    public boolean pagamentoSucesso(String linhaDigitavel) {
        double valorBoleto = calcularValorBoleto(linhaDigitavel);
        
        if (linhaDigitavel.length() == 48 && saldo >= valorBoleto) {
            saldo -= valorBoleto;
            return true;
        }
        
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
