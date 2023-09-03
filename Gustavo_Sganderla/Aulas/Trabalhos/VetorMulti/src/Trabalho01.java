public class Trabalho01 {
    public static void main(String[] args) throws Exception {
        double[][] notas = {
            {8.0, 9.0, 8.6, 9.2, 7.0},
            {7.1, 6.0, 7.2, 5.2, 7.4},
        };

        double mediaBigData = calcularMedia(notas[0]);
        double mediaLogica = calcularMedia(notas[1]);

        System.out.println("Média da turma em BigData: " + mediaBigData);
        System.out.println("Média da turma em Lógica de Programação: " + mediaLogica);
    }

        

        public static double calcularMedia(double[] notas) {
            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        
        }
    }

