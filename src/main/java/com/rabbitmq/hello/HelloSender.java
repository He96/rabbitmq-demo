package com.rabbitmq.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发布消息
     */
    public void send(String sendInfo) {
        System.out.println("发布消息：" + sendInfo);
        this.rabbitTemplate.convertAndSend("helloQueue", sendInfo);
    }
}
