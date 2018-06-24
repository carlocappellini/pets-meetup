package com.chingu.petmeetups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PetmeetupsApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PetmeetupsApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PetmeetupsApplication.class);
    }
}
