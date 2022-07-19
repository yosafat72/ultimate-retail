package com.yohesu.ultimate_retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class UltimateRetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(UltimateRetailApplication.class, args);
    }

}
