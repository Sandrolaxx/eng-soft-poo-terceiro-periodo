package Gabriel_Oliveira_Barreto_Ribeiro.calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        String fraseEscolha = "Escolha uma operação:\n1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Sair";
        try (Scanner input = new Scanner(System.in)) {
            int escolha = 0;
            double resultado = 0;


            while(escolha != 5){
                System.out.println(fraseEscolha);
                escolha = input.nextInt(); 

                        if(escolha == 5){
                            return;
                        }

                    System.out.println("Digite o primeiro valor:");
                    double n1  = input.nextInt();

                    System.out.println("Digite o segundo valor:");
                    double n2 = input.nextInt(); 

                    FuncaoCalculadora calcular = new FuncaoCalculadora(n1, n2);
                    

                    switch (escolha) {
                        case 1:
                           resultado =  calcular.somar(calcular.getA(),calcular.getB());
                            break;
                        case 2:
                            resultado = calcular.subtrair(calcular.getA(), calcular.getB());
                            break;
                        case 3:
                            resultado = calcular.multiplicar(calcular.getA(), calcular.getB());
                            break;
                        case 4:
                            resultado = calcular.dividir(calcular.getA(), calcular.getB());
                        break;
                        default:
                            System.out.println("operação invalida!");
                            
                        }

                            System.out.println("resultado: "+resultado + "\n\n");
                    }
        }
                
            }
}
