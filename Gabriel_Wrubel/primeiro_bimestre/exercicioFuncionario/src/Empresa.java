import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) throws Exception {

    
        Scanner scanner = new Scanner(System.in);
        double [] salario = new double[3];

        System.out.println("digite seu nome:");
            String nome = scanner.nextLine();
        System.out.println("digite seu cargo");    
            String cargo = scanner.nextLine();
        System.out.println("digite sua idade:");
            int idade = scanner.nextInt();
        System.out.println("digite seu 1 salario:");
            salario[0] = scanner.nextDouble();
        System.out.println("digite seu 2 salario:");
            salario[1] = scanner.nextDouble();
        System.out.println("digite seu 3 salario:");
            salario[2] = scanner.nextDouble();

        Funcionario funcionarioUm = new Funcionario(nome, cargo, idade, salario);
        
        funcionarioUm.Apresentarse();

        System.out.println("A sua media salarial é: "+funcionarioUm.calcularMedia());
        
        

    }   
}
