import java.util.Scanner;
//ponto de entrada do programa;
public class Main {
    public static void main(String[] args) {
        
        //Armazena a mensagem para o usuario;
        String fraseEscolha = "Me diga o operador:\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";

        //"Um objeto Scanner é criado para ler a entrada do usuário
        // a partir da linha de comando.";
        Scanner input = new Scanner(System.in);

        //Imprime a fraseEscolha;
        System.out.println(fraseEscolha);    
        
        //"Lé o próximo número inteiro (a escolha do usuário) 
        //fornecido pelo usuário na linha de comando e armazena-o na variável escolha."
        int escolha = input.nextInt();

        //Opção 5,
        if(escolha == 5){
            System.out.println("Adeus xxx!!!");
            return;
        };

        //Imprime a frase;
        System.out.print("Digite o primeiro valor: ");
        //Le o numero int e armazena ele;
        double valorUm = input.nextDouble();

        //Imprime a frase;
        System.out.print("Digite o segundo valor: ");
        //Le o numero int e armazena ele;
        double valorDois = input.nextDouble();

        //"Criando uma instância da classe CalculadoraObj chamada calculadora.";
        //E;
        //" O construtor da classe CalculadoraObj espera dois argumentos valorUm e valorDois";
        CalculadoraObj calculadora = new CalculadoraObj(valorUm, valorDois);

        //Armazena o resultado;
        double resultado = 0.0;

        //Escolha;
        switch (escolha) {
            case 1:
                resultado = calculadora.somar();
                break;

            case 2:
                resultado = calculadora.subtrair();
                break;  

            case 3:
                resultado = calculadora.multiplicar();
                break;

            case 4:
                resultado = calculadora.divisao();
                break;
        
            default:
                break;
        }

        //Imprime resultado;
        System.out.println("Resultado: " + resultado);
    }
}
