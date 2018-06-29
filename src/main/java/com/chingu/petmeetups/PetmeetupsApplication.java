package com.chingu.petmeetups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class })
public class PetmeetupsApplication  {
    public static void main(String[] args) {
        SpringApplication.run(PetmeetupsApplication.class, args);
    }


}
