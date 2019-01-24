package com.example;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScHsfConsumerApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(ScHsfConsumerApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}
