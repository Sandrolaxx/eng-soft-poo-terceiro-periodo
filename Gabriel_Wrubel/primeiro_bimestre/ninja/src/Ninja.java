public class Ninja {

     String nome;

     int idade;

     String aldeia;

     String cla;

     String equipamento;

     String nomeJutso;

    void apresentarse(){
        System.out.println("Sou ninja ".concat(nome).concat(" do clã ").concat(cla));
    }

    void realizarJutso(){
        System.out.println(nome.concat(" realizar jutso ").concat(nomeJutso));
    }


    
}
