package com.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@ToString

@Component
public class User {
    private String fullName;
    private String Address;
    private Integer age;

    public void testPersonMethod() {
        System.out.println("User");
    }

    public User() {
        System.out.println("User Do Bean");
    }
}
