//obs: tentei fazer o método do boleto, porém me perdi, e acabei deixando de lado. Entendo o desconto da nota.

package aula07_trabalho_bimestral;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    private static final String String = null;
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("** Selecione a operação que deseja realizar! **");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Depositar saldo");
        System.out.println("3 - Sacar saldo");
        System.out.println("4 - Transferir/pagar saldo");
        System.out.println("5 - Consultar saldos e contas");
        System.out.println("6 - Simular consulta");
        System.out.println("7 - Sair");



        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listarContas();
                break;

            case 6:
            System.out.println("teste6");

            break;


            case 7:
                System.out.println("Agradecemos o uso da nossa ferramenta!");
                System.exit(0);

            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;
        }
    }
    public static void criarConta() {

        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("Email: ");
        String email = input.next();

        Pessoa cliente = new Pessoa(nome, cpf, email);

        Conta conta = new Conta(cliente);

        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada com sucesso!");

        operacoes();

    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta contaa : contasBancarias) {
                if(contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }else {
            System.out.println("Conta não encontrada");
        }

        operacoes();

    }

    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Conta não encontrada");
        }

        operacoes();

    }

    public static void transferir() {
        System.out.println("Número da conta que vai enviar a transferência: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);

            }else {
                System.out.println(" A conta para depósito não foi encontrada ");
            }

        }else {
            System.out.println(" Conta para transferência não encontrada ");
        }
        operacoes();
    }

    public static void listarContas() {
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
                System.out.println(conta);
            }
        }else {
            System.out.println(" Não há contas cadastradas ");
        }

        operacoes();
    }


/* 
    public static void consultarBoleto(Scanner scanner)
        System.out.println("Informe a linha digitável");
        String linhaDigitavel = scanner.next();
        consultarBoleto(linhaDigitavel);
    
*/
    

    /*public Double extrairValorLinhaDigitavel(){
        System.out.println("Informe a linha digitavel");

        Double linhaDigitavel = input.next();
        Integer valorInt = Integer.parseInt(null);
        Double valorBoleto = Double.parseDouble(linhaDigitavel.substring(38, 47));
        System.out.println("Contulta");
    }
    public Double extrairValorLinhaDigitavel(String linhaDigitavel) {
        // Verificar se a linha digitável tem o tamanho correto
        if (linhaDigitavel.length() != 47) {
            System.out.println("Linha digitável inválida. Tamanho incorreto.");
            return 0.0; // Ou outro valor de retorno adequado
        }
    
        // Extrair o valor do boleto da linha digitável
        try {
            String valorString = linhaDigitavel.substring(37, 47);
            Double valorBoleto = Double.parseDouble(valorString) / 100; // Divide por 100 para considerar centavos
            return valorBoleto;
        } catch (NumberFormatException e) {
            System.out.println("Erro ao extrair o valor da linha digitável.");
            return 0.0; // Ou outro valor de retorno adequado
        }
    }*/
    }