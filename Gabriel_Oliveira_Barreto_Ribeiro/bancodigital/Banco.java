package Gabriel_Oliveira_Barreto_Ribeiro.bancodigital;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    private static List<CreateAccount> accounts = new ArrayList<>();

    public static List<CreateAccount> getAccounts() {
        return accounts;
    }

    public static void setAccounts(List<CreateAccount> accounts) {
        Banco.accounts = accounts;
    }

    public static void openAccount(Scanner scanner, List<CreateAccount> accounts) {

        int nextAccountID = accounts.size() + 1;

        System.out.println("ABRINDO CONTA \nNome completo:");
        String name = scanner.nextLine();

        System.out.println("Documento (CPF):");
        String document = scanner.nextLine();

        System.out.println("Telefone:");
        String phone = scanner.nextLine();

        System.out.println("E-mail:");
        String email = scanner.nextLine();

        System.out.println("Senha:");
        String password = scanner.nextLine();

        CreateAccount newAccounts = new CreateAccount(nextAccountID, name, document, phone, email, password);
        accounts.add(newAccounts);
    }

    public static void logIn(Scanner scanner, List<CreateAccount> accounts) {
        System.out.println("LOGIN\n\nDocumento (CPF):");
        String login = scanner.nextLine();

        System.out.println("Senha:");
        String accountPassword = scanner.nextLine();
        System.out.println("Carregando...");

        if (accounts.isEmpty()) {
            System.out.println("Não há cadastro. Tente Novamente.");
        } else {
            boolean logInComplete = false;
            boolean logOff = false;
            for (CreateAccount currentAccount : accounts) {
                if (currentAccount.getDocument().equals(login) && currentAccount.getPassword().equals(accountPassword)) {

                    logInComplete = true;
                        System.out.println("\n\n--------------------------------------");
                        System.out.println("Número da Conta: " + currentAccount.getAccountID()+ "\nSALDO ATUAL: " + currentAccount.getBalance());
                        System.out.println("--------------------------------------");
                    while (logInComplete) {

                        System.out.println("\n[MENU]\n1. Consultar saldo\n2. Depositar\n3. Consultar boleto\n4. Pagar boleto\n5. Sair da conta");
                        String option = scanner.nextLine();

                        switch (option) {

                            case "1":
                                System.out.println("\n\nNome:" + currentAccount.getName() + "\nSaldo: R$" + currentAccount.getBalance());
                                break;

                            case "2":
                                System.out.println("[Deposito]\n\nNúmero da Conta:");
                                int accountId = scanner.nextInt();
                                scanner.nextLine();

                                boolean accountExists = false;
                                CreateAccount selectedAccount = null;
                                for (CreateAccount account : accounts) {
                                    if (account.getAccountID() == accountId) {
                                        accountExists = true;
                                        selectedAccount = account;
                                        break;
                                    }
                                }

                                if (!accountExists) {
                                    System.out.println("Conta não encontrada. Tente novamente.\n");
                                } else {
                                    System.out.println("Valor: R$");
                                    double deposit = scanner.nextDouble();
                                    scanner.nextLine();

                                    if (deposit <= 0) {
                                        System.out.println("Valor inválido! Tente Novamente.\n");
                                    } else {
                                        selectedAccount.transfer(deposit);
                                        System.out.println("\n\nDepósito efetuado com sucesso.\n");
                                        System.out.println("[COMPROVANTE] DADOS DO DESTINATÁRIO\n\nConta: " + accountId + "\nValor: R$" + deposit);
                                    }
                                }
                                break;

                            case "3":
                                System.out.println("[Consulta boleto]\n\nInsira a Linha Digitável:");
                                String boleto = scanner.nextLine();
                                double price = readBoleto(boleto);
                                if (price != 0) {
                                    System.out.println("Valor a pagar: R$" + price);
                                }
                                break;

                            case "4":
                                System.out.println("[Pagamento boleto]\n\nInsira a Linha Digitável:");
                                boleto = scanner.nextLine();
                                price = readBoleto(boleto);

                                if (price != 0) {
                                    System.out.println("\nDeseja efetuar o pagamento do boleto no valor de R$ "+ price + "?\n\n1. Sim\n2. Não\n");
                                    String answer = scanner.nextLine();
                                    if (answer.equals("1")) {
                                        System.out.println("Processando pagamento...\n");
                                        if (currentAccount.getBalance() >= price) {
                                            currentAccount.pay(price);
                                            System.out.println("\n\nBoleto Pago!\n");
                                        } else {
                                            System.out.println("\n\nSaldo Insuficiente!\n");
                                        }
                                    } else if (answer.equals("2")) {
                                        System.out.println("Cancelando Operação...\n");
                                    } else {
                                        System.out.println("Operação Inválida!!\n");
                                    }
                                }
                                break;

                            case "5":
                                logInComplete = false;
                                logOff = true;
                                break;
                            default:
                                System.out.println("Operação Inválida!\n");
                                break;
                        }
                    }

                    break;
                }
            }
            if (!logInComplete) {
                if (logOff) {
                    System.out.println("Encerrando...\n");
                    logOff = false;
                } else {
                    System.out.println("LogIn ou Senha inválidos! Tente Novamente.\n");
                }
            }
        }
    }

    public static double readBoleto(String boleto) {
        if (boleto.length() >= 47 && boleto.length() < 49) {
            String parteInteiraStr = boleto.substring(boleto.length() - 10);

            try {
                double parteInteira = Double.parseDouble(parteInteiraStr);
                double valorDouble = parteInteira / 100.00;
                return valorDouble;
            } catch (NumberFormatException e) {
                System.out.println("Código Inválido! Tente Novamente.");
                return 0;
            }
        } else {
            System.out.println("Código Inválido! Tente Novamente.");
            return 0;
        }
    }

}