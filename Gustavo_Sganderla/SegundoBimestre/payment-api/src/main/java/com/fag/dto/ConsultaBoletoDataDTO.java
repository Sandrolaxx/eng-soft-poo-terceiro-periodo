package com.fag.dto;

public class ConsultaBoletoDataDTO {
    
private String digitable;
private String barCode;
private Double value;

public String getBarCode() {
    return barCode;
}

public Double getValue() {
    return value;
}

public String getDigitable(){
    return digitable;
}

public void setDigitable(String digitable) {
    this.digitable = digitable;
}

public void setBarCode(String barCode) {
    this.barCode = barCode;
}

public void setValue(Double value) {
    this.value = value;
}

}
