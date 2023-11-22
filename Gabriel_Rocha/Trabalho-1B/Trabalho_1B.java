import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Conta {
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

    public String getSenha() {
        return senha;
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
        }
        return false;
    }
}

public class MiniBancoDigital {
    private static Map<String, Conta> contas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Mini Banco Digital - Menu:");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Fazer login");
            System.out.println("3. Creditar saldo");
            System.out.println("4. Consultar boleto");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Sair");
            System.out.print("Escolha a opção: ");
           
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
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
                    consultarBoleto();
                    break;
                case 5:
                    pagarBoleto();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void criarConta() {
        System.out.print("Informe o documento: ");
        String documento = scanner.nextLine();
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Informe o e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Informe a senha: ");
        String senha = scanner.nextLine();

        if (contas.containsKey(documento)) {
            System.out.println("Conta já existe com esse documento.");
        } else {
            Conta conta = new Conta(documento, nome, telefone, email, senha);
            contas.put(documento, conta);
            System.out.println("Conta criada com sucesso.");
        }
    }

    private static void fazerLogin() {
        System.out.print("Informe o documento: ");
        String documento = scanner.nextLine();
        System.out.print("Informe a senha: ");
        String senha = scanner.nextLine();

        if (contas.containsKey(documento)) {
            Conta conta = contas.get(documento);
            if (conta.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido. Saldo: " + conta.getSaldo());
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void creditarSaldo() {
        System.out.print("Informe o documento: ");
        String documento = scanner.nextLine();
        System.out.print("Informe o valor a ser creditado: ");
        double valor = scanner.nextDouble();

        if (contas.containsKey(documento)) {
            Conta conta = contas.get(documento);
            conta.creditarSaldo(valor);
            System.out.println("Saldo creditado com sucesso. Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void consultarBoleto() {
        System.out.print("Informe a linha digitável do boleto: ");
        String linhaDigitavel = scanner.nextLine();
       
        
        System.out.println("Informações do boleto:");
        
    }

    private static void pagarBoleto() {
        System.out.print("Informe o documento: ");
        String documento = scanner.nextLine();
        System.out.print("Informe a linha digitável do boleto a ser pago: ");
        String linhaDigitavel = scanner.nextLine();

        if (contas.containsKey(documento)) {
            Conta conta = contas.get(documento);
           
           
            System.out.println("Boleto pago com sucesso. Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}