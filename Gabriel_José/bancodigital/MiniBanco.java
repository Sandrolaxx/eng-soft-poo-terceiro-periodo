package Gabriel_José.bancodigital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Conta {
    private String nome;
    private String documento;
    private String telefone;
    private String email;
    private String senha;
    private double saldo;

    public Conta(String nome, String documento, String telefone, String email, String senha) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditarSaldo(double valor) {
        saldo += valor;
    }

    public boolean debitarSaldo(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }
}

public class MiniBanco {

    private static Map<String, Conta> contas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;

        while (!sair) {
            System.out.println("Bem-vindo ao Mini Banco Digital!");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Fazer login");
            System.out.println("3. Creditar saldo");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (escolha) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    fazerLogin();
                    break;
                case 3:
                    creditarSaldo();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void criarConta() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu documento: ");
        String documento = scanner.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        Conta conta = new Conta(nome, documento, telefone, email, senha);
        contas.put(documento, conta);
        System.out.println("Conta criada com sucesso.");
    }

    private static void fazerLogin() {
        System.out.print("Digite seu documento: ");
        String documento = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        Conta conta = contas.get(documento);
        if (conta != null && conta.getDocumento().equals(documento) && conta.getEmail().equals(senha)) {
            System.out.println("Login bem-sucedido. Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Documento ou senha inválidos.");
        }
    }

    private static void creditarSaldo() {
        System.out.print("Digite o número da conta para creditar o saldo: ");
        String numeroConta = scanner.nextLine();
        System.out.print("Digite o valor a ser creditado: ");
        double valorCredito = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        Conta conta = contas.get(numeroConta);

        if (conta != null) {
            conta.creditarSaldo(valorCredito);
            System.out.println("Saldo creditado com sucesso. Novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void consultarSaldo() {
        System.out.print("Digite o número da conta para consultar o saldo: ");
        String numeroConta = scanner.nextLine();

        Conta conta = contas.get(numeroConta);

        if (conta != null) {
            System.out.println("Saldo atual da conta: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}