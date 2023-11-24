package Sandro_Matheus_Ramos.segundobimestre.aula01;

public class Caixa<T> {
    
    private T valor;

    public Caixa(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

}
