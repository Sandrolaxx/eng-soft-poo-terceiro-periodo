package com.fag.dto;

public class ConsultaBoletoDataDTO {
    
    private String digitable;

    private String barCode;

    private Double value;

    public String getDigitable(){
        return digitable;
    }

    public void getDigitable(String digitable){
        this.digitable = digitable;
    }

    public String getBarCode(){
        return barCode;
    }

    public void setCode(String barCode){
        this.barCode = barCode;
    }

    public Double getValue(){
        return value;
    }

    public void setValue(Double value){
        this.value = value;
    }
}
