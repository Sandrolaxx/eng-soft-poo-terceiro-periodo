public class Main {
    public static void main(String[] args) {
        Ninja primeiroNinja = new Ninja();
        Ninja segundoNinja = new Ninja();

            primeiroNinja.nome = "Gabriel";
            primeiroNinja.idade = 23;
            primeiroNinja.aldeia = "folha";
            primeiroNinja.cla = "Wrubel";
            primeiroNinja.nomeJutso = "Rassengan";

            primeiroNinja.apresentarse();

             
            segundoNinja.nome = "jao";
            segundoNinja.idade = 25;
            segundoNinja.aldeia = "Nevoa";
            segundoNinja.cla = "Uzumaki";
            segundoNinja.nomeJutso = "clone";

            segundoNinja.apresentarse();
    }
           

}
