package Ana_Lunedo.calculadoramedia;

public class CalculadoraMedia {
    public static void main(String[] args) {
        float[][] notas = {
                { 8.0f, 9.0f, 8.6f, 9.2f, 7.0f }, // Notas de BigData
                { 7.1f, 6.0f, 7.2f, 5.2f, 7.4f } // Notas de Lógica de Programação
        };

        float mediaBigData = calcularMedia(notas[0]);
        float mediaLogica = calcularMedia(notas[1]);

        System.out.println("Média em BigData: " + mediaBigData);
        System.out.println("Média em Lógica de Programação: " + mediaLogica);
    }

    public static float calcularMedia(float[] notas) {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    
}