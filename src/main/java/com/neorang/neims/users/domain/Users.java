package com.neorang.neims.users.domain;

import com.neorang.neims.globals.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Builder
    public Users(String userId, String userName, String password, Role role, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.email = email;
    }
}
