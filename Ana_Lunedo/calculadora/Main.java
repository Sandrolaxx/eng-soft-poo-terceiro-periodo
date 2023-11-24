package Ana_Lunedo.calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseEscolha = "Selecione a operação: \n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";
        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);

        int escolha = input.nextInt();

        if (escolha == 5) {
            System.out.println("Obrigado por utilizar");
            return;
        }

        System.out.println("Insira o primeiro valor");
        double valorUm = input.nextDouble();

        System.out.println("Insira o segundo valor");
        double valorDois = input.nextDouble();

         Calculadora calculadora = new Calculadora(valorUm, valorDois);

        switch (escolha) {
            case 1:
                System.out.println("Resultado da Soma: " + calculadora.somar());
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + calculadora.subtrair());
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + calculadora.multiplicar());
                break;
            case 4:
                System.out.println("Resultado da Divisão: " + calculadora.dividir());
                break;
        }
    }
}
