import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

        String fraseEscolha = "Escolha\n[1] Soma\n[2] Subtração\n[3] Divisão\n[4] Multiplicação\n[5] Sair";
        Scanner input = new Scanner(System.in);

        System.out.println(fraseEscolha);
        int escolha = input.nextInt();

        if(escolha == 5){
            System.out.println("Obrigado por utilizar!");
            return;
        }

        System.out.println("Insira o primeiro valor: ");
        double valorUm = input.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double valorDois = input.nextDouble();


        switch (escolha) {
            case 1:
                System.out.println(valorUm+valorDois);
                break;
            case 2:
                System.out.println(valorUm-valorDois);
                break;
            case 3:
                System.out.println(valorUm/valorDois);
                break;
            case 4:
                System.out.println(valorUm*valorDois);
                break;
        
            default:
                break;
        }
    }
}
