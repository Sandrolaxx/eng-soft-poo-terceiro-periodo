package Fernando_Zgoda_Neto.bancodigital;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Conta> contas = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Fazer login");
            System.out.println("3. Creditar saldo");
            System.out.println("4. Consultar boleto");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Criar uma conta:");
                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    contas.put(documento, new Conta(documento, nome, telefone, email, senha));
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    System.out.println("Fazer login:");
                    System.out.print("Documento: ");
                    String loginDocumento = scanner.nextLine();
                    System.out.print("Senha: ");
                    String loginSenha = scanner.nextLine();
                    Conta conta = contas.get(loginDocumento);
                    if (conta != null && conta.login(loginSenha)) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Documento ou senha incorretos.");
                    }
                    break;
                case 3:
                    System.out.println("Creditar saldo:");
                    System.out.print("Número da conta: ");
                    String numConta = scanner.nextLine();
                    conta = contas.get(numConta);
                    if (conta != null) {
                        System.out.print("Valor a creditar: ");
                        double valor = scanner.nextDouble();
                        conta.creditarSaldo(valor);
                        System.out.println("Saldo creditado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Consultar boleto:");
                    System.out.print("Informe a linha digitável: ");
                    String linhaDigitavel = scanner.nextLine();
                    double valorBoleto = consultarBoleto(linhaDigitavel);
                    if (valorBoleto >= 0) {
                        System.out.println("Valor do boleto: R$" + valorBoleto);
                    } else {
                        System.out.println("Boleto inválido.");
                    }
                    break;
                case 5:
                    System.out.println("Pagar boleto:");
                    System.out.print("Número da conta: ");
                    String numContaPagar = scanner.nextLine();
                    conta = contas.get(numContaPagar);
                    if (conta != null) {
                        System.out.print("Informe a linha digitável do boleto: ");
                        String linhaDigitavelPagar = scanner.nextLine();
                        double valorBoletoPagar = consultarBoleto(linhaDigitavelPagar);
                        if (valorBoletoPagar >= 0) {
                            if (conta.pagarBoleto(valorBoletoPagar)) {
                                System.out.println("Boleto pago com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                        } else {
                            System.out.println("Boleto inválido.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static double consultarBoleto(String linhaDigitavel) {
        return 150.0;
    }
}

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

    public boolean login(String senha) {
        return this.senha.equals(senha);
    }

    public void creditarSaldo(double valor) {
        this.saldo += valor;
    }

    public boolean pagarBoleto(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
