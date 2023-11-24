import java.util.Scanner;

public class Banco {

        private conta[] contas;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = input.nextLine();

        System.out.println("Insira seu documento:");
        String documento = input.nextLine();

        Conta conta1 = new Conta("Documento", nome);

        System.out.println(conta1.toString());
        this.contas = new Conta[] { conta };
        input.close();
    }

