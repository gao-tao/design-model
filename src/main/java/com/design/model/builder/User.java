package com.design.model.builder;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class User {

    private int age;

    private String userName;

    private String password;

}
