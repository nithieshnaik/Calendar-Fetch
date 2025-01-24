package com.Nithiesh.GoogleOauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.Nithiesh.GoogleOauth2", "Controller", "Service"})
public class GoogleOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(GoogleOauth2Application.class, args);
    }

}
