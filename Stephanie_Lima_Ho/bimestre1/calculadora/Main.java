import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fraseEscolha = "Escolha uma operação:\n1 - Adição \n2 - subtração \n3 - multiplicação \n4 - divisão \n5 - Sair";
        Scanner input = new Scanner(System.in);
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

                    Calculadora calcular = new Calculadora(n1, n2);
                    

                    switch (escolha) {
                        case 1:
                           resultado =  calcular.somar(calcular.getNumberA(),calcular.getNumberB());
                            break;
                        case 2:
                            resultado = calcular.subtrair(calcular.getNumberA(), calcular.getNumberB());
                            break;
                        case 3:
                            resultado = calcular.multiplicar(calcular.getNumberA(), calcular.getNumberB());
                            break;
                        case 4:
                            resultado = calcular.dividir(calcular.getNumberA(), calcular.getNumberB());
                        break;
                        default:
                            System.out.println("operação invalida!");
                            
                        }

                            System.out.println("resultado: "+resultado);
                            System.out.println("-----------------------------------");
                    }
        }
                
            }

