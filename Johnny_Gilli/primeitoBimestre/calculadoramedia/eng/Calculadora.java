package calculadoramedia.eng;

public class Calculadora {
    public static void main(String[] args) {
    float[][] notas = {{8.0f, 9.0f, 8.6f, 9.2f, 7.0f}, {7.1f, 6.0f, 7.2f, 5.2f, 7.4f}};
    float nota00 = 0.0f;
    float nota01 = 0.0f;
        for(int i = 0;i <= 4; i++){
            nota00 += notas[0][i];
            nota01 += notas[1][i];
        };
        System.out.println("A 1° media é: "+(nota00/5));
        System.out.println("A 2° media é: "+(nota01/5));
    }
}
