package Gabriel_José.calculadoramedia;

public class CalculadoraMediaEncapsulamento {
    private float[][] notas;

    public CalculadoraMediaEncapsulamento(float[][] notas) {
        this.notas = notas;
    }

    public float[] calcularMedias() {
        float[] medias = new float[notas.length];

        for (int i = 0; i < notas.length; i++) {
            float soma = 0.0f;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }

        return medias;
    }

    public static void main(String[] args) {
        float[][] notas = {
            {8.0f, 9.0f, 8.6f, 9.2f, 7.0f},
            {7.1f, 6.0f, 7.2f, 5.2f, 7.4f}
        };

        CalculadoraMediaEncapsulamento calculadora = new CalculadoraMediaEncapsulamento(notas);
        float[] medias = calculadora.calcularMedias();

        for (int i = 0; i < medias.length; i++) {
            System.out.println("A " + (i + 1) + "ª média é: " + medias[i]);
        }
    }
}
