import java.util.Scanner;

public class MiniBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        while (true) {
            System.out.println("Bem-vindo ao Mini Banco Digital!");
            System.out.println("1. Criar uma conta");
            System.out.println("2. Fazer login");
            System.out.println("3. Creditar saldo");
            System.out.println("4. Pagar boleto");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                     if (conta == null) {
                        System.out.print("Informe o documento: ");
                        String documento = scanner.nextLine();
                        System.out.print("Informe o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Informe o telefone: ");
                        String telefone = scanner.nextLine();
                        System.out.print("Informe o email: ");
                        String email = scanner.nextLine();
                        System.out.print("Informe a senha: ");
                        String senha = scanner.nextLine();

                        conta = new Conta(documento, nome, telefone, email, senha);
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Você já tem uma conta.");
                    }
                    break;
                case 2:
                    if (conta == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        System.out.print("Informe o documento: ");
                        String documento = scanner.nextLine();
                        System.out.print("Informe a senha: ");
                        String senha = scanner.nextLine();

                        if (conta.getDocumento().equals(documento) && conta.validarSenha(senha)) {
                            System.out.println("Login bem-sucedido!");
                        } else {
                            System.out.println("Documento ou senha incorretos.");
                        }
                    }
                    break;
                case 3:
                    if (conta == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        System.out.print("Informe o valor a ser creditado: ");
                        double valor = scanner.nextDouble();
                        conta.creditarSaldo(valor);
                        System.out.println("Saldo creditado com sucesso!");
                    }
                    break;
                case 4:
                    if (conta == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        System.out.print("Informe a linha digitável do boleto: ");
                        String linhaDigitavel = scanner.nextLine();
                        boolean pagamentoSucesso = conta.pagarBoleto(linhaDigitavel);
                        if (pagamentoSucesso) {
                            System.out.println("Boleto pago com sucesso!");
                        } else {
                            System.out.println("Falha no pagamento do boleto.");
                        }
                    }
                    break;
                    case 5:
                    if (conta == null) {
                        System.out.println("Você precisa criar uma conta primeiro.");
                    } else {
                        double saldo = conta.consultarSaldo();
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 6:
                    System.out.println("Obrigado por usar o Mini Banco Digital!");
                    System.exit(0);
                default:
                      System.out.println("Opção inválida.");
            }
        }
    }
}

