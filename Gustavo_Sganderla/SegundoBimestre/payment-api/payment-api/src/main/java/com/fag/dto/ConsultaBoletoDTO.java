package com.fag.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class ConsultaBoletoDTO {
    @JsonbProperty("BarCode")
    private ConsultaBoletoDTO data;

    @JsonbProperty("billData")
    private ConsultaBoletoDTO bill;

    private Long transactionIdauthorize;

    private cpfCnpj;

    private dueData;
    
    public ConsultaBoletoDTO getData(){
        return data;
    }
    
    public void setBill(ConsultaBoletoDTO data){
        this.data = data;
    }

    public ConsultaBoletoDTO getBill(){
        return bill;
    }

    public void setBill(ConsultaBoletoDTO bill){
        this.bill = bill;
    }

    public long getTransactionIdAuthorize(){
        return transactionIdauthorize;
    }

    public void setTransactionIdAuthorize(long transactionIdauthorize){
        this.transactionIdauthorize = transactionIdauthorize;
    }

    public String getCpfCnpj(){
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

}
