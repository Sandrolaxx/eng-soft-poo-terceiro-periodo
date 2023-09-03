public class Atividade {
    public static void main(String[] args) {
        double[][] notas = {
                { 8.0, 9.0, 8.6, 9.2, 7.0 },
                { 7.1, 6.0, 7.2, 5.2, 7.4 }
        };

        double[] medias = new double[2];
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }

        System.out.println("Média da turma em BigData: " + medias[0]);
        System.out.println("Média da turma em Lógica de Programação: " + medias[1]);
    }
}
