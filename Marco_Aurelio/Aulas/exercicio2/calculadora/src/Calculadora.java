import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 5) {
            System.out.println("Selecione uma operação: \n[1] SOMA\n[2] SUBTRAÇÃO\n[3] MUTIPLICAÇÃO\n[4] DIVISÃO\n[5] SAIR");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite os valores da operação:");
                    double val1 = scanner.nextDouble();
                    System.out.println("+");
                    double val2 = scanner.nextDouble();
                    double calc = val1 + val2;
                    System.out.println(calc);
                    break;
                case 2:
                    System.out.println("Digite os valores da operação:");
                    val1 = scanner.nextDouble();
                    System.out.println("-");
                    val2 = scanner.nextDouble();
                    calc = val1 - val2;
                    System.out.println(calc);
                    break;
                case 3:
                    System.out.println("Digite os valores da operação:");
                    val1 = scanner.nextDouble();
                    System.out.println("X");
                    val2 = scanner.nextDouble();
                    calc = val1 * val2;
                    System.out.println(calc);
                    break;
                case 4:
                    System.out.println("Digite os valores da operação:");
                    val1 = scanner.nextDouble();
                    System.out.println("/");
                    val2 = scanner.nextDouble();
                    calc = val1 / val2;
                    System.out.println(calc);
                    break;
            }
        }
        scanner.close();
    }
}