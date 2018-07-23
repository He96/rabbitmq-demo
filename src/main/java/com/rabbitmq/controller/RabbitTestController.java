package com.rabbitmq.controller;

import com.rabbitmq.hello.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {
    @Autowired
    private HelloSender helloSender;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void hello(){
        String sendInfo = "Hello " + new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());
        helloSender.send(sendInfo);
    }
}
