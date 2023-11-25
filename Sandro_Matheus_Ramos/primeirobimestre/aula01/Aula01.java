package Sandro_Matheus_Ramos.aula01;

public class Aula01 {
    public static void main(String[] args) {

        byte testeByte = 127;
        byte semInstanciar;// Sem inicializar não funciona

        // Inteiros
        System.out.println("Exemplo byte: " + testeByte);

        System.out.println("\n--------------------------------------\n");
        short testeShort = 3232;
        System.out.println("Exemplo short: " + testeShort);

        System.out.println("\n--------------------------------------\n");
        int testeInt = 123123;
        System.out.println("Exemplo int: " + testeInt);

        System.out.println("\n--------------------------------------\n");
        long testeLong = 23423423232323l;
        System.out.println("Exemplo long: " + testeLong);

        // Decimais
        System.out.println("\n--------------------------------------\n");
        float testeFloat = 23.40f;
        System.out.println("Exemplo float: " + testeFloat);

        System.out.println("\n--------------------------------------\n");
        double testeDouble = 243.402323;
        System.out.println("Exemplo double: " + testeDouble);

        // char
        System.out.println("\n--------------------------------------\n");
        char testeChar = 'C';
        char testeChar2 = 67;
        System.out.println("Exemplo char: " + testeChar);
        System.out.println("Exemplo char 2: " + testeChar2);

        // boolean
        System.out.println("\n--------------------------------------\n");
        boolean pegarDp = false;
        System.out.println("Exemplo boolean: " + pegarDp);

        int[][] matrizBala = new int[][] { { 23, 32 }, { 45, 11 } };
    }
}