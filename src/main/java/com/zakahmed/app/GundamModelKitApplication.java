package com.zakahmed.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zahmed on 9/23/17.
 */
@SpringBootApplication
@ComponentScan({
    "com.zakahmed.controller"
})
public class GundamModelKitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GundamModelKitApplication.class, args);
    }
}
