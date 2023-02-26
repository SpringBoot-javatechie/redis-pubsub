package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

    private String transactionId;
    private String srcAc;
    private String destAc;
    private double amount;
    private Date txDate;
}
