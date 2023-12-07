package com.tobeto.springProject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Lombok getter ve setterlerı anatation olarak yazdığımızda kod kalabalığını önlüyor.
@Setter
@AllArgsConstructor // tüm argümanlı olan ctor
@NoArgsConstructor // 0 argümanlı ctor
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;

}
