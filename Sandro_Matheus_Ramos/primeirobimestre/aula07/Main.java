package Sandro_Matheus_Ramos.aula07;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua 123", "23423423");
        Professor professor1 = new Professor("Roberto", "POO");
        Professor professor2 = new Professor("Clebim", "Projetos");

        Professor[] professores = new Professor[] { professor1, professor2 };

        Escola escola = new Escola("Escola braba", endereco, professores);

        escola.toString();
    }

}
