package Sandro_Matheus_Ramos.segundobimestre.aula01;

import Sandro_Matheus_Ramos.segundobimestre.Pedido;

public class Main {
    public static void main(String[] args) {

        // Caixa<String> cxStr = new Caixa<>("32d");

        // System.out.println(cxStr.getValor());
        Pedido pedido = new Pedido();

        pedido.setDescricao("Testa bala");
        pedido.setId(123);
        pedido.setStatus(EnumStatusPedido.AGUARDANDO_PAGAMENTO);

        switch (pedido.getStatus()) {
            case AGUARDANDO_PAGAMENTO:
                // codigo
                break;
            case AGUARDANDO_FATURAMENTO:
                // codigo
                break;

            default:
                break;
        }

        System.out.println(pedido.toString());

    }
}
