package com.fag.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKT_PAYMENT")
public class Payment  extends PanacheEntityBase{
    

        @Id
        @Column(name = "ID")
        private UUID id;


        
        @Column(name = "RECEIPT", length = 4000)
        private String receipt;

        
        @Column(name = "DIGITABLE")
        private String digitable;
        public UUID getId() {
            return id;
        }
        
        
        @Column(name = "AMMOUT")
        private Double ammout;

        @CreationTimestamp
        private LocalDateTime createdAt;

        public void setId(UUID id) {
            this.id = id;
        }

        public String getReceipt() {
            return receipt;
        }

        public void setReceipt(String receipt) {
            this.receipt = receipt;
        }

        public String getDigitable() {
            return digitable;
        }

        public void setDigitable(String digitable) {
            this.digitable = digitable;
        }

        public Double getAmmout() {
            return ammout;
        }

        public void setAmmout(Double ammout) {
            this.ammout = ammout;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

      
        
        

}
