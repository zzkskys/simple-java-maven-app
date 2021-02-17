package com.mycompany.app;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HelloController {

    private final HelloProperties helloProperties;

    @GetMapping
    public String hello() {
        return "你好 " + helloProperties.getName() + " !";
    }


}
