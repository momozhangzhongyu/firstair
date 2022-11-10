package com.firstair;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.firstair.mapper")
public class FaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaWebApplication.class, args);
    }

}
