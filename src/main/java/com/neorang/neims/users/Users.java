package com.neorang.neims.users;

import com.neorang.neims.globals.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    @Size(max = 50)
    private String userName;

    @NotNull
    @Size(max = 100)
    private String password;

    @NotNull
    private Role role;

    @NotNull
    @Size(max = 100)
    private String email;

    public Users() {
    }
}
