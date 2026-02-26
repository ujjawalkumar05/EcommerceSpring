package com.example.ecommercespring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// start annotation @SpringBootApplication// = @Configuration//+ @EnableAutoConfiguration  // + @ComponentScan
        //entry gate hai springboot project ka ..main function k uper likha jata hai
public class EcommerceSpringApplication {

    public static void main(String[] args) {
        Dotenv dotenv=Dotenv.configure().load();//ye .env file ko load krega rootpath se
        dotenv.entries().forEach( entry  -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(EcommerceSpringApplication.class, args);
    }

}
