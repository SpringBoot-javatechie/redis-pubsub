package com.javatechie.consumer;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class PaytmClientApp implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("PaytmClientApp consumed events -> "+message);
    }
}
