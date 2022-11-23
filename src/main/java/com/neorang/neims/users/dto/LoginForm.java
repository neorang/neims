package com.neorang.neims.users.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginForm {

    private String userId;
    private String password;

}
