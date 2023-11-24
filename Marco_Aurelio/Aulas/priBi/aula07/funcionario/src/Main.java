import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        String cargo = "";
        double[] salario = new double[3];

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Seu cargo: ");
        cargo = scanner.nextLine();

        System.out.println("Seus ultimos 3 salarios: ");
        salario[0] = scanner.nextDouble();
        salario[1] = scanner.nextDouble();
        salario[2] = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, cargo, salario);

        double mediaSalario = funcionario.mediaSal();
        String salFormatado = String.format("%.2f", mediaSalario);

        System.out.println("");

        funcionario.apresentarse();
        System.out.println("Media dos salarios: " + salFormatado);
        
        scanner.close();
    }
}