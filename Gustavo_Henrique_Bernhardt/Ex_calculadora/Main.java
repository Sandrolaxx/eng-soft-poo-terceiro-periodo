import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        String fraseSensor = "Selecione uma operação: \n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair";
        Scanner input = new Scanner(System.in);
        System.out.println(fraseSensor);

        int escolha = input.nextInt();

        if (escolha == 5){
            System.out.println("Obrigado por utilizar nosso sistema. ");
            return;
        }

        System.out.println("Insira o primeiro valor. ");
        double numero1 = input.nextDouble();

        System.out.println("Insira o segundo valor. ");
        double numero2 = input.nextDouble();

        Calculadora calculadora = new Calculadora(numero1, numero2);

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