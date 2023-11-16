package com.javad.uni.model;

import jdk.nashorn.internal.runtime.Debug;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Entity;

@Data
@Entity
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)


    private long Id;
    private String username;
    private String password;

    public User() {
    }
}

