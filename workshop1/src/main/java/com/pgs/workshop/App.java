package com.pgs.workshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by Luke on 2017-03-24.
 */
@SpringBootApplication
@RestController
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        SpringApplication.run(App.class);

        System.out.println("Hello world!");

        LOGGER.error("Error");
        LOGGER.warn("Warn");
        LOGGER.info("Info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }


    @RequestMapping(path = "/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            container.setPort(8989);
        });
    }
}
