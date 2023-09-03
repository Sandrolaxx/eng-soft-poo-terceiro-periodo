import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 5) {
            System.out.println("Selecione uma operação: \n[1] SOMA \n[2] SUBTRAÇÃO \n[3] MUTIPLICAÇÃO \n[4] DIVISÃO \n[5] SAIR");
            escolha = scanner.nextInt();
            
            double resultado = 0;

            switch (escolha) {
                case 1:
                    System.out.println("Digite seus valores: ");
                    double v1 = scanner.nextDouble();
                    System.out.println("+");
                    double v2 = scanner.nextDouble();
                    CalcE calculadora = new CalcE(v1, v2);
                    resultado = calculadora.soma(calculadora.getA(), calculadora.getB());
                    break;

                case 2:

                    System.out.println("Digite seus valores: ");
                    v1 = scanner.nextDouble();
                    System.out.println("-");
                    v2 = scanner.nextDouble();
                    calculadora = new CalcE(v1, v2);
                    resultado = calculadora.subt(calculadora.getA(), calculadora.getB());
                    break;

                case 3:

                    System.out.println("Digite seus valores: ");
                    v1 = scanner.nextDouble();
                    System.out.println("*");
                    v2 = scanner.nextDouble();
                    calculadora = new CalcE(v1, v2);
                    resultado = calculadora.multi(calculadora.getA(), calculadora.getB());
                    break;

                case 4:

                    System.out.println("Digite seus valores: ");
                    v1 = scanner.nextDouble();
                    System.out.println("/");
                    v2 = scanner.nextDouble();
                    calculadora = new CalcE(v1, v2);
                    resultado = calculadora.divi(calculadora.getA(), calculadora.getB());
                    break;

                default:
                    if (escolha == 5) {
                        System.out.println("...");
                    } else {
                        System.out.println("Operação invalida! ");
                    }
                    break;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}