package com.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Person {
    private String fullName;
    private String Address;
    private Integer age;
    public void testPersonMethod(){
        System.out.println("Person");
    }
    public Person(){
        System.out.println("Person Do Bean");
    }
}
