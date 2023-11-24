package trabalho.aula6.aula6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Conta {
    private String documento;
    private String senha;
    private double saldo;

    public Conta(String documento, String nome, String telefone, String email, String senha) {
        this.documento = documento;
        this.senha = senha;
        this.saldo = 500.0; // Saldo inicial de R$ 500
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

class Boleto {
    private static final double VALOR_BOLETO = 400.0; // Valor fixo do boleto
    private String numero;
    private boolean pago;

    public Boleto(String numero) {
        this.numero = numero;
        this.pago = false;
    }

    public String getNumero() {
        return numero;
    }

    public double getValor() {
        return VALOR_BOLETO;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar() {
        pago = true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Conta> contas = new HashMap<>();
        Map<String, Boleto> boletos = new HashMap<>();
        Conta contaLogada = null;

        while (true) {
            if (contaLogada == null) {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1 - Criar uma conta");
                System.out.println("2 - Fazer login na conta");
                System.out.println("3 - Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o documento: ");
                        String documento = scanner.nextLine();
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();
                        System.out.print("Digite o email: ");
                        String email = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();
                        Conta novaConta = new Conta(documento, nome, telefone, email, senha);
                        contas.put(documento, novaConta);
                        System.out.println("Conta criada com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o documento: ");
                        String loginDocumento = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String loginSenha = scanner.nextLine();
                        Conta conta = contas.get(loginDocumento);
                        if (conta != null && conta.getSenha().equals(loginSenha)) {
                            contaLogada = conta;
                            System.out.println("Login bem-sucedido.");
                        } else {
                            System.out.println("Documento ou senha incorretos.");
                        }
                        break;

                    case 3:
                        System.out.println("Saindo da aplicação.");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1 - Saldo");
                System.out.println("2 - Depósito");
                System.out.println("3 - Saque");
                System.out.println("4 - Menu Boletos");
                System.out.println("5 - Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (escolha) {
                    case 1:
                        System.out.println("Saldo atual: R$" + contaLogada.getSaldo());
                        break;

                    case 2:
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha
                        if (valorDeposito > 0) {
                            contaLogada.creditarSaldo(valorDeposito); // Adiciona o valor ao saldo
                            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
                        } else {
                            System.out.println("Valor inválido. O valor do depósito deve ser maior que zero.");
                        }
                        break;

                    case 3: // Opção Saque
                        System.out.print("Digite o valor a ser sacado: ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha
                        if (valorSaque > 0) {
                            if (contaLogada.debitarSaldo(valorSaque)) {
                                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                        } else {
                            System.out.println("Valor inválido. O valor do saque deve ser maior que zero.");
                        }
                        break;

                    case 4:
                        // Menu Boletos
                        while (true) {
                            System.out.println("\nMenu Boletos:");
                            System.out.println("1 - Ver boleto");
                            System.out.println("2 - Pagar boleto");
                            System.out.println("3 - Voltar");

                            int escolhaBoletos = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha

                            switch (escolhaBoletos) {
                                case 1:
                                System.out.print("Digite o número do boleto: ");
                                String numeroBoleto = scanner.nextLine();

                                // Crie um boleto com o número digitado e o valor fixo de R$ 400.0
                                Boleto boleto = new Boleto(numeroBoleto);
                                boletos.put(numeroBoleto, boleto);

                                System.out.println("Conta de luz");
                                System.out.println("Vencimento: 10/10/2023");
                                System.out.println("Valor: R$" + boleto.getValor());
                                break;

                            case 2:
                                System.out.print("Digite o número do boleto a pagar: ");
                                String numeroBoletoPagar = scanner.nextLine();
                                Boleto boletoPagar = boletos.get(numeroBoletoPagar);

                                if (boletoPagar != null) {
                                    if (contaLogada.debitarSaldo(boletoPagar.getValor())) {
                                        boletoPagar.pagar();
                                        System.out.println("Boleto pago com sucesso.");
                                    } else {
                                        System.out.println("Saldo insuficiente.");
                                    }
                                } else {
                                    System.out.println("Boleto não encontrado.");
                                }
                                break;

                                case 3:
                                    // Voltar para o menu principal
                                    break;

                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }

                            if (escolhaBoletos == 3) {
                                break; // Sair do menu Boletos e voltar para o menu principal
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Saindo da conta.");
                        contaLogada = null;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        }
    }
}