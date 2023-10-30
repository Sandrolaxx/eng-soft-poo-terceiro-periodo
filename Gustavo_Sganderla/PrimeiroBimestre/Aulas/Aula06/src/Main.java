public class Main {
    public static void main(String[] args) throws Exception {
        Ninja primeiroNinja = new Ninja();
        Ninja segundoNinja = new Ninja();

        primeiroNinja.nome = "Zabuza";
        primeiroNinja.idade = 24;
        primeiroNinja.aldeia = "Nevoa";
        primeiroNinja.cla = "Bolada no queixo";
        primeiroNinja.nomeJustso = " Edo Tensei ";

        primeiroNinja.nome = "Gaara";
        primeiroNinja.idade = 20;
        primeiroNinja.aldeia = "Areia";
        primeiroNinja.cla = "Os tres boqueteiros";
        primeiroNinja.nomeJustso = " Shinra Tensei ";

        primeiroNinja.apresentaese();
        segundoNinja.apresentaese();

        primeiroNinja.realizarJutso();
        segundoNinja.realizarJutso();

    }
}
