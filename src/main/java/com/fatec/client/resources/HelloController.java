package com.fatec.client.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello") //GetMapping é o nome do endpoint
    public String hello() {
        return "Meu primeiro endpoint em Java!!!";
    }

}
