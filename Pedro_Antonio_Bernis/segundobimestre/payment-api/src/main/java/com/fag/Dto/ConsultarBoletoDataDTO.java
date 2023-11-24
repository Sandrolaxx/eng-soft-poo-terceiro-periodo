package com.fag.Dto;

public class ConsultarBoletoDataDTO {
    
    private String digitable;
    private String barCode;
    private Double value;

    public String getDigitable(){
        return digitable;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setDigitable(String digitable){
        this.digitable = digitable;
    }

    public String getBarCode(){
        return barCode;
    }

    public void setBarCode(String barCode){
        this.barCode = barCode;
    }

}
