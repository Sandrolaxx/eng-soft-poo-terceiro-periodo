package Sandro_Matheus_Ramos.trabalhominibanco.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoService {

    private List<Main> contas = new ArrayList<>();

    public void apresentarMenuInicial() {
        char escolha = '0';
        Scanner input = new Scanner(System.in);

        while (escolha != '3') {
            System.out.println("-----------------------------------");
            System.out.println("[1]Abrir conta\n[2]Realizar Login\n[3]Sair");
            escolha = input.nextLine().charAt(0);

            switch (escolha) {
                case '1':
                    realizarAbertura(input);
                    break;
                case '2':
                    Main conta = realizarLogin(input);

                    if (conta == null) {
                        System.out.println("Conta não encontrada");
                        break;
                    }

                    apresentarMenuLogado(conta);
                case '3':
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        }
    }

    public void apresentarMenuLogado(Main conta) {
        System.out.println("-----------------------------------");
        System.out.println("Olá " + conta.getNome() + "\n");

        char escolha = '0';
        Scanner input = new Scanner(System.in);

        while (escolha != '5') {
            System.out.println(
                    "[1]Consultar Saldo\n[2]Creditar Conta\n[3]Simuar consulta\n[4]Simular pagamento\n[5]Deslogar");
            escolha = input.nextLine().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Consultando saldo....\n");
                    // Printar saldo
                    break;
                case '2':
                    System.out.println("Creditar conta....\n");
                    // Fluxo adição saldo conta
                    break;
                case '3':
                    Double valorBoleto = extrairValorLinhaDigitavel(input);

                    System.out.println("Valor boleto consultado R$ " + valorBoleto);
                    break;
                case '4':
                    Double valorBoletoPgto = extrairValorLinhaDigitavel(input);

                    if (valorBoletoPgto > conta.getSaldo()) {
                        System.out.println("Valor inválido. Valor título superior ao saldo!");
                        break;
                    }
                    
                    // Realizar pgto - debita conta
                    break;
                case '5':
                    System.out.println("Deslogando....");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void realizarAbertura(Scanner input) {
        System.out.println("Realizando abertura de conta");
        System.out.println("Informe seu documento:");
        String documento = input.nextLine();
        System.out.println("Informe seu nome:");
        String nome = input.nextLine();
        System.out.println("Informe sua senha:");
        String senha = input.nextLine();

        Main conta = new Main(documento, nome, null, null, senha);

        contas.add(conta);
    }

    public Main realizarLogin(Scanner input) {
        System.out.println("Realizando login");
        System.out.println("Informe seu documento:");
        String documento = input.nextLine();
        System.out.println("Informe sua senha:");
        String senha = input.nextLine();

        for (Main conta : contas) {
            if (conta.getDocumento().equals(documento)
                    && conta.getSenha().equals(senha)) {
                return conta;
            }
        }

        return null;
    }

    public Double extrairValorLinhaDigitavel(Scanner input) {
        System.out.println("Informe linha digitável:");

        String linhaDigitavel = input.nextLine();
        String inteiro = linhaDigitavel.substring(37, 45);
        String decimal = linhaDigitavel.substring(45, 47);

        // Integer valorInt = Integer.parseInt(linhaDigitavel.substring(38, 47));
        // BigDecimal valorBoleto = new BigDecimal(valorInt).movePointLeft(2);

        return Double.valueOf(inteiro + "." + decimal);
    }

}
