package com.javatechie;

import com.javatechie.dto.PaymentRequest;
import com.javatechie.producer.PaytmProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
@RestController
public class RedisPubsubExampleApplication {

    @Autowired
    private PaytmProducer producer;

	@PostMapping("/redis/pay")
    public String doUPIPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentRequest.setTransactionId(UUID.randomUUID().toString());
        paymentRequest.setTxDate(new Date());
        return producer.doTransaction(paymentRequest);
    }

    public static void main(String[] args) {
        SpringApplication.run(RedisPubsubExampleApplication.class, args);
    }

}
