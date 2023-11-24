package Sandro_Matheus_Ramos.aula06;

public class Main {

    public static void main(String[] args) {

        // Ninja primeiroNinja = new Ninja("Sandrolax", 24, "Clone das sombras");

        // System.out.println(primeiroNinja.getNome());
        // System.out.println(primeiroNinja.getIdade());

        // primeiroNinja.fazerAniversario();

        // System.out.println(primeiroNinja.getIdade());

        // primeiroNinja.setAldeia("Folha");

        AlunoNinja alunoUm = new AlunoNinja("Sandroalax", 24, "Folha", "Time 07", "Kakashi");
        Hokage hokage = new Hokage("Naruto", 24, "Folha", 23);

        alunoUm.realizarJutso();
        hokage.realizarJutso();
    }
}
