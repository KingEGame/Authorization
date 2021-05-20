package com.junior.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class, AnotherClassConfigToExclude.class})
public class SpringCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApplication.class, args);
    }

}
