package aula06;

public class Ninja {
    int idade;
    String nome;
    String aldeia;
    String cla;
    String equipamento;
    String nomeJutso;

    public Ninja(String nome, int idade, String aldeia){
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
    
    public Ninja(){}

    void apresentarse(){
        System.out.println("Sou o ninja ".concat(nome).concat(" do clã ").concat(cla));
    }

    void realizarJutso(){
        System.out.println(nome.concat(" realizando jutso ").concat(nomeJutso));
    }
}
