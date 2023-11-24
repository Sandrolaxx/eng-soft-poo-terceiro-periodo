
package aula06;
public class Main{
    public static void  main(String[]args){
        Ninja primeiroNinja = new Ninja();
        primeiroNinja.nome = "Naruto";
        primeiroNinja.idade = 16;
        primeiroNinja.aldeia = "Folha";
        primeiroNinja.equipamento = "Shuriken";
        primeiroNinja.cla = "Usumaki";
        primeiroNinja.nomeJutso = "rasengan";

      Ninja segundoNinja = new Ninja("felipe",21,"cu");
        primeiroNinja.nome = "Sasuke";
        primeiroNinja.idade = 16;
        primeiroNinja.aldeia = "Folha";
        primeiroNinja.equipamento = "Shuriken";
        primeiroNinja.cla = "Uchiha";
        primeiroNinja.nomeJutso = "Chidori";

        primeiroNinja.apresentarse();
        primeiroNinja.realisarJutso();
        segundoNinja.apresentarse();
        segundoNinja.realisarJutso();

    }

}