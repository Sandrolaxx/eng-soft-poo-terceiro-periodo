package Felipe_Diniz.calculadoramedia;

class Teste {
    public static void main(String[] args) {
        double[][] notas = {
                { 8.0, 9.0, 8.6, 9.2, 7.0 },
                { 7.1, 6.0, 7.2, 5.2, 7.4 }
        };
        double big = 0.0;
        double logica = 0.0;
        for (int i = 0; i < notas[0].length; i++) {

            big += notas[0][i];

        }
        ;
        for (int i = 0; i < notas[1].length; i++) {
            logica += notas[1][i];
        }
        ;
        double mediabig = big / notas[0].length;
        double medialogica = big / notas[1].length;
        System.out.println("Média de BigData: " + mediabig);
        System.out.println("Média de Lógica de Programação: " + medialogica);

    };
}
