package com.neorang.neims.users.domain;

import com.neorang.neims.globals.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Users extends BaseEntity {
    @Id
    private String userId;

    @NotNull
    @Size(max = 50)
    private String userName;

    @NotNull
    @Size(max = 100)
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @NotNull
    @Size(max = 100)
    private String email;

    public Users() {
    }
}
