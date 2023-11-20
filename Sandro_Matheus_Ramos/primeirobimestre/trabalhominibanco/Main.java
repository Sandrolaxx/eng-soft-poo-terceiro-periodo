package Sandro_Matheus_Ramos.trabalhominibanco;

import Sandro_Matheus_Ramos.trabalhominibanco.domain.BancoService;

public class Main {
    public static void main(String[] args) {
        BancoService service = new BancoService();
        
        service.apresentarMenuInicial();
    }
}
