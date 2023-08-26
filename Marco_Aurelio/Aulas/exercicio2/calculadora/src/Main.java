import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 5){
        System.out.println("Selecione uma operação: \n[1] SOMA \n[2] SUBTRAÇÃO \n[3] MUTIPLICAÇÃO \n[4] DIVISÃO \n[5] SAIR");
         escolha = scanner.nextInt();

        System.out.println("Digite seus valores: ");
        double v1 = scanner.nextDouble();
        System.out.println("+ - * /");
        double v2 = scanner.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = Calculadora.soma(v1, v2);
            break;

            case 2:
                resultado = Calculadora.subt(v1, v2);
            break;

            case 3:
                resultado = Calculadora.multi(v1, v2);
            break;

            case 4:
                resultado = Calculadora.divi(v1, v2);
            break;

            default:
                System.out.println("Operação invalida! ");
            break;
        }

        System.out.println("Resultado: " + resultado);
    }

        scanner.close();
    }
}