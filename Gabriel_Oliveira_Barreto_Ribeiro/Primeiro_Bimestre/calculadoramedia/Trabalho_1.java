package Gabriel_Oliveira_Barreto_Ribeiro.calculadoramedia;
public class Trabalho_1 {
    public static void main(String[] args) {
        double[] notasBigData = {8.0, 9.0, 8.6, 9.2, 7.0};
        double[] notasLogica = {7.1, 6.0, 7.2, 5.2, 7.4};

        double mediaBigData = calcularMedia(notasBigData);
        double mediaLogica = calcularMedia(notasLogica);

        System.out.printf("Média das notas em BigData: %.2f%n", mediaBigData);
        System.out.printf("Média das notas em Logica: %.2f%n", mediaLogica);
        
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma/notas.length;
    }
}
