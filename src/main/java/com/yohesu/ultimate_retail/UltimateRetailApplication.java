package com.yohesu.ultimate_retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UltimateRetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(UltimateRetailApplication.class, args);
    }

}
