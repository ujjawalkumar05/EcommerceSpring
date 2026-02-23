package com.example.ecommercespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// start annotation @SpringBootApplication// = @Configuration//+ @EnableAutoConfiguration  // + @ComponentScan
        //entry gate hai springboot project ka ..main function k uper likha jata hai
public class EcommerceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSpringApplication.class, args);
    }

}
