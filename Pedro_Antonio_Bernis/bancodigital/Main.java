package Pedro_Antonio_Bernis.bancodigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ContaDigital> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ContaDigital contaLogada = null;

        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Fazer login");
            if (contaLogada != null) {
                System.out.println("3. Mostrar Saldo");
                System.out.println("4. Creditar saldo");
                System.out.println("5. Consultar boleto");
                System.out.println("6. Pagar boleto");
            }
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    criarConta(contas, scanner);
                    break;

                case 2:
                    contaLogada = fazerLogin(contas, scanner);
                    break;

                case 3:
                    mostrarSaldo(contaLogada);
                    break;

                case 4:
                    creditarSaldo(contaLogada, scanner);
                    break;

                case 5:
                    consultarBoleto(contaLogada, scanner);
                    break;

                case 6:
                    pagarBoleto(contaLogada, scanner);
                    break;

                case 7:
                    sairPrograma(scanner);
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void criarConta(List<ContaDigital> contas, Scanner scanner) {
        System.out.print("Informe o documento: ");
        String documento = scanner.next();
        System.out.print("Informe o nome: ");
        String nome = scanner.next();
        System.out.print("Informe o telefone: ");
        String telefone = scanner.next();
        System.out.print("Informe o email: ");
        String email = scanner.next();
        System.out.print("Informe a senha: ");
        String senha = scanner.next();
        ContaDigital conta = new ContaDigital(documento, nome, telefone, email, senha);
        contas.add(conta);
        System.out.println("Conta criada com sucesso.");
    }

    private static ContaDigital fazerLogin(List<ContaDigital> contas, Scanner scanner) {
        System.out.print("Informe o documento: ");
        String documento = scanner.next();
        System.out.print("Informe a senha: ");
        String senha = scanner.next();

        for (ContaDigital c : contas) {
            ContaDigital contaAutenticada = c.autenticar(documento, senha);
            if (contaAutenticada != null) {
                System.out.println("Login realizado com sucesso.");
                return contaAutenticada;
            }
        }

        System.out.println("Documento ou senha incorretos.");
        return null;
    }

    private static void mostrarSaldo(ContaDigital contaLogada) {
        if (contaLogada != null) {
            contaLogada.mostrarSaldo();
        } else {
            System.out.println("Faça login antes de consultar o saldo.");
        }
    }

    private static void creditarSaldo(ContaDigital contaLogada, Scanner scanner) {
        if (contaLogada != null) {
            System.out.print("Informe o valor a ser creditado: ");
            double valor = scanner.nextDouble();
            contaLogada.creditarSaldo(valor);
        } else {
            System.out.println("Faça login antes de creditar saldo.");
        }
    }

    private static void consultarBoleto(ContaDigital contaLogada, Scanner scanner) {
        if (contaLogada != null) {
            System.out.print("Informe a linha digitável do boleto: ");
            String linhaDigitavel = scanner.next();
            contaLogada.consultarBoleto(linhaDigitavel);
        } else {
            System.out.println("Faça login antes de consultar um boleto.");
        }
    }

    private static void pagarBoleto(ContaDigital contaLogada, Scanner scanner) {
        if (contaLogada != null) {
            System.out.print("Informe a linha digitável do boleto: ");
            String linhaDigitavel = scanner.next();
            contaLogada.pagarBoleto(linhaDigitavel);
        } else {
            System.out.println("Faça login antes de pagar um boleto.");
        }
    }

    private static void sairPrograma(Scanner scanner) {
        System.out.println("Saindo do programa.");
        scanner.close();
        System.exit(0);
    }
}