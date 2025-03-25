package com.example.nginxdemobackend.echo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.endpoint.baseurl}")
public class EchoController {
    private final EchoService echoService;

    public EchoController(EchoService echoService) {
        this.echoService = echoService;
    }

    @PostMapping("/echo")
    public Message echo(@Valid @RequestBody Message message) {
        return echoService.echo(message);
    }
}
