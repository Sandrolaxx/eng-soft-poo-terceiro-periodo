package Joao_Pedro_Lima_Rodrigues.miniBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        char escolha = '0';

        while (escolha != '3') {

            System.out.println("Olá! Digite a opção desejada:\n [1] - Abrir conta\n [2] - Realizar login\n [3] - Sair");
            escolha = input.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Digite os seu documento");
                    String documento = input.next();

                    System.out.println("Digite a seu nome");
                    String nome = input.next();

                    System.out.println("Digite a seu telefone");
                    String telefone = input.next();

                    System.out.println("Digite a seu email");
                    String email = input.next();

                    System.out.println("Digite a sua senha");
                    String senha = input.next();

                    Conta conta = new Conta(documento, senha, nome, telefone, email);

                    System.out.println(conta.toString());
                    contas.add(conta);
                    break;
                case '2':
                    System.out.println("Login");
                    System.out.println("Digite os seu documento");
                    String documentoLogin = input.next();

                    System.out.println("Digite a sua senha");
                    String senhaLogin = input.next();

                    Conta contaSelecionada = null;

                    for (Conta conta2 : contas) {
                        if (conta2.getDocumento().equals(documentoLogin)
                                && conta2.getSenha().equals(senhaLogin)) {
                            contaSelecionada = conta2;
                        }
                    }

                    if (contaSelecionada == null) {
                        System.out.println("Não foi possível realizar login.");
                        break;
                    }

                    apresentarSegundoMenu(contaSelecionada);
                    break;
                case '3':
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }

    public static Double extrairValorLinhaDigitavel(Scanner input) {
        System.out.println("Informe linha digitável:");
        String linhaDigitavel = input.next();

        String decimais = linhaDigitavel.substring(45, 47);
        String inteiros = linhaDigitavel.substring(38, 45);

        return Double.valueOf(inteiros + "." + decimais);
    }

    public static void apresentarSegundoMenu(Conta conta) {
        Scanner input = new Scanner(System.in);
        char escolha = '0';

        while (escolha != '5') {

            System.out.println("Olá " + conta.getNome()
                    + " Digite a opção desejada:\n [1] - Consultar Saldo\n [2] - Creditar conta\n [3] - Consultar boleto \n [4] - Realizar Pagamento\n [5] Sair");
            escolha = input.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Seu saldo é " + conta.getSaldo());
                    break;
                case '2':
                    System.out.println("Valor a créditar");
                    Double valorCreditar = input.nextDouble();

                    conta.creditarSaldo(valorCreditar);

                    System.out.println("Saldo agora é: " + conta.getSaldo());
                    break;
                case '3':
                    Double valorExtraido = extrairValorLinhaDigitavel(input);
                    System.out.println("Valor do boleto R$ " + valorExtraido);
                    break;
                case '4':
                    Double valorExtraidoPagar = extrairValorLinhaDigitavel(input);

                    conta.debitarSaldo(valorExtraidoPagar);
            
                    System.out.println("Seu saldo é " + conta.getSaldo());
                    break;
                case '5':
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}