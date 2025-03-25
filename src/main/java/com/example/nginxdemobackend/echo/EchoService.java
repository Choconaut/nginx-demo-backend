package com.example.nginxdemobackend.echo;

import org.springframework.stereotype.Service;

@Service
public class EchoService {

    public Message echo(Message message) {
        message.setMessage("Echo: " + message.getMessage());
        return message;
    }
}
