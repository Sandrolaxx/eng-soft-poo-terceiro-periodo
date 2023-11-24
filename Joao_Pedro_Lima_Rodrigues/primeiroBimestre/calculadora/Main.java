import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //escolha
        //primeiro pegar valores do usuário
        //realizar a operação escolhida

        String fraseEscolha = "Selecione a operação\n[1]Soma[2]Subtração[3]Multiplicação\n[4]Divisão[5]Sair";

        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);

        int escolha = input.nextInt();

        if (escolha == 5){
            System.out.println("Obrigado por utilizar!");
            return;
        }

        System.out.println("Insira o primeiro valor: ");
        double valorUm = input.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double valorDois = input.nextDouble();

        Calculadora calculadora = new Calculadora(valorUm, valorDois);

        switch (escolha) {
            case 1:
                calculadora.soma();
                break;
            case 2:
                calculadora.subtracao();
                break;
            case 3:
                calculadora.multiplicacao();
                break;
            case 4:
                calculadora.divisao();
                break;
        }
    }
    
}
