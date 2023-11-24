public static void main(String[] args) {
    Banco banco = new Banco();
    Scanner scanner = new Scanner(System.on);

    System.out.println("[1]Abertura Conta\n[2]Login\n[3]Sair");
    int opcao = input.nextInt().charAt(0);

    switch(opcao){
        case 1:
            banco.realizarAberturaConta();
        case 2:
            banco.realizarLogin();
        default:
            break;
    }

    banco.realizarAberturaConta();
}