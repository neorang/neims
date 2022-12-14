package com.neorang.neims.users.domain;

import com.neorang.neims.globals.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Token extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @NotNull
    private LocalDateTime issueDate;

    @NotNull
    private LocalDateTime endDate;
}
