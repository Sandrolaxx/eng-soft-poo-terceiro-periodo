package calculadora2;
import java.util.Scanner;

class Calculadora {
    public float calcularMedia(float[] notas) {
        float soma = 0.0f;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de notas:");
        int numeroDeNotas = scanner.nextInt();

        float[] notas = new float[numeroDeNotas];
        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextFloat();
        }

        Calculadora calculadora = new Calculadora();
        float media = calculadora.calcularMedia(notas);

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
