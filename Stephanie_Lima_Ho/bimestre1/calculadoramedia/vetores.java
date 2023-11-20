package Stephanie_Lima_Ho.calculadoramedia;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

    double[][] notas = new double[][] {{8.0, 9.0, 8.6,9.2,7.0}, {7.1,6.0,7.2,5.2,7.4}};
    double somaBigData = 0;
    double somaLogica = 0;
    double mediaBigData = 0;
    double mediaLogica = 0;
    
    for(int i = 0; i <= 4; i++){
        somaBigData = somaBigData + notas[0][i];
        somaLogica = somaLogica + notas[1][i];
    }
    
    mediaBigData = somaBigData/5;
    mediaLogica = somaLogica/5;
    
    System.out.println("[MÉDIA] Big Data: " + mediaBigData);
    System.out.println("[MÉDIA] Lógica: " + mediaLogica);
    
}
}
