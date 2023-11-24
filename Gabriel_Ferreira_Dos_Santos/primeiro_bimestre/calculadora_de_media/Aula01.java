package calculadora_de_media;


public class Aula01 {
    public static void main(String[] args) {
        System.out.println("teste");
        //int[] anArray = new int [10];
        /*int[] anArray2 = new int []{3, 1, 3, 4, 5};
        System.out.println(anArray2[2]);

        int[][] anMultiArray = new int [][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(anMultiArray[1][1]);*/
        float mediaBigData;
        float mediaLogica;

        float[][] notas = new float [][]{{8.0f, 9.0f, 8.6f, 9.2f, 7.0f},{7.1f, 6.0f, 7.2f, 5.2f, 7.4f}};
        System.out.println((notas[0][0])+(notas[0][1])+(notas[0][2])+(notas[0][3])+(notas[0][4]));
        System.out.println((notas[1][0])+(notas[1][1])+(notas[1][2])+(notas[1][3])+(notas[1][4]));

        mediaBigData = ((notas[0][0])+(notas[0][1])+(notas[0][2])+(notas[0][3])+(notas[0][4]));
        mediaLogica = ((notas[1][0])+(notas[1][1])+(notas[1][2])+(notas[1][3])+(notas[1][4]));

        System.out.println(mediaBigData/5);
        System.out.println(mediaLogica/5);






    }
}