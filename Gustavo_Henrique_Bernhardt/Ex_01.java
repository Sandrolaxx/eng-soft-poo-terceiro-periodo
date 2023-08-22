import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Ex_01 {
    public static void main(String[] args) {
        
        byte testeByte = 127;
        System.out.println("------------------------------\n\n\n"+"O valor máximo do BYTE é: "+testeByte+"\n\n\n------------------------------");
        
        //byte semInicializar; //Se não declarar um valor para uma variável nesse estilo, não funciona.
        //System.out.println(semInicializar);
        
        short testeShort = 32767;
        System.out.println("------------------------------\n\n\n"+"O valor máximo do SHORT é: "+testeShort+"\n\n\n------------------------------");
        
        int testeInt = 2147483647;
        System.out.println("------------------------------\n\n\n"+"O valor máximo do INT é: "+testeInt+"\n\n\n------------------------------");
        
        long testeLong = 9223372036854775807l; //se não colocar o "L" para uma variável tipo LONG não vai funcionar.
        System.out.println("------------------------------\n\n\n"+"O valor máximo do LONG é: "+testeLong+"\n\n\n------------------------------");
        
        float testeFloat = 2.59f;
        System.out.println(testeFloat);
        
        char testeChar = 'C';
        char testeChar2 = 67;
        System.out.println("Exemplo char: "+testeChar);
        System.out.println("Exemplo char: "+testeChar2);
    }
}
