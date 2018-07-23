package com.rabbitmq.hello;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("订阅新消息:" + hello);
    }
}
