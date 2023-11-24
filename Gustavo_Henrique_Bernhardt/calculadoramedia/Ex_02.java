package Gustavo_Henrique_Bernhardt.calculadoramedia;
class Ex_02 {
    public static void main(String[] args) {
        double arrayNotas[][] = new double[][]{{8.0,7.1},{9.0,6.0},{8.6,7.2},{9.2,5.2},{7.0,7.4}};
        
    double bigData = 0.0;
    double logica = 0.0;
        
    for(int i = 0; i < arrayNotas.length;i++){
            bigData = bigData + arrayNotas[i][0];
            logica = logica + arrayNotas[i][1];
    }
    
    double mediaBigData = bigData / arrayNotas.length;
    double mediaLogica = logica / arrayNotas.length;
        
    System.out.println("A media da materia Big Data e " + mediaBigData);
    System.out.println("A media da materia Logica e " + mediaLogica);
    }
}
