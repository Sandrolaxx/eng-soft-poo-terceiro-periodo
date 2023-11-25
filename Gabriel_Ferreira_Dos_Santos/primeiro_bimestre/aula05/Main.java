package aula05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pra aparecer isso, digite "main"
        //escolha do usuário
        //primeiro pegar valores usuário
        //realizar a operação escolhida
        Calculadora calculadora = new Calculadora();

        String fraseEscolha = "Selecione a operação\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";

        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);
        int escolha = input.nextInt();

        if(escolha == 5){
            System.out.println("Obrigado por utilizar minha ferramenta!");
            return;
        }

        System.out.println("Insira o primeiro valor");
        Double valorUm = input.nextDouble();

        System.out.println("Insira o segundo valor");
        Double valorDois = input.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                //System.out.println(valorUm + valorDois);
                resultado = calculadora.somar(valorUm, valorDois);
                System.out.println(resultado);
                break;
            case 2:
                //System.out.println(valorUm - valorDois);
                resultado = calculadora.subtrair(valorUm, valorDois);
                System.out.println(resultado);
                break;
            case 3:
                //System.out.println(valorUm * valorDois);
                resultado = calculadora.multiplicar(valorUm, valorDois);
                System.out.println(resultado);
                break;
            case 4:
                resultado = calculadora.dividir(valorUm, valorDois);
                System.out.println(resultado);
                //System.out.println(valorUm / valorDois);
                break;
            default:
            System.out.println("Escolha inválida.");
                break;
        }

    }
}
