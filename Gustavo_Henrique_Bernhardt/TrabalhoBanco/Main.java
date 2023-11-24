import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        char escolha = '0';

        Scanner input = new Scanner(System.in);

        while (escolha != '3') {
            System.out.println("1. Abrir Conta");
            System.out.println("2. Login");
            System.out.println("3. Sair");

            escolha = input.nextLine().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Realizar abertura de conta");
                    System.out.println("Informe seu documento");
                    String documento = input.nextLine();
                    System.out.println("Informe seu nome");
                    String nome = input.nextLine();
                    System.out.println("Informe seu telefone");
                    String telefone = input.nextLine();
                    System.out.println("Informe seu e-mail");
                    String email = input.nextLine();
                    System.out.println("Informe sua senha");
                    String senha = input.nextLine();

                    Conta conta = new Conta(documento, nome, telefone, email, senha);

                    contas.add(conta);

                    for (Conta elemento : contas) {
                        System.out.println(elemento.toString());
                    }

                    break;
                case '2':
                    System.out.println("Login");
                    Conta contaSelecionada = null;

                    System.out.println("Informe seu documento");
                    String documentoLogin = input.nextLine();
                    System.out.println("Informe sua senha");
                    String senhaLogin = input.nextLine();

                    for (Conta elemento : contas) {
                        if (elemento.getDocumento().equals(documentoLogin)
                                && elemento.getSenha().equals(senhaLogin)) {
                            contaSelecionada = elemento;
                        }
                    }

                    if (contaSelecionada == null) {
                        System.out.println("Credenciais inválidas.");
                        break;
                    }
                    SegundoMenu(contaSelecionada, contas);
                    break;

                case '3':
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }
    }

    public static void SegundoMenu(Conta conta, List<Conta> contas) {

        char escolha = '0';

        Scanner input = new Scanner(System.in);

        while (escolha != '5') {
            System.out.println("1. Consulta de Saldo");
            System.out.println("2. Creditar Conta");
            System.out.println("3. Consultar Boleto");
            System.out.println("4. Simular Pagamento");
            System.out.println("5. Deslogar");

            escolha = input.nextLine().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Opção selecionada: SALDO");
                    System.out.println("Seu saldo atual é de R$" + conta.getSaldo() + ".");
                    break;
                case '2':
                    System.out.println("Opção selecionada: CREDITAR CONTA");
                    System.out.println("Qual valor deseja depositar? ");
                    double valor = Double.parseDouble(input.nextLine());

                    conta.realizarEntrada(valor);
                    System.out.println("Depósito realizado com sucesso!");

                    break;
                case '3':
                    System.out.println("Opção selecionada: CONSULTAR BOLETO");
                    System.out.println("Informe a linha digitável do boleto:");
                    String linhaDigitavel = input.nextLine();

                    if (validarLinhaDigitavel(linhaDigitavel)) {
                        Double valorLinha = extrairValorLinhaDigitavel(linhaDigitavel);
                        System.out.println("Valor do boleto: R$" + valorLinha);
                    } else {
                        System.out.println("Linha digitável inválida.");
                    }
                    break;
                case '4':
                    System.out.println("Opção selecionada: SIMULAR PAGAMENTO");
                    System.out.println("Informe a linha digitável do boleto a ser pago:");
                    linhaDigitavel = input.nextLine();
                    if (validarLinhaDigitavel(linhaDigitavel)) {
                        Double valorLinha = extrairValorLinhaDigitavel(linhaDigitavel);
                        if (conta.getSaldo() >= valorLinha) {
                            conta.realizarSaida(valorLinha);
                            System.out.println("Pagamento realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente para pagar o boleto.");
                        }
                    } else {
                        System.out.println("Boleto inválido.");
                    }
                    break;
                case '5':
                    System.out.println("Deslogando");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }
    }

    public static boolean validarLinhaDigitavel(String linhaDigitavel) {

        if (linhaDigitavel.length() != 47) {
            return false;
        }

        if (!linhaDigitavel.matches("[0-9]+")) {
            return false;
        }

        return true;
    }

    public static Double extrairValorLinhaDigitavel(String linhaDigitavel) {

        if (!validarLinhaDigitavel(linhaDigitavel)) {
            return null;
        }

        String valorParte = linhaDigitavel.substring(37, 47);

        Double valorCentavos = Double.parseDouble(valorParte) / 100.0;

        return valorCentavos;
    }
}
