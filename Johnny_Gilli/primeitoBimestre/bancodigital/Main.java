package Johnny_Gilli.bancodigital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Conta novaConta = null;

        int sair = 0;
        while (sair!=1) {
            System.out.println("\nDigite o que você quer fazer:\n1 - Criar uma conta.\n2 - Fazer login.\n3 - Interagir com o saldo.\n4 - Sair.");
            int op = input.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o documento: ");
                    String documento = scanner.nextLine();

                    System.out.println("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.println("Digite o e-mail: ");
                    String email = scanner.nextLine();

                    System.out.println("Digite a senha: ");
                    String senha = scanner.nextLine();

                    System.out.println("Digite o saldo: ");
                    double saldo = input.nextDouble();

                    novaConta = new Conta(nome, documento, telefone, email, senha, saldo);

                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Informações da conta:");
                    break;

                case 2:
                    if (novaConta != null) {
                        System.out.println("\nFaça login:");

                        System.out.println("Digite o documento: ");
                        String inputDocumento = scanner.nextLine();

                        System.out.println("Digite a senha: ");
                        String inputSenha = scanner.nextLine();

                        if (novaConta.fazerLogin(inputDocumento, inputSenha)) {
                            System.out.println("\nLogin bem-sucedido!\n");
                            novaConta.exibirConta();
                        } else {
                            System.out.println("Login falhou. Verifique suas credenciais.");
                        }
                    }else{
                        System.out.println("Você precisa criar uma conta antes de fazer login.\n");
                    }
                    break;

                case 3:
                    if (novaConta != null) {
                    int sair02 = 0;
                    //saldo
                    while(sair02!=1){
                        System.out.println("\nDigite o que você quer fazer:\n1 - Consulta saldo.\n2 - Creditar conta.\n3 - Simular consulta.\n4 - Simular PGTO.\n5 - Sair.");
                        int saldo3 = input.nextInt();

                        switch(saldo3){
                            //Consulta saldo;
                            case 1:
                                System.out.println("Saldo atual: " + novaConta.getSaldo()+"\n");
                                break;

                            //Creditar conta;
                            case 2:
                                System.out.println("Digite o valor a ser creditado: ");
                                double valorCredito = scanner.nextDouble();
                                novaConta.creditarConta(valorCredito);
                                System.out.println("Crédito realizado com sucesso. Novo saldo é: " + novaConta.getSaldo()+"\n");                            
                                break;

                            //Simular consulta(Capturar valor linha do boleto);
                            //38 a 47 valor do boleto, 10 ultimos é o valor do boleto, exemplo:
                            //Codigo do boleto == 00190500954014481606906809350314337370000003300 == R$33,00;
                            case 3:
                                Double valorLeitura = codigoBoletoLeitura(scanner);
                                System.out.println("O valor do boleto é: R$"+valorLeitura+" reais.");
                                break;

                            //Simular pagamento do boleto;
                            case 4:
                                Double valorPagamento = codigoBoletoLeitura(scanner);
                                System.out.println("O valor do boleto é: R$"+valorPagamento+" reais.");
                                double valorpago = valorPagamento;
                                novaConta.pagarBoleto(valorpago);
                                System.out.println("Crédito realizado com sucesso. Novo saldo é: " + novaConta.getSaldo()+"\n");                            
                                break;

                            //Sair;
                            case 5:
                                System.out.println("Saindo para menu principal.");
                                sair02=1;
                                break;

                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    }
                    }else{
                        System.out.println("Você precisa fazer login.\n");
                    }        
                    break;   

                case 4:
                    sair = 1;
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
        input.close();
    }
    // Método para realizar leitura e pagamento do boleto
    public static double codigoBoletoLeitura(Scanner scanner){
        System.out.println("\nDigite a linha do boleto: ");
        String boleto = scanner.nextLine();
        String inteiro = boleto.substring(37, 45);
        String decimal = boleto.substring(45, 47);
        return Double.valueOf(inteiro + "." + decimal);
    }
}
