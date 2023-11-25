package aula06;

public class Main {
    public static void main(String[] args) {
        
        Ninja primeiroNinja = new Ninja();//construtor padrão;

        primeiroNinja.nome = "Johnny";
        primeiroNinja.idade = 21;
        primeiroNinja.aldeia = "Cascavel";
        primeiroNinja.equipamento = "Olhar";
        primeiroNinja.cla = "Gili";
        primeiroNinja.nomeJutso = "Rasengan";

        Ninja segundoNinja = new Ninja("Paulo",10,"Meridiana");

        segundoNinja.nome = "Sasuke";
        segundoNinja.idade = 16;
        segundoNinja.aldeia = "Folha";
        segundoNinja.equipamento = "Shuriken";
        segundoNinja.cla = "Uchiha";
        segundoNinja.nomeJutso = "Chidori";
            
        primeiroNinja.apresentarse();
        primeiroNinja.realizarJutso();
        segundoNinja.apresentarse();
        segundoNinja.realizarJutso();
    }
}
