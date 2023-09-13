package com.api.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiFuncionarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiFuncionarioApplication.class, args);
    }

    @GetMapping("/")
    public String teste() {
        return "Hello World!!!!";
    }
}
