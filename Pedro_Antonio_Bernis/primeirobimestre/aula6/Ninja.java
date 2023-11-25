package aula6;

public class Ninja {

    String nome;

    int idade;

    String aldeia;

    String cla;

    String equipamento;

    String nomeJutso;
    

    void apresentarse() {
        System.out.println("Sou o ninja ".concat(nome).concat(" do clã ").concat(cla));
    }

    void reslizarJutso() {
        System.out.println(nome.concat(" realizando jutsu ").concat(nomeJutso));
    }

}
