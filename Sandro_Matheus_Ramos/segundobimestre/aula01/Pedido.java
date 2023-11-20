package Sandro_Matheus_Ramos.segundobimestre;

import Sandro_Matheus_Ramos.segundobimestre.aula01.EnumStatusPedido;

public class Pedido {

    private Integer id;

    private String descricao;

    private EnumStatusPedido status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EnumStatusPedido getStatus() {
        return status;
    }

    public void setStatus(EnumStatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [descricao=" + descricao + ", status=" + status + "]";
    }

}
