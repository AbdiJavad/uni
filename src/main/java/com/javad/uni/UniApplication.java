package com.javad.uni;

import com.javad.uni.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UniApplication {


    public static void main(String[] args) {
        SpringApplication.run(UniApplication.class, args);
        User user = new User();
        User user1 = User
                .builder()
                .id(1L)
                .username("Ali")
                .password("1234")
                .build();


    }

}
