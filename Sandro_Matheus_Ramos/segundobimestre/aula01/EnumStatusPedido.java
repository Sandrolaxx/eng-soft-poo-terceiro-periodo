package Sandro_Matheus_Ramos.segundobimestre.aula01;

public enum EnumStatusPedido {
    
    AGUARDANDO_PAGAMENTO("AGUARDANDO_PAGAMENTO"),
    AGUARDANDO_FATURAMENTO("AGUARDANDO_FATURAMENTO");

    private String key;
    
    EnumStatusPedido(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
