package com.bitsevn.azure.app.service.greeter.war;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("greeter")
public class GreeterServiceWarController {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");

    @GetMapping()
    public String hello() {
        System.out.println("[greeter] [controller] [hello] saying hello");
        return "Hello";
    }

    @GetMapping("now")
    public String helloNow() {
        String helloNow = "hello - " + DTF.format(LocalDateTime.now());
        System.out.println("[greeter] [controller] [hello-now] saying " + helloNow);
        return helloNow;
    }
}
