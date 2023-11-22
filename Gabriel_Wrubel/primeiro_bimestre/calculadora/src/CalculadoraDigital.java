import java.util.Scanner;

public class CalculadoraDigital {
     public static void main(String[] args) throws Exception {
        String fraseEscolha = "Escolha uma operação:\n1 - Adição \n2 - subtração \n3 - multiplicação \n4 - divisão \n5 - Sair";
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        double res = 0;


        while(escolha != 5){
            System.out.println(fraseEscolha);
            escolha = input.nextInt(); 

                    if(escolha == 5){
                        return;
                    }

                System.out.println("Digite o primeiro valor:");
                double valorUM  = input.nextInt();

                System.out.println("Digite o segundo valor:");
                double valorDois = input.nextInt(); 

                FuncaoCalculadora calcular = new FuncaoCalculadora();

                switch (escolha) {
                    case 1:
                       res =  calcular.somar(valorUM, valorDois);
                        break;
                    case 2:
                        res = calcular.subtrair(valorUM, valorDois);
                        break;
                    case 3:
                        res = calcular.multiplicar(valorUM, valorDois);
                        break;
                    case 4:
                        res = calcular.dividir(valorUM, valorDois);
                    break;
                    default:
                        System.out.println("operação invalida!");
                        
                    }

                        System.out.println("resultado "+res);
                        System.out.println("-----------------------------------");
                }
                
            }
}
