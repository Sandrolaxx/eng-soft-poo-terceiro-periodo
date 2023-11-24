package com.fag.dto;

import java.math.BigDecimal;

public class PaymentResponseDTO {
    
    private String convenant;

    private boolean isExpired;

    private BigDecimal authentication;

    private PaymentResponseDTO authenticationAPI;

    private ReceiptDTO receipt;

    private String settleDate;

    private String createDate;

    private BigDecimal transactionId;

    private String urlreceipt;

    private String errorCode;

    private String message;

    private String status;

    public String getConvenant() {
        return convenant;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public BigDecimal getAuthentication() {
        return authentication;
    }

    public PaymentResponseDTO getAuthenticationAPI() {
        return authenticationAPI;
    }

    public ReceiptDTO getReceipt() {
        return receipt;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public BigDecimal getTransactionId() {
        return transactionId;
    }

    public String getUrlreceipt() {
        return urlreceipt;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public void setConvenant(String convenant) {
        this.convenant = convenant;
    }

    public void setExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }

    public void setAuthentication(BigDecimal authentication) {
        this.authentication = authentication;
    }

    public void setAuthenticationAPI(PaymentResponseDTO authenticationAPI) {
        this.authenticationAPI = authenticationAPI;
    }

    public void setReceipt(ReceiptDTO receipt) {
        this.receipt = receipt;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setTransactionId(BigDecimal transactionId) {
        this.transactionId = transactionId;
    }

    public void setUrlreceipt(String urlreceipt) {
        this.urlreceipt = urlreceipt;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
