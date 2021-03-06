package com.mycompany.app;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HelloController {

    private final HelloProperties helloProperties;

    @GetMapping
    public String hello() {
        return "您好 " + helloProperties.getName() + ", 欢迎您的访问,现在时间是 : " + LocalDateTime.now() + " !";
    }


}
