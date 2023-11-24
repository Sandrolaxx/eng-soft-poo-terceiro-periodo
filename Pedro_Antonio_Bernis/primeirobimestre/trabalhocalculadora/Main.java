package calculadorarefatorada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseEscolha = "Selecione a operação: \n[1]Soma\n[2]subtracao\n[3]Multiplicacao\n[4]Divisao\n[5]Sair";
        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);

        int escolha = input.nextInt();

        if (escolha == 5) {
            System.out.println("Obrigado por utilizar");
            return;
        }

        Calculadora calculadora = new Calculadora();

        System.out.println("Insira o primeiro valor");
        double valorUm = input.nextDouble();
        calculadora.setValorUm(valorUm);

        System.out.println("Insira o segundo valor");
        double valorDois = input.nextDouble();
        calculadora.setValorDois(valorDois);

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
        }
    }
}
