package com.neorang.neims.users.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignupForm {

    private String userId;
    private String userName;
    private String password;
    private String email;

}
