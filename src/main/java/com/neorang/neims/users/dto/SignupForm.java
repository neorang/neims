package com.neorang.neims.users.dto;

import com.neorang.neims.users.domain.Users;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignupForm {

    private String userId;
    private String userName;
    private String password;
    private String email;

    public Users toEntity(){
        return Users.builder().userId(userId)
                .userName(userName)
                .email(email)
                .build();
    }

}
