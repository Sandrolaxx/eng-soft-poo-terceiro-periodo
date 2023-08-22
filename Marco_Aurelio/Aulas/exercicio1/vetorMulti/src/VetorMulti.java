public class VetorMulti {

    public static void main(String[] args) {
        double[][] x = {
                { 8.0, 9.0, 8.6, 9.2, 7.0 },
                { 7.1, 6.0, 7.2, 5.2, 7.4 }
        };
        String[] materias = { "BigData", "Logica " };

        double notaBD = 0;
        double notaLog = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.print("Notas " + materias[i] + "= ");
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " | ");
                if (i == 0) {
                    notaBD += x[i][j];
                } else {
                    notaLog += x[i][j];
                }
            }
            System.out.println("");
        }
        notaBD = notaBD / x[0].length;
        notaLog = notaLog / x[1].length;

        System.out.println("\nMédia da turma em BigData = " + notaBD);
        System.out.println("Média da turma em Logica = " + notaLog);

    }
}