package Felipe_Diniz.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseEscolha = "Escolha o operador:\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";

        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);

        int escolha = input.nextInt();

        System.out.println(escolha);

        if (escolha == 5) {
            System.out.println("Tchau brigado");
            return;
        }
        ;

        System.out.println("Insira o 1° valor: ");
        double valorUm = input.nextDouble();

        System.out.println("Insira o 2° valor: ");
        double valorDois = input.nextDouble();

        Calculadora calculadora = new Calculadora(valorUm, valorDois);

        switch (escolha) {
            case 1:
                calculadora.somar();

                break;

            case 2:
                calculadora.subtrair();

                break;

            case 3:
                calculadora.multiplicar();

                break;

            case 4:
                calculadora.dividir();

                break;

            default:
                System.out.println("ERRO");
                break;
        }
    }
}
