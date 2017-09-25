package com.zakahmed;

import com.zakahmed.dao.GundamModelKitRepository;
import com.zakahmed.service.GundamModelKitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by zahmed on 9/23/17.
 */
@SpringBootApplication
@EnableJpaRepositories
public class GundamModelKitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GundamModelKitApplication.class, args);
    }

//    @Autowired
//    private GundamModelKitService gundamModelKitService;
//
//    @Autowired
//    private GundamModelKitRepository gundamModelKitRepository;
}
