package Gabriel_Wrubel.Trabalhos.calculadoramedia;

public class CalculadoraMedia {
    public static void main(String[] args) {
        double [][] notas = new double[][] {{8.0,9.0,8.6,9.2, 7.0} , {7.1, 6.0, 7.2, 5.2, 7.4}};
        double mediaBigdata = 0;   
        double mediaLogica = 0;

        for(int i = 0;i < 5;i++){
            mediaBigdata += notas[0][i];
            mediaLogica += notas[1][i];
          
        }
            System.out.println("A média de bigdata é: "+mediaBigdata/5);
            System.out.println("A média de logica é: "+mediaLogica/5);
    }
    
}
