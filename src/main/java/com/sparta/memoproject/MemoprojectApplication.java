package com.sparta.memoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Auditing 기능 활성화
@EnableJpaAuditing
@SpringBootApplication
public class MemoprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoprojectApplication.class, args);
    }

}
