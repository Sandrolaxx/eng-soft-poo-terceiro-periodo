package com.fag.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class ConsultaBoletoDTO {
    
    @JsonbProperty("barCode")
    private ConsultaBoletoDTO data;

    @JsonbProperty("billData")
    private ConsultResponseDTO bill;

    private Long transactionIdAuthorize;

    private String cpfCnpj;

    private String dueDate;

    public ConsultaBoletoDTO getData() {
        return data;
    }

    public ConsultResponseDTO getBill() {
        return bill;
    }

    public Long getTransactionIdAuthorize() {
        return transactionIdAuthorize;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setData(ConsultaBoletoDTO data) {
        this.data = data;
    }

    public void setBill(ConsultResponseDTO bill) {
        this.bill = bill;
    }

    public void setTransactionIdAuthorize(Long transactionIdAuthorize) {
        this.transactionIdAuthorize = transactionIdAuthorize;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
