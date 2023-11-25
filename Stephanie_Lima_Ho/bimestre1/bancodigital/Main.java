package Stephanie_Lima_Ho.bancodigital;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("Selecione uma opção:\n1. Já tenho uma conta\n2. Não tenho uma conta\n3. Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Bank.logIn(scanner, Bank.getAccounts());
                    break;
                case 2:
                    Bank.openAccount(scanner, Bank.getAccounts());
                    break;

                case 3:
                    System.out.println("Encerrando aplicação...");
                    run = false;
                    break;
            }
        }
    }
}
