package trabalhobimestral;

class ContaDigital {
    private String documento;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private double saldo;

    public ContaDigital(String documento, String nome, String telefone, String email, String senha) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void creditarSaldo(double valor) {
        saldo += valor;
        System.out.println("Saldo creditado com sucesso. Saldo atual: R$" + saldo);
    }

    public void consultarBoleto(String linhaDigitavel) {
        if (linhaDigitavel.length() != 48) {
            System.out.println("Boleto inválido.");
        } else {
            double valor = Double.parseDouble(linhaDigitavel.substring(37, 47)) / 100.0;
            System.out.println("Valor do boleto: R$" + valor);
        }
    }

    public void pagarBoleto(String linhaDigitavel) {
        if (saldo < 0) {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        } else if (linhaDigitavel.length() != 48) {
            System.out.println("Boleto inválido.");
        } else {
            double valor = Double.parseDouble(linhaDigitavel.substring(37, 47)) / 100.0;
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Pagamento realizado com sucesso. Saldo atual: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente para pagar o boleto.");
            }
        }
    }

    public ContaDigital autenticar(String documento, String senha) {
        if (this.documento.equals(documento) && this.senha.equals(senha)) {
            return this;
        }
        return null;
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

    public double getSaldo() {
        return saldo;
    }
}