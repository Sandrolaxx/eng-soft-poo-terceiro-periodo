package com.fag.Dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class ConsultarBoletoDTO {
    
@JsonbProperty("barCode")
private ConsultarBoletoDataDTO data;

@JsonbProperty("billData")
private ConsultarBoletoDataDTO bill;

private Long transactionIdAuthorize;
private String cpfCnpj;
private String dueDate;

public ConsultarBoletoDataDTO getBill() {
    return bill;
}

public void setBill(ConsultarBoletoDataDTO bill) {
    this.bill = bill;
}

public Long getTransactionIdAuthorize() {
    return transactionIdAuthorize;
}

public void setTransactionIdAuthorize(Long transactionIdAuthorize) {
    this.transactionIdAuthorize = transactionIdAuthorize;
}

public String getCpfCnpj() {
    return cpfCnpj;
}

public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
}

public String getDueDate() {
    return dueDate;
}

public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
}

public ConsultarBoletoDataDTO getData() {
    return data;
}

public void setData(ConsultarBoletoDataDTO data) {
    this.data = data;
}
}