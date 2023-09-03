// The main method must be in a class named "Main".
class Calculadoramedia {
    public static void main(String[] args) {

        float[][] notas = {
            {8.0f, 9.0f, 8.6f, 9.2f, 7.0f}, 
            {7.1f, 6.0f, 7.2f, 5.2f, 7.4f}  
        };

        float[] medias = new float[2]; // Assumindo que há sempre duas matérias

        for (int materia = 0; materia < 2; materia++) {
            float somaNotas = 0.0f;
            int numeroDeNotas = notas[materia].length; // Obtém o número de notas na matéria

            for (int nota = 0; nota < numeroDeNotas; nota++) {
                somaNotas += notas[materia][nota];
            }

            medias[materia] = somaNotas / numeroDeNotas;
        }

        for (int materia = 0; materia < 2; materia++) {
            System.out.println("Média em " + (materia == 0 ? "BigData" : "Lógica") + ": " + medias[materia]);
        }
    }
} 