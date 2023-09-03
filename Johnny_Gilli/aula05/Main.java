 package Johnny_Gilli.aula05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseEscolha = "Me diga o operador:\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";

        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);    
        
        int escolha = input.nextInt();

        System.out.println(escolha);

        if(escolha == 5){
            System.out.println("Adeus xxx!!!");
            return;
        };
        
        Calculadora calculadora = new Calculadora();

        System.out.println("Insira o 1° valor: ");
        calculadora.valorUm = input.nextDouble();
                
        System.out.println("Insira o 2° valor: ");
        calculadora.valorDois = input.nextDouble();

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
                calculadora.divisao();
                break;
        
            default:
                break;
        }
    }
 }