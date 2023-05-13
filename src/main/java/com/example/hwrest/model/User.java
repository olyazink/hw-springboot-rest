package com.example.hwrest.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class User {
    private final String name;
    private final String password;
    private final List<Authorities> authorities;

    public User (String name, String password, List<Authorities> authorities) {
        this.name = name;
        this.password = password;
        this.authorities = authorities;
    }
}