package com.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private Integer age;
}
