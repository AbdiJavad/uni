package com.javad.uni;

import com.javad.uni.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniApplication {

    public static void main(String[] args) {
        User user = new User();
        User user1 = User
                .builder()
                .id(1L)
                .username("ali")
                .password("1223")
                .builder;

    }

}
