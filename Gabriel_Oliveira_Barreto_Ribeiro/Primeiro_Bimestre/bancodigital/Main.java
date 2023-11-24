package Gabriel_Oliveira_Barreto_Ribeiro.bancodigital;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("Selecione uma opção:\n1. Criar uma conta \n2. Fazer login\n3. Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Banco.openAccount(scanner, Banco.getAccounts());
                    break;
                case 2:
                    Banco.logIn(scanner, Banco.getAccounts());
                    break;

                case 3:
                    System.out.println("Encerrando aplicação...");
                    run = false;
                    break;
            }
        }
    }
}