package segundobimestre.tarefabanco;

import java.util.ArrayList;
import java.util.List;

class Tarefa {
    private double valor;

    public Tarefa(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class ContaDigital {
    private String documento;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private List<Tarefa> tarefas;

    public ContaDigital(String documento, String nome, String telefone, String email, String senha) {
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.tarefas = new ArrayList<>();
    }

    public void mostrarSaldo() {
        double saldo = calcularSaldo();
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void creditarSaldo(double valor) {
        Tarefa tarefa = new Tarefa(valor);
        tarefas.add(tarefa);
        System.out.println("Saldo creditado com sucesso. Saldo atual: R$" + calcularSaldo());
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
        if (linhaDigitavel.length() != 48) {
            System.out.println("Boleto inválido.");
            return;
        }

        double valor = Double.parseDouble(linhaDigitavel.substring(37, 47)) / 100.0;
        if (calcularSaldo() >= valor) {
            Tarefa tarefa = new Tarefa(-valor);
            tarefas.add(tarefa);
            System.out.println("Pagamento realizado com sucesso. Saldo atual: R$" + calcularSaldo());
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }

    public ContaDigital autenticar(String documento, String senha) {
        if (this.documento.equals(documento) && this.senha.equals(senha)) {
            return this;
        }
        return null;
    }

    private double calcularSaldo() {
        double saldo = 0.0;
        for (Tarefa tarefa : tarefas) {
            saldo += tarefa.getValor();
        }
        return saldo;
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
}
